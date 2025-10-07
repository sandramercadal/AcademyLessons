/** Case Classes & Pattern Matching **/

// Data containers with superpowers
// 1. no need for 'new'
// 2. Immutable by default so all fields are 'val' unless specified
// 3. Automatic .copy method
// Pattern matching replaces long if-else statements


 /** Alternative code: Standalone case class - perfectly valid */
 case class TeddyBear(name: String, color: String)
 val bear = TeddyBear("Fluffy", "brown")


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
                       colours: List[(String,Double)]
                     ) extends Bear

case class TeddyBear (
                         name: String,
                         furColour: String,
                         outfit: String,
                         accessories: List[(String,Double)]
                       ) extends Bear

//Something for no bear selected yet


val RainbowTeddyBear = RainbowBear("Crimson", "Rainbow", "PJ's", hasBeatingHeart = true, List(("bedhat", 2.99), ("pillow", 1.99), ("slippers", 3.00)))

/** Pattern match on a list of tuples */
val accessories: List[(String,Double)] = List (
  ("crown", 4.99),
  ("bed hat", 2.99),
  ("pillow", 1.99),
  ("slippers", 3.00),
  ("glasses", 2.99),
  ("tiara", 1.99),
  ("scarf", 3.00)
)

//match on accessories chosen for the RainbowTeddyBear:
def rainbowTeddyBearAccessories (accessories: List[(String, Double)]): String = accessories match {
  case List () =>
    "No accessories chosen for your bear"

  //case List ()


}
rainbowTeddyBearAccessories(List()) //No accessories chosen


// WORK I N   P R O G R E S S //
//Use

/** PM with Some and None (Option) */

/** PM with If guards */

/** PM on a sequence */

/** Pattern match using for expression and no val */




//add pm
//key words match and case
//match on a sequence pattern case List (0, _,_) => println "Foo")
//match on a tuple case (a,b,c) => println ("matched")
//match starting with an if case s" String if s(0) == 'a' => ...

//create a sealed abstract class Expr with case classes with @unchecked
//match on case SOme and case None
//A for expression in a tuple p254
//p257 a long Pm


