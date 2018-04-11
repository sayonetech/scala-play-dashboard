package repo

import javax.inject.{ Inject, Singleton }
import models.User
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future
import java.util.Date

@Singleton()
class UserRepository @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends UserTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insert(user: User): Future[Int] = db.run { empTableQueryInc += user }

  def insertAll(user: List[User]): Future[Seq[Int]] = db.run { empTableQueryInc ++= user }

  def update(user: User): Future[Int] = db.run { empTableQuery.filter(_.id === user.id).update(user) }

  def delete(id: Int): Future[Int] = db.run { empTableQuery.filter(_.id === id).delete }

  def getAll(): Future[List[User]] = db.run { empTableQuery.to[List].result }

  def getById(user: Int): Future[Option[User]] = db.run { empTableQuery.filter(_.id === user).result.headOption }
  
  def ddl = empTableQuery.schema

}
private[repo] trait UserTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[UserTable] class UserTable(tag: Tag) extends Table[User](tag, "User") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val username: Rep[String] = column[String]("username", O.SqlType("VARCHAR(200)"))
    val email: Rep[String] = column[String]("email", O.SqlType("VARCHAR(200)"))
    val firstname: Rep[String] = column[String]("firstname", O.SqlType("VARCHAR(200)"))
    val lastname: Rep[String] = column[String]("lastname", O.SqlType("VARCHAR(200)"))

    def emailUnique = index("email_unique_key", email, unique = true)
    def * = (username, email, firstname,lastname, id.?) <> (User.tupled, User.unapply)
  }

  lazy protected val empTableQuery = TableQuery[UserTable]

  lazy protected val empTableQueryInc = empTableQuery returning empTableQuery.map(_.id)

}

