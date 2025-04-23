import java.util.Date

/** Wedding planning Project 👰🏽‍♀️⛪️🧁
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

  /** List of venues with church onsite */
  def venuesWithChurch: List[WeddingTheme] = {
    allThemes.filter(_.churchOnsite)
  }

  //Filter a list of venues with church onsite
  println("Venues with church:")// Gatsby- Quintessentially English Countryside chic
  venuesWithChurch.foreach(theme => println(s"- ${theme.name}"))


  val saveTheDate: String = "Save the date for the wedding of Mary and Tom!" //Wk 1

  val bridesmaids: Seq[String] = Seq("Sarah", "Lisa", "Victoria") //Wk 1

  val tableNames: Map[Int, String] = Map( //Wk 1
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

  //We have more guests! add another table number 11 called "Angel" with a def
  //def addTable( )


  //Write a for comprehension get ideas - Wk 1
  //for yield for comprehension idea maybe what flowers each bridesmaid will have ?

//write a chat with me on a separate page? it can be a q& A on gift registry

//create an  object daysOfTheWeek { //grouping ??


  //Wedding case classes
  case class Wedding(bride: Person, groom: Person, reception: Reception, guests: List[Guest])

  case class Venue(name: String, address: String, capacity: Int, costPerDay: Double, churchOnSite: Boolean)

  case class Reception(venue: Venue, mealOption: List[String])

  //Person class of anyone involved
  case class Person(name: String, email: String, phoneNumber: Option[String] = None) //Wk 3

  case class Guest(person: Person, plusOne: Option[Guest] = None, dietaryRequirements: List[String] = List())

  //add a regular class??


  //Instance of a bride and groom
  val bride: Person = Person("May Green", "May@me.com")
  val groom: Person = Person("Tom Brown", "Tom@me.co.uk")

  val aboutBride = s"The bride's name is ${bride.name} and her email is ${bride.email}" //Wk 2
  println(aboutBride)
  //Create some guests
  val bob = Guest(person = Person("Bob Turnbull", "bob@btinternet.com", Some("07790116679")), plusOne = Some(alice), dietaryRequirements = List())
  val suzie = Guest(person = Person("Suzie Bart", "sb2340@yahoo.com", Some("079901161123")), plusOne = Some(tommy), dietaryRequirements = List ("Vegan"))

  //Create some plus One guests - we don't always need guest phone numbers.

  val alice = Guest(person = Person("Alice Beswick", "alice@example.com"), dietaryRequirements = List("Veg"))

  val tommy = Guest(person = Person("Tommy Brown", "tommybrown@yahoo.com"), dietaryRequirements = List("None"))

println(bob)
println(tommy)
println(suzie)


  /** Welcome visitors from Wales, England and Spain to the reception in language */
  def welcome(language: String): String = language.toLowerCase
  match {
    case "english" => "Welcome to the wedding of S & J"
    case "spanish" => "Bienvenido a la boda de S & J"
    case "welsh" => "Croeso"
    case _ => "Welcome" // Default to English if not found
  }

  println(welcome("welsh")) //Croeso


  /** Venue hire rates (discount applies to hiring it for longer) */
  //Hire the venue for 1 day or for the extended weekend with a discount (3 nights)

  def cost(days: Int): Int = { //Wk 1 & 2
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
//Keyset one from udemy course?

//something about adding tax to how much things cost eg flowers

//Look at wk 3 Thursday

//Ennums wk 3 Thursday

//Either wk 3 Friday

//Wk 4 recusrion

//Wk 4 Hof
//Wk 4 futures
//Extra - variance swan exercise
//Budget cost and tax  for budget of wedding











