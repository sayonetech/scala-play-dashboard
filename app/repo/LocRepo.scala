package repo

import javax.inject.{Inject, Singleton}

import models.Location
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future

@Singleton()
class LocRepo @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends LocTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insert(loc: Location): Future[Int] = db.run { locTableQueryInc += loc }

  def insertAll(loc: List[Location]): Future[Seq[Int]] = db.run { locTableQueryInc ++= loc }

  def update(loc: Location): Future[Int] = db.run { locTableQuery.filter(_.id === loc.id).update(loc) }

  def delete(id: Int): Future[Int] = db.run { locTableQuery.filter(_.id === id).delete }

  def getAll(): Future[List[Location]] = db.run { locTableQuery.to[List].result }

  def getById(loc: Int): Future[Option[Location]] = db.run { locTableQuery.filter(_.id === loc).result.headOption }
  
  def ddl = locTableQuery.schema

}

private[repo] trait LocTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[LocTable] class LocTable(tag: Tag) extends Table[Location](tag, "Location") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val name: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200) NOT NULL"))
    val latitude: Rep[Double] = column[Double]("latitude", O.SqlType("decimal NOT NULL"))
    val longitude: Rep[Double] = column[Double]("longitude", O.SqlType("decimal NOT NULL"))
    val locType: Rep[String] = column[String]("locType", O.SqlType("VARCHAR(200)"))
    val image: Rep[String] = column[String]("image", O.SqlType("VARCHAR(200)"))
    val description: Rep[String] = column[String]("description", O.SqlType("VARCHAR(200)"))

    def * = (name, latitude, longitude, locType, image, description, id.?) <> (Location.tupled, Location.unapply)
  }

  lazy protected val locTableQuery = TableQuery[LocTable]

  lazy protected val locTableQueryInc = locTableQuery returning locTableQuery.map(_.id)

}

