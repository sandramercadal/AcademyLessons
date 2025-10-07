/** Case Classes & Pattern Matching **/

// Data containers with syperpowers
// 1. no need for 'new'
// 2. Immutable by default so all fields are 'val' unless specified
// 3. Automatic .copy method
//pm replaces long if-else statements


 // Alternative code: Standalone case class - perfectly valid
 case class TeddyBear(name: String, color: String)
 val bear = TeddyBear("Fluffy", "brown")


//Sealed trait adds type safety, could have started with abstract class
sealed trait Bear

case class PandaBear (
                      name: String,
                      furColour: String,
                      outfit: String,
                      hasBamboo: Boolean,
                      accessories: List[String]
                     ) extends Bear

case class PaddingtonBear (
                       name: String,
                       furColour: String,
                       outfit: String,
                       accessories: List[String]
                     ) extends Bear

case class UnicornBear (
                       name: String,
                       furColour: String,
                       outfit: String,
                       accessories: List[String]
                     ) extends Bear

case class RainbowBear (
                       name: String,
                       furColour: String,
                       outfit: String,
                       hasHeart: Boolean,
                       colours: List[String]
                     ) extends Bear

case class TeddyBear (
                         name: String,
                         furColour: String,
                         outfit: String,
                         accessories: List[String]
                       ) extends Bear

//Something for no bear selected yet

/** PM with a tuple */

/** PM with Some and None (Option) */

/** PM with If guards */

/** PM on a sequence */

/** PM using for */



//add pm
//key words match and case
//match on a sequence pattern case List (0, _,_) => println "Foo")
//match on a tuple case (a,b,c) => println ("matched")
//match starting with an if case s" String if s(0) == 'a' => ...

//create a sealed abstract class Expr with case classes with @unchecked
//match on case SOme and case None
//A for expression in a tuple p254
//p257 a long Pm


