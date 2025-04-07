package Week6Onwards
/** covariance, contravariance, and invariance */
//how type parameters of classes or traits behave in relation to their subtypes.
/** Covariance Set[+T]
 * Contravariance (Syntax: Set [-T])
 * Invariance (Syntax: Set [T])

 * 5. Now imagine some animals like to travel in Pairs, like Swans. Create a generic Pair class
 *that is covariant in its type.
 *6. Create a val of a Pair of Swans (val swanPair: Pair [Swan]). Try to assign this val to a Pair
 *of Animals. Will this compile? Why or why not?
 *7. Sometimes these animals need a person who can feed them. We’re not concerned what
 *animals they can feed. Model a generic abstract Feeder class that is contravariant in its
 *type and has a feedAnimal method (this can just return a simple print line).
 *8. Create an Animal Feeder val that is a new Feeder[Animal]. Override the feedAnimal
 *method, it should now return in interpolated string which includes the name of the animal
 *fed and the food type within the print line. Now, try to assign this val to a Dog Feeder. Will
 *this compile? Why or why not?
 *9. Try to call feedAnimal from the Dog Feeder with a Dog. What do you expect to be printed?
 *10. Try to call it with a Cat. Why doesn’t this compile?
 */

//1. Create an abstract Animal class with fields for their names and the food they eat. Create
// some animals that extend this class.
object Variance extends App {

  abstract class Animal {
    val name: String
    val food: String
  }
  case class Parrot(name: String, food: String) extends Animal
  case class Rabbit(name: String, food: String) extends Animal
  case class Turtle(name: String, food: String) extends Animal

// 2. Create a val called Animal and assign a more specific animal, like a Dog. Why does this
  // compile?

  val fluffyBunny = Rabbit ("Fluffy", "hay")
  val minty = Turtle ("Minty", "straw")

  val animal: Animal = Parrot ("Ruby", "peanuts") //compiled as Parrot is a subtype of Animal
println(fluffyBunny)
println(minty)
println(animal)

  //3. Imagine some animals are Solitary, like Cats. They don’t like spending time with other
  // Animals. Model a generic Solitary class that is invariant in its type.
//Invariance (Syntax: Set [T]
 /** Invariance means that if A is a subtype of B, Set[A] is not considered a subtype of Set[B], and vice versa. This set is strictly that type and cannot be substituted with any of its subtypes or supertypes. */
  // 4. Create a Solitary Cat val. Try to assign this val to a Solitary Animal val. Why doesn’t this
  // compile?
  //Set[T] is invariant


  class Solitaryanimals[T] {
 val solitaryCat: solitaryanimlas [cat] :




  }

}

