import Example.{TicketPrice, getFirstClassTicketPrice}
//val middleName: Option[String] = Some("Muna")
//println(middleName.map(word => word.toUpperCase)) //Some(MUNA)

//val middleName: Option[String] = None
//println(middleName.map(word => word.toUpperCase)) //None

//case class Rating(googleRating: Option[Int])
//case class Film(name: String, rating: Option[Rating])
//
////first film
//val mulan = Film("Mulan", Some(Rating(Some(5))))
//
//println(mulan.name) //Mulan
//println(Option(mulan)) //Some(Film(Mulan,Some(Rating(Some(5)))))
//println(Option(mulan.rating.map(rating => rating.googleRating))) //Some(Some(Some(5)))
//// Using map (need to flatten afterwards)
////Option[Option[Rating]] to Option[Rating] properly before applying the map.
//println(Option(mulan.rating).flatten.map(rating => rating.googleRating)) //Some(Some(5))
//
//// Using flatMap (more elegant)
//println(mulan.rating.flatMap(rating => rating.googleRating)) //Some(5)

val londonToParis = TicketPrice (100, Some(250))
println(getFirstClassTicketPrice(Some(londonToParis)))

object Example {
  case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])
  //b
  def getFirstClassTicketPrice (ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap { ticketPrice =>
      ticketPrice.firstClassTicketPrice
    }
}
