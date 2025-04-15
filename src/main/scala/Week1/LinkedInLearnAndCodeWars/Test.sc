
/** CASE CLASS CHALLENGE
 *
 * WRite a case class called Country, has two parameters: name which is a string and population which is an INT
 * Write a function called Population which takes in a parameter of type country and outputs an int, this function should return the population of the given country.
 **/

case class Country (name: String, population: Int)
def population(country: Country): Int =country.population


 /** ENNUM CHALLENGE
 *WRite an enum called UnitedKingdom that takes the four conuntries of the UK
 * WHote an if statement which returns a string if the country is SCotland
 * Wrote a function called WHereAmI which takes the enum UnitedKingdom and outputs a different string for each of its cases then implement this with pattern matching.
 */

//
//enum UnitedKingdon
//  case England
//  case NorthernIreland
//  case Scotland
//  case Wales
//
//val country = England s("We're in England!")
//If country == Scotland s("We're in Scotland!")
//If country == Northern Ireland s("We're in Ireland!")
//If country == Wales s("We're in Wales!")
//
 object UnitedKingdom extends Enumeration {
   val England = Value ("We're in Scotland!")
   val Tuesday = Value("We're in Ireland!")
   val Wednesday = Value("We're in Wales!")
   val Thursday = Value("We're in England!")
 }
println(UnitedKingdom.values) //UnitedKingdom.ValueSet(We're in Scotland!, We're in Ireland!, We're in Wales!, We're in England!)

