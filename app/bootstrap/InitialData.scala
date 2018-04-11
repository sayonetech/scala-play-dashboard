package bootstrap

import com.google.inject.Inject
import javax.inject.Singleton
import repo.UserRepository
import models._
import java.util.Date
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.Logger
import scala.concurrent.Await
import scala.concurrent.duration.Duration

class InitialData @Inject() (employeeRepo: UserRepository) {

  def insert = for {
    emps <- employeeRepo.getAll() if (emps.length == 0)
    _ <- employeeRepo.insertAll(Data.employees)
  } yield {}

  try {
    Logger.info("DB initialization.................")
    Await.result(insert, Duration.Inf)
  } catch {
    case ex: Exception =>
      Logger.error("Error in database initialization ", ex)
  }

}

object Data {
  val employees = List(
    User("Satendra", "satendra@knoldus.com", "Fname","Lname"),
    User("Mayank", "mayank@knoldus.com",  "Fname","Lname"),
    User("Sushil", "sushil@knoldus.com",  "Fname","Lname"),
    User("Narayan", "narayan@knoldus.com",  "Fname","Lname"),
    User("Himanshu", "himanshu@knoldus.com",  "Fname","Lname"))
}
