/** Case Classes & Pattern Matching **/

// Data containers with superpowers
// 1. no need for 'new' .2. Immutable by default so all fields are 'val' unless specified .3. Automatic .copy method .4.Pattern matching replaces long if-else statements

 /** Alternative code: Standalone case class - perfectly valid */
 case class TeddyBear(name: String, color: String)
 val aBear = TeddyBear("Fluffy", "brown")


//Sealed trait adds type safety, could have started with abstract class
sealed trait Bear

case class PandaBear (
                      name: String,
                      furColour: String,
                      outfit: String,
                      hasBamboo: Boolean,
                      accessories: List[(String,Double)] //Each tuple has one string and one price. Can have many accessories!
                     ) extends Bear

case class PaddingtonBear (
                       name: String,
                       furColour: String,
                       outfit: String,
                       accessories: List[(String,Double)]
                     ) extends Bear

case class UnicornBear (
                       name: String,
                       furColour: String,
                       outfit: String,
                       accessories: List[(String,Double)],
                       hasBeatingHeart: Boolean
                     ) extends Bear

case class RainbowBear (
                       name: String,
                       furColour: String,
                       outfit: String,
                       hasBeatingHeart: Boolean,
                       accessories: List[(String,Double)]
                     ) extends Bear

case class TeddyBear (
                         name: String,
                         furColour: String,
                         outfit: String,
                         accessories: List[(String,Double)]
                       ) extends Bear

//Something for when no bear selected yet ??


val RainbowTeddyBear = RainbowBear(
  "Crimson",
  "Rainbow",
  "PJ's",
  hasBeatingHeart = true,
  List(("bed hat", 2.99), ("pillow", 1.99), ("slippers", 3.00))
)

val PandaTeddyBear = PandaBear (
  "Ted",
  "black",
  "winter coat",
  hasBamboo= true,
  List(("scarf", 3.00)
))

/** Pattern match on list of tuples */
val accessories: List[(String,Double)] = List (
  ("crown", 4.99),
  ("bed hat", 2.99),
  ("pillow", 1.99),
  ("slippers", 3.00),
  ("glasses", 2.99),
  ("tiara", 1.99),
  ("scarf", 3.00)
)

//match on accessories for any bear:
def bearAccessories (bearName: String, accessories: List[(String, Double)]): String = accessories match {
  case Nil =>
    s"No accessories chosen for your $bearName"

  case List ((accessory1, price1)) =>
    s"For $bearName you have a bear with 1 accessory: $accessory1 £$price1"

  case List ((accessory1, price1), (accessory2, price2)) =>
    s"For $bearName you have a bear with 2 accessories: $accessory1 £$price1 and $accessory2 £$price2"

  case List((accessory1, price1), (accessory2, price2), (accessory3, price3)) =>
    s"For $bearName you have a bear with 3 accessories: $accessory1 £$price1, $accessory2 £$price2 and $accessory3 (£$price3)"

  case _ =>
    s"Your $bearName has ${accessories.length} accessories"
}
println(bearAccessories(RainbowTeddyBear.name, RainbowTeddyBear.accessories))
println(bearAccessories(PandaTeddyBear.name, PandaTeddyBear.accessories))

// W O R K       I N    P R O G R E S S //

/** Pattern match with Some and None (Option) */
// Match on what accessories each bear has and give list the bear name??


/** Pattern match with an 'If' guard

 * Each item in my list is a tuple (String, Double) and (accessory1, price1) extracts each pair from the list.*/
val bearName = "Crimson"
for {
  (accessory1, price1) <- accessories
  if price1 > 2.99
}
println(s"$bearName has a special accessory: $accessory1 £$price1")

/** PM on a sequence */

/** Pattern match using for expression and no val */



//PM using a helper method of some sort??

//add pm
//key words match and case
//match on a sequence pattern case List (0, _,_) => println "Foo")
//match on a tuple case (a,b,c) => println ("matched")
//match starting with an if case s" String if s(0) == 'a' => ...

//create a sealed abstract class Expr with case classes with @unchecked
//match on case SOme and case None
//A for expression in a tuple p254
//p257 a long Pm


