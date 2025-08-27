package Week1.LinkedInLearnAndCodeWars

import Week1.LinkedInLearnAndCodeWars.TicketPrices.{getFirstClassTicketPrice, getFirstClassTicketPrice2}

/**
 *Q2 - Write a case class TicketPrice that takes a standardTicketRPrice of type Int and a firstClassTicketPrice of type Option[Int]
 *b. WRite a function called getFirstClassTicketPrice that takes an Option TicketPrice and returns Option[Int]; implement it twice, first with flatMap and then with a for comprehension **/
//Core model
case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])
//firstClassTicketPrice: Option[Int] - there may be a price of a first-class ticket or be None if there is no first-class ticket available

//Service object with my ticket price models
object TicketPrices {

  /**b using flatMap **/
  //uses the flatMap method to extract the firstClassTicketPrice from the TicketPrice instance if it exists:
  def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap { ticketPrice => //checks if ticketPrice is defined (i.e. not None). If it is, it looks at the firstClassTicketPrice of that TicketPrice and returns it wrapped in an Option. If firstClassTicketPrice is None, that will be the result.
      ticketPrice.firstClassTicketPrice
    }
  //Now slightly shorter syntax
  //def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
  //ticketPrice.flatMap(_.firstClassTicketPrice) //no =>

  /**Now WITH a FOR COMP **/
  def getFirstClassTicketPrice2(ticketPrice: Option[TicketPrice]): Option[Int] = {
    for {
      t <- ticketPrice //flat map on ticket price
      firstClassPrice <- t.firstClassTicketPrice //??
    } yield firstClassPrice
  }
}


/** Main app that runs examples **/
object TrainTicketsLinkedInLearn extends App {

//Create test ticket instances
  //create an instance of TicketPrice, standard price is 100, first-class 250 is wrapped in Some
  val londonToParis = TicketPrice(100, Some(250))
  println(getFirstClassTicketPrice(Some(londonToParis))) //Some(250)

  val londonToParisEconomy = TicketPrice(100, None)
  println(getFirstClassTicketPrice(Some(londonToParisEconomy))) //None

  // Test the flatMap version
  println(TicketPrices.getFirstClassTicketPrice(Some(londonToParis))) // Some(250) calling the method through the TicketPrices object
  println(TicketPrices.getFirstClassTicketPrice(Some(londonToParisEconomy))) // None
  println(TicketPrices.getFirstClassTicketPrice(None)) // None

  // Test the for-comprehension version using the 2nd version getFirstClassTicketPrice2
  println(TicketPrices.getFirstClassTicketPrice2(Some(londonToParis))) // Some(250)
  println(TicketPrices.getFirstClassTicketPrice2(Some(londonToParisEconomy))) // None
  println(TicketPrices.getFirstClassTicketPrice2(None)) // None

}

