package utils

import models._
import play.api.libs.json.Json

object JsonFormat {

  implicit val employeeFormat = Json.format[User]
  implicit val locationFormat = Json.format[Location]
  implicit val wineFormat = Json.format[Wine]

}


