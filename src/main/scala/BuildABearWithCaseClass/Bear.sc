/** Case Classes and Pattern Matching (pm replaces long if-else statements)
 * Data containers with syperpowers
 * 1. no need for 'new'
 * 2. Immutable by default so all fields are 'val' unless specified
 * 3. Automatic .copy method

 // Alternative code - Standalone case class - perfectly valid
 case class TeddyBear(name: String, color: String)
 val bear = TeddyBear("Fluffy", "brown")* */

//Sealed trait adds type safety, could have also started with an abstract class
sealed trait Bear

case class PandaBear (
    name: String,
    furColour: String,
    outfit: String,
    accessories: List[String]
                     ) extends Bear

//Create more bears


//add pm
//key words match and case
//match on a sequence pattern case List (0, _,_) => println "Foo")
//match on a tuple case (a,b,c) => println ("matched")
//match starting with an if case s" String if s(0) == 'a' => ...

//create a sealed abstract class Expr with case classes with @unchecked
//match on case SOme abnd case None
//A for expression in a tuple p254
//p257 a long Pm


