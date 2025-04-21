sealed trait WeddingTheme {
  def name: String
  def description: String
  def venueType: String
  def outdoorSpace: List[String]
  def churchOnsite: Boolean
  def churchCapacity: Int
}

object WeddingTheme {


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

  val allThemes = List(GatsbyTheme, CountrysideTheme)

  def venuesWithChurch : List[WeddingTheme] = {
    allThemes.filter(_.churchOnsite)
  }





}




