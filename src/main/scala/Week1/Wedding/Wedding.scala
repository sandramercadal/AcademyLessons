/** Wedding planning Project 👰🏽‍♀️⛪️🧁
 * consolidates lessons * */


object WeddingPlan extends App {


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


  /** List of venues with church onsite */
  def venuesWithChurch: List[WeddingTheme] = {
    allThemes.filter(_.churchOnsite)
  }

  //Filter a list of venues with church onsite
  println("Venues with church:")
  venuesWithChurch.foreach(theme => println(s"- ${theme.name}")) //Venues with church - Gatsby- Quintessentially English Countryside chic


  //Reception details

  case class Venue(name: String, address: String, capacity: Int, costPerDay: Double)

  case class Reception(venue: Venue, mealOption: List[String])



  //Person class of anyone involved
  case class Person(name: String, email: String, phoneNumber: Option[String] = None)

  case class Guest(person: Person, plusOne: Option[Guest] = None, dietaryRequirements: List[String] = List())

  val bride: Person = Person("May Green", "May@me.com")
  val groom: Person = Person("Tom Brown", "Tom@me.co.uk")
  //S interpolation printing something here

  //Create some guests
  val bob = Guest(person = Person("Bob Turnbull", "bob@btinternet.com", Some("07790116679")), dietaryRequirements = List ("Vegan"))






  /** Welcome visitors from Wales, England and Spain to the reception by name */
  def welcome(language: String): String = language.toLowerCase
  match {
    case "english" => "Welcome to the wedding of S & J"
    case "spanish" => "Bienvenido a la boda de S & J"
    case "welsh" => "Croeso"
    case _ => "Welcome" // Default to English if not found
  }

  println(welcome("welsh")) //Croeso


  /** Venue hire rates (discount applies to  hiring it for longer) */
  //Hire the venue for 1 day or for the extended weekend with a discount (3 nights)

  def cost(days: Int): Int = {
    val dailyVenueHire = 3500
    val initialCost = dailyVenueHire * days

    if (days >= 3) {
      initialCost - 250
    } else if (days >= 1) {
      initialCost - 100
    }
    else
      initialCost
  }

  println(cost(3)) //Hire it for 3 days this is not calculating properly


}



//Pattern match on what drinks to serve
//Something about assigning people to a table and match to a table







