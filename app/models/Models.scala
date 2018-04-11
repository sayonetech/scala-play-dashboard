package models

case class User(username: String, email: String, firstname: String, lastname: String, id: Option[Int] = None)

case class Location(name: String, latitude: Float, longitude: Float, locType: String, image: String)

case class Wine(name: String, image: String, provider: String, email: String, pairing: Int, description: String, aroma: Int)

case class Taste(name: String, url: String)

case class Aroma(name: String, url: String)

case class Pairing(name: String, items:String, url: String)



