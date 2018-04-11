package models

case class Employee(name: String, email: String, companyName: String, position: String, id: Option[Int] = None)
case class Location(name: String, latitude: Float, longitude: Float, locType: String, image: String)

case class Wine(name: String, image: String, provider: String, email: String, pairing: Int, description: String, aroma: Int)


