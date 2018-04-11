package repo

import javax.inject.{ Inject, Singleton }
import models.Location
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future
import java.util.Date

@Singleton()
class LocationRepository @Inject() (protected val dbConfigProvider: DatabaseConfigProvider)
  extends LocationTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insert(loc: Location): Future[Int] = db.run { locTableQueryInc += loc }

  def insertAll(locs: List[Location]): Future[Seq[Int]] = db.run { locTableQueryInc ++= locs }

  def update(loc: Location): Future[Int] = db.run { locTableQuery.filter(_.id === employee.id).update(loc) }

  def delete(id: Int): Future[Int] = db.run { locTableQuery.filter(_.id === id).delete }

  def getAll(): Future[List[Location]] = db.run { locTableQuery.to[List].result }

  def getById(locId: Int): Future[Option[Location]] = db.run { locTableQuery.filter(_.id === locId).result.headOption }

  def ddl = locTableQuery.schema

}

private[repo] trait LocationTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._
//  case class Location(name: String, latitude: Float, longitude: Float, locType: String, image: String)

  private[LocationTable] class LocationTable(tag: Tag) extends Table[Location](tag, "location") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val name: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200)"))
    val latitude: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200)"))
    val longitude: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200)"))
    val locType: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200)"))
    val image: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200)"))
    //    def emailUnique = index("email_unique_key", email, unique = true)
    def * = (name, latitude, longitude, locType, image, id.?) <> (Location.tupled, Location.unapply)
  }

  lazy protected val locTableQuery = TableQuery[LocationTable]

  lazy protected val locTableQueryInc = locTableQuery returning locTableQuery.map(_.id)

}

