/** Case Classes and Pattern Matching (replace long if-else statements)
 * Data containers with syperpowers
 * 1. no need for 'new'
 * 2. Immutable by default so all fields are val unless specified
 * 3. Automatic .copy method

 // Standalone case class - perfectly valid
 case class TeddyBear(name: String, color: String)

 val bear = TeddyBear("Fluffy", "brown")* */

//Sealed trait adds safety
sealed trait Bear

case class PandaBear (
    name: String,
    furColour: String,
    outfit: String,
    accessories: List[String]
                     ) extends Bear

//Create more beasr




