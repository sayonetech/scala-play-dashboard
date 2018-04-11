package repo

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import play.api.libs.json.{JsError, JsValue, Json}
import play.api.libs.json.Json._
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import utils.JsonFormat._
import models.Wine

import scala.concurrent.Future

@Singleton()
class WineRepo @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends WineTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insert(wine: Wine): Future[Int] = db.run { wineTableQueryInc += wine }

  def insertAll(wine: List[Wine]): Future[Seq[Int]] = db.run { wineTableQueryInc ++= wine }

  def update(wine: Wine): Future[Int] = db.run { wineTableQuery.filter(_.id === wine.id).update(wine) }

  def delete(id: Int): Future[Int] = db.run { wineTableQuery.filter(_.id === id).delete }

  def getAll(): Future[List[Wine]] = db.run { wineTableQuery.to[List].result }

  def getById(wine: Int): Future[Option[Wine]] = db.run { wineTableQuery.filter(_.id === wine).result.headOption }
  
  def ddl = wineTableQuery.schema

}

private[repo] trait WineTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[WineTable] class WineTable(tag: Tag) extends Table[Wine](tag, "Wine") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val name: Rep[String] = column[String]("name", O.SqlType("VARCHAR(200)"))
    val image: Rep[String] = column[String]("provider", O.SqlType("VARCHAR(200)"))
    val provider: Rep[String] = column[String]("pairing", O.SqlType("VARCHAR(200)"))
    val pairing: Rep[String] = column[String]("aroma", O.SqlType("VARCHAR(200)"))
    val description: Rep[String] = column[String]("taste", O.SqlType("VARCHAR(200)"))
    val aroma: Rep[String] = column[String]("image", O.SqlType("VARCHAR(200)"))
    val taste: Rep[String] = column[String]("description", O.SqlType("VARCHAR(200)"))
    val latitude: Rep[String] = column[String]("description", O.SqlType("VARCHAR(200)"))
    val longitude: Rep[String] = column[String]("description", O.SqlType("VARCHAR(200)"))
//    val rest_name: Rep[String] = column[String]("rest_name", O.SqlType("VARCHAR(200)"))

    def * = (name, image, provider, pairing, description, aroma, taste, latitude, longitude,  id.?) <> (Wine.tupled, Wine.unapply)
  }

  lazy protected val wineTableQuery = TableQuery[WineTable]

  lazy protected val wineTableQueryInc = wineTableQuery returning wineTableQuery.map(_.id)

}

