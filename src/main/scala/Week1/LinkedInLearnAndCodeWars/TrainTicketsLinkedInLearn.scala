package Week1.LinkedInLearnAndCodeWars

object TrainTicketsLinkedInLearn extends App{

    //object Example { //this was from my otehr worksheet which I dont need anymore
      case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])
      //b using flatMap
      def getFirstClassTicketPrice (ticketPrice: Option[TicketPrice]): Option[Int] =
        ticketPrice.flatMap { ticketPrice =>
          ticketPrice.firstClassTicketPrice
        }

  val londonToParis = TicketPrice (100, Some(250))
  println(getFirstClassTicketPrice(Some(londonToParis))) //Some(250)

  //val londonToParis = TicketPrice (100, None) now with a None will return None not Some(250)
//  //Now slightly shorter syntax
//  def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
//    ticketPrice.flatMap(_.firstClassTicketPrice) //no =>

  //Now WITH a FOR COMP
  def getFirstClassTicketPrice2(ticketPrice: Option[TicketPrice]) : Option[Int] = {
    for {
      t <- ticketPrice
      firstClassPrice <- t.firstClassTicketPrice
    } yield firstClassPrice
  }
  // Test the for-comprehension version too
  println(getFirstClassTicketPrice2(Some(londonToParis))) // Should also print: Some(250)

  // Test with None cases
  val londonToParisEconomy = TicketPrice(100, None)
  println(getFirstClassTicketPrice(Some(londonToParisEconomy))) // Should print: None
  println(getFirstClassTicketPrice2(Some(londonToParisEconomy))) // Should print: None
  println(getFirstClassTicketPrice(None)) // Should print: None
  println(getFirstClassTicketPrice2(Some(londonToParis))) //Some(250)

}

