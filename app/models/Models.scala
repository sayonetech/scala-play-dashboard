package models

case class User(username: String, email: String, firstname: String, lastname: String, id: Option[Int] = None)

case class Location(name: String, latitude: Double, longitude: Double, locType: String, image: String,
                    description: String, id: Option[Int] = None)

case class Wine(name: String, image: String, provider: String, pairing: String, description: String,
                aroma: String, taste: String, latitude: String, longitude:String,
                id: Option[Int] = None)


