

import scala.collection.mutable.Map

/** Wedding planning Project 👰🏽‍ ⛪️ 🧁
 * consolidates lessons * */

object WeddingPlan extends App { //Wk 2


  //Planning some wedding themes
  sealed trait WeddingTheme {
    def name: String

    def description: String

    def venueType: String

    def outdoorSpace: List[String]

    def churchOnsite: Boolean

    def churchCapacity: Int
  }


  case object GatsbyTheme extends WeddingTheme {
    val name = "Gatsby"
    val description = "1930's splendour, cocktails and glamour"
    val venueType = "Stately home"
    val outdoorSpace = List("Front lawn for reception drinks", "Moat area for photographs")
    val churchOnsite = true
    val churchCapacity = 80
  }

  case object CountrysideTheme extends WeddingTheme {
    val name = "Quintessentially English Countryside chic"
    val description = "country house within acres of parkland, walk form church to venue down rolling hills"
    val venueType = "country home"
    val outdoorSpace = List("Front lawn", "back lawn", "path area")
    val churchOnsite = true
    val churchCapacity = 75
  }

  case object BeachTheme extends WeddingTheme {
    val name = "beach glamour"
    val description = "Devon coastal retreat"
    val venueType = "Beach vibes"
    val outdoorSpace = List("back terrace")
    val churchOnsite = false
    val churchCapacity = 0
  }

  val allThemes = List(GatsbyTheme, CountrysideTheme, BeachTheme)

  def venuesWithChurch: List[WeddingTheme] = {
    allThemes.filter(_.churchOnsite)
  }

  println("Venues with church:") // List of venues with church //Gatsby- Quintessentially English Countryside chic
  venuesWithChurch.foreach(theme => println(s"- ${theme.name}"))


  val saveTheDate: String = "Save the date for the wedding of Mary and Tom!" //Wk 1

  val bridesmaids: Seq[String] = Seq("Sarah", "Lisa", "Victoria") //Wk 1

  val tableNames: Map[Int, String] = Map( //Wk 1 + mutable Map without making tableNames a var
    1 -> "Oxford Street",
    2 -> "Victoria",
    3 -> "Clapham Common",
    4 -> "Baker Street",
    5 -> "Brixton",
    6 -> "Westminster",
    7 -> "Stockwell",
    8 -> "London Bridge",
    9 -> "Vauxhall",
    10 -> "Westminster"
  )
  val filterForTableOxfordStreet: Map[Int, String] = tableNames.filter(num => num._1 == 1)
  println(filterForTableOxfordStreet) //HashMap(1 -> Oxford Street)

  /**We have more guests! add another table number 11 called "Angel" **/
  tableNames += (11 -> "Angel")
  println(tableNames) //shows 11 table names now not 10


  val cakeFlavour = List("Profitterol Tower", "2 tier", "traditional 3 tier")
  val cakeTopper = List("Edible flowers", "Acrylic Butterflies", "Rice paper flowers")
  val cakeDecoration = List("Sprinkles", "Fresh fruit", "chocolate balls", "chocolate and cream")

  val cakePlanning = for { //for comp Wk 1
    style <- cakeFlavour
    topOfTheCake <- cakeTopper
    decoration <- cakeDecoration
  } yield s"${style} with ${topOfTheCake} covered in ${decoration} for the wedding!"

  println(cakePlanning(3)) //a combination
  println("Here are your top 3 wedding cakes ideas:")
  cakePlanning.take(3).foreach(println)


  //Wk 3
  object PhotographySlots extends Enumeration {
    val BrideGettingReady = Value(0)
    val BrideFamily = Value(1)
    val GroomFamily = Value(2)
    val AtChurch = Value(3)
    val ConfettiThrow = Value(4)
    val AtReception = Value(5)
    val Speeches = Value(6)
    val CakeCutting = Value(7)
  }

  def photographyTime(slot: PhotographySlots.Value): Int = slot match {
    case PhotographySlots.BrideGettingReady => 90 //minutes
    case PhotographySlots.BrideFamily => 30
    case PhotographySlots.GroomFamily => 30
    case PhotographySlots.AtChurch => 40
    case PhotographySlots.ConfettiThrow => 15
    case PhotographySlots.AtReception => 45
    case PhotographySlots.Speeches => 90
    case PhotographySlots.CakeCutting => 15
  }

  println(photographyTime(PhotographySlots.AtChurch)) //40
  println(s"Allocated time at Church is ${photographyTime(PhotographySlots.AtChurch)} minutes.") //Allocated time at Church is 40 minutes.


  //Wk 2
  case class Wedding(bride: Person, groom: Person, reception: Reception, guests: List[Guest])

  case class Venue(name: String, address: String, capacity: Int, costPerDay: Double, churchOnSite: Boolean)

  case class Reception(venue: Venue, mealOption: List[String])

  //Person class of anyone involved in wedding
  case class Person(name: String, email: String, phoneNumber: Option[String] = None) //Wk 3

  case class Guest(person: Person, plusOne: Option[Guest] = None, dietaryRequirements: List[String] = List())


  //Instance of a bride and groom
  val bride: Person = Person("May Green", "May@me.com")
  val groom: Person = Person("Tom Brown", "Tom@me.co.uk")

  val aboutBride = s"The bride's name is ${bride.name} and her email is ${bride.email}" //Wk 2
  println(aboutBride)

  //Create some guests
  val bob = Guest(person = Person("Bob Turnbull", "bob@btinternet.com", Some("07790116679")), plusOne = Some(alice), dietaryRequirements = List())
  val suzie = Guest(person = Person("Suzie Bart", "sb2340@yahoo.com", Some("079901161123")), plusOne = Some(tommy), dietaryRequirements = List("Vegan"))

  //Create some plus One guests - we don't always need guest phone numbers.
  val alice = Guest(person = Person("Alice Beswick", "alice@example.com"), dietaryRequirements = List("Vegeterian"))

  val tommy = Guest(person = Person("Tommy Brown", "tommybrown@yahoo.com"), dietaryRequirements = List("None"))
  println(bob)
  println(tommy)
  println(suzie)

  //Wk 4 TODO
 // valVegeterianGuests = Guest.filter(guest => guest.dietaryRequirements.contains("Vegeterian"))
//println("Vegeterian Guest names:")
 //vegeterianGuests.foreacg(guest => println(guest.person.name)


class WeddingPlanner( //Wk2
val name: String,
val company: String,
val contactNumber: String,
val chosenDesign: String,
val weddingBudget: Double)

 val weddingPlanner = new WeddingPlanner("Crimson Gretal", "JB & Co", "07778900900", "Tradional Elegance", 6000.0)
println(s"The wedding planners name is ${weddingPlanner.name}.")
println(s"The wedding budget is £${weddingPlanner.weddingBudget}.")


 /** TODO FIX WEDDING DATE & vanue of choice**/
//val weddingDate = Wedding(("Mary", "Tom"), "2025-11-11", "Abbots Hall")
//  println(s"The wedding is on ${weddingPlanner.date}")


  ////Where do I specifythe budegt and planner s name etc?
//val budget: Map[Wedding, Double] = Map ()







  /** Welcome visitors from Wales, England and Spain to the reception in their language */
  def welcome(language: String): String = language.toLowerCase
  match {
    case "english" => "Welcome to the wedding of M & T"
    case "spanish" => "Bienvenido a la boda de M & T"
    case "welsh" => "Croeso"
    case _ => "Welcome" // Default to English if not found
  }
  println(welcome("welsh")) //Croeso


  /** Venue hire rates (discount applies to hiring it for 3 days) */
  def cost(days: Int): Int = { //Wk 1 & 2
    val dailyVenueHire = 3500
    val initialCost = dailyVenueHire * days

    if (days >= 3) {
      initialCost - 450
    } else if (days >= 1) {
      initialCost - 0
    }
    else
      initialCost
  }
  println(cost(3))
  println(cost(2))


  //Wk 3 Eithers

  def bookVenue(venue: String): Either[String, String] = {
    try {
      if (venue == "The Plaza NYC") {
        throw new Exception("Venue is not available to be be booked for wedding")
      } else {
        Right(s"$venue has been booked for the wedding!")
      }
    } catch {
      case e: Exception =>
        Left(e.getMessage)
    }
  }

  val venue = "The Plaza NYC"

  println(bookVenue(venue).fold(
    error => s"Error: $error",
    success => success
  ))
  println(bookVenue("The Plaza NYC"))



  def tryWeddingDresses(dresses: List[String]): Unit = {
    def TryADress(remainingDresses: List[String]): Unit = {
      if (remainingDresses.isEmpty) {
        println("There's no more dresses to try on! End of the fitting appointment.") //base case
      } else {
        println(s"Try on the dress: ${remainingDresses.head}") // Try on first dress
        TryADress(remainingDresses.tail) // Call the function recursively with the rest of the dresses
      }
    }

    TryADress(dresses)
  }

  val dressList = List("Lace fitted dress with cape", "Long-sleeved with veil", "Sweetheart neckline with lace bolero", "Mermaid with floor length veil")
  tryWeddingDresses(dressList)



}

//set a budget from 6000 for each thing. Flowers is 750. Can afford?? yes / no

//use getOrElse

// Add a helper method here to get colours scheme or similar?? and expand??
//Wk 4 recursion - tiers on wedding dress
//Wk 4 Hof - write a tahnk you note
//Wk 4 futures  - wait welcome brude the groom

//case none =>
//import javalocal time to give the date of something look at horoscope one!


//something about adding tax to how much things cost eg flowers
//write a chat with me on a separate page? it can be a q& A on gift registry
//contdown to the wedding date, built in method  simliamr thing for age


//Pattern match on what drinks to serve or n//Something about assigning people to a table and match to a table
//Keyset one from udemy course?


//Look at wk 3 Thursday options/Pmatch /chocbar/ pizza
//something about the hog roast may come xyz or not ??


//Extra - variance swan exercise
//Budget cost and tax  for budget of wedding

//flatMap
//flatten

//def total budget
//total budget spent so far? remaining budget ??

//def confirmedGuests attenidng
//Total invited and how many attending ??
//Total invited and how many attending ??
//Update attending list of guests have confimred


//add a trait maybe vendor trait extends person ?? then a case class wedding Vendor
//photographer, florist, etc
//Tracking which budget items are over budget

//create the venue of choice

//Ideas:
//wedding dress
//honeymoon destination
//bridemaids dresses
// what flowers each bridesmaid will have ?
//create invitations / send them
//where people will sit
//check who has RSVPS
//Thankyou notes


//can I get a list of all the guests??
//use local date for wedding date - maybe a countdown??







