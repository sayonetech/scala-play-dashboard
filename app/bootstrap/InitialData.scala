package bootstrap

import com.google.inject.Inject
import javax.inject.Singleton
import play.api.Logger

import scala.concurrent.ExecutionContext.Implicits.global
import repo.UserRepository
import models._
import java.util.Date

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration

class InitialData @Inject() (employeeRepo: UserRepository) {

  def insert = for {
    emps <- employeeRepo.getAll() if (emps.length == 0)
    _ <- employeeRepo.insertAll(Data.users)
  } yield {}

  try {
    Logger.info("DB initialization.................")
    Await.result(insert, Duration.Inf)
  } catch {
    case ex: Exception =>
      Logger.error("Error in database initialization ", ex)
  }

}
//CREATE TABLE "Wine"("id" SERIAL PRIMARY KEY ,"name" varchar(200) , "image" varchar(200)  ,
//"provider" varchar(200),"pairing" varchar(200), "description" varchar(200) ,
//"aroma" varchar(200)  ,"taste" varchar(200),"latitude" varchar(200), "longitude" varchar(200), "rest_name" varchar(200));

object Data {
  val users = List(
    User("Satendra", "satendra@knoldus.com", "Fname","Lname"),
    User("Mayank", "mayank@knoldus.com",  "Fname","Lname"),
    User("Sushil", "sushil@knoldus.com",  "Fname","Lname"),
    User("Narayan", "narayan@knoldus.com",  "Fname","Lname"),
    User("Himanshu", "himanshu@knoldus.com",  "Fname","Lname"))
//  name, image, provider, pairing, description, aroma, taste, latitude, longitude, rest_name, id.?
  val x = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Red_and_white_wine_12-2015.jpg/1200px-Red_and_white_wine_12-2015.jpg"
  val d="description : Wine has long played an important role in religion. Red wine was associated with blood by the ancient Egyptians[17] and was used by both the Greek cult of Dionysus and the Romans in their Bacchanalia; Judaism also incorporates it in the Kiddush and Christianity in the Eucharist"
  val d2 = "description : Wine has been produced for thousands of years. The earliest known traces of wine are from Georgia (c. 6000 BC),[2][3][4][5] Iran (c. 5000 BC),[6][7] and Sicily (c. 4000 BC)[8] although there is evidence of a similar alcoholic beverage being consumed earlier in China (c. 7000 BC).[9][10][11] The earliest known winery is the 6,100-year-old Areni-1 winery in Armenia.[12][13] Wine reached the Balkans by 4500 BC and was consumed and celebrated in ancient Greece, Thrace and Rome. Throughout history, wine has been consumed for its intoxicating effects.[14][15][16]"
  val d3 = "description : Wine (from Latin vinum) is an alcoholic beverage made from grapes, generally Vitis vinifera, fermented without the addition of sugars, acids, enzymes, water, or other nutrients.[1]"
  val locations = List(
  //  case class Wine(name: String, image: String, provider: String, pairing: String, description: String, aroma: String, id: Option[Int] = None)
    Wine("MyBrand 01", x, "My Resturent 1", "pair", d, "aroma", "taste", "25.0032568", "-102.003565", Option(1)),
    Wine("MyBrand 02", x,  "Vine Shop", "pair", d, "aroma", "taste",  "12.0032568", "-12.003565",Option(2)),
    Wine("MyBrand 03", x,"Resturant", "pair", d, "aroma", "taste", "18.0032568", "-56.003565",  Option(3))
  )
}
