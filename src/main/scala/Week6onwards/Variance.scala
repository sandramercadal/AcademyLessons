package Week6onwards

import Week6onwards.Variance.{animalPair, swanPair}
import com.sun.tools.javac.util.Pair

/** covariance, contravariance, and invariance */
//how type parameters of classes or traits behave in relation to their subtypes.
/** Covariance Set[+T]
 * Contravariance (Syntax: Set [-T])
 * Invariance (Syntax: Set [T])

 By default, type parameters in Scala are invariant

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

  case class Cat(name: String, food: String) extends Animal
/**We add a Swan later in the code:*/
  //case class Swan(name: String, food: String) extends Animal

  // 2. Create a val called Animal and assign a more specific animal, like a Dog. Why does this
  // compile?

  val fluffyBunny = Rabbit("Fluffy", "hay") //name and what food they eat
  val minty = Turtle("Minty", "straw")
  println(fluffyBunny) //Rabbit(Fluffy,hay)
  println(minty) //Turtle(Minty,straw)

  val animal: Animal = Parrot("Ruby", "peanuts") //compiled as subtype of Animal with similar execution
  println(animal)//Parrot(Ruby,peanuts)

  //3. Imagine some animals are Solitary, like Cats. They don’t like spending time with other
  // Animals. Model a generic Solitary class that is invariant in its type.
  /** Invariance Syntax: Set [T] (with no + or - symbols)
   * Invariance means that if A is a subtype of B, Set[A] is not considered a subtype of Set[B], and vice versa. This set is strictly that type and cannot be substituted with any of its subtypes or supertypes.
   * To model a generic Solitary class that is invariant in its type, we can create a trait or class that takes a type parameter without using any variance annotations. This means that even if Cat is a subtype of Animal, Solitary[Cat] is not considered a subtype of Solitary[Animal]. */
  // 4. Create a Solitary Cat val. Try to assign this val to a Solitary Animal val. Why doesn’t this compile?

  /** Solitary class is invariant in [T] )
   In class Solitary[T], T is a type parameter. T can represent any type that you specify when you create an instance of the Solitary class. e.g. if you create an instance of Solitary[Cat], then T in that context will be replaced with Cat.
  **/
  class Solitary[T] {

    /**we already have these from earlier*/
    //   abstract class Animal {
    //     val name: String
    //     val food: String
    //   }
    //   case class Cat(name: String, food: String) extends Animal

    //Create a new instance of solitary for Cat
    val solitaryCat: Solitary[Cat] = new Solitary[Cat] //T is cat
  }
/** Try to assign Solitary Cat to Solitary
 * This won't compile because Solitary in invariant. Solitary[Cat] is not a subtype of Solitary[Animal] even though cat os a subtype of Animal.It would be like assigning a string to an a val  - val x:int
 * The invariant Solitary[T] class doesn't allow assignment from Solitary[Cat] to Solitary[Animal]
 * Solitary[Cat] and Solitary[Animal] are completely unrelated types*/

//val solitaryAnimal: Solitary[Animal] = solitaryCat //WILL NOT COMPILE
//We have said Solitary is invariant in T so Solitary[Cat] and Solitary[Animal] are 2 completely different types.


  /** Add a covariant PAIR  */
 //* 5. Now imagine some animals like to travel in Pairs, like Swans. Create a generic Pair class that is covariant in its type.
  // *6. Create a val of a Pair of Swans (val swanPair: Pair [Swan]). Try to assign this val to a Pair
  // *of Animals. Will this compile? Why or why not?
  // *

// // How to define a covariant Pair class
  //class Pair[+T](val first: T, val second: T)

  //abstract class Animal {
  //    val name: String
  //    val food: String
  //  }
  //Define Swan Case class (no need for 'new' with case class)
  //like I did for the other animals
  case class Swan(name: String, food: String) extends Animal

//Define a covariant Pair class using +T in it's definition
//So if Swan is a subtype of Animal then Pair[Swan] is a subtype of pair[Animal]
//Pair[+T] - Allows assignment of subtype to supertype (Swan to Animal)
//Pair[+T] allows Pair[Swan] to be assigned to pair[Animal]
  class Pair[+T] (val animal1: T, val animal2: T)

//Create Pair of Swan instances
  val swanPair: Pair[Swan] = new Pair(Swan("Sydney", "grass"), Swan("Canberra", "Tadpoles"))

//Assign a Pair of Swans to Pair of Animals, which will compile because of covariance
  val animalPair: Pair[Animal] = swanPair
  println(swanPair) //returns a memory address?
  print(animalPair)
  //println(s"Swan Pair: ${swanPair}")
  //println(s"Animal Pair: ${animalPair}")


  /**7. Contravariance works in the opposite direction of inheritance.

   * Q7 Sometimes these animals need a person who can feed them. We’re not concerned what
    animals they can feed. Model a generic abstract Feeder class that is contravariant in its
    type and has a feedAnimal method (this can just return a simple print line).*/
//using contravariance with -T, it means that if Animal is a supertype of Swan, then Feeder[Animal] is a subtype of Feeder[Swan].
//A Feeder[Animal] is a subtype of Feeder[Swan] - someone who can feed any animal can certainly feed swans

  //This class is bound to animal
  class Feeder[-T] {
    def feedAnimal (animal: T): Unit = {
      println(s"Person feeding some animal")
    }
  }

  /**8. Create an Animal Feeder val that is a new Feeder[Animal]. Override the feedAnimal
  *method, it should now return in interpolated string which includes the name of the animal
    *fed and the food type within the print line.
   *
   * Now, try to assign this val to a Dog Feeder. Will
  *this compile? Why or why not? */

    //Create an instance of Feeder[Animal] with an overridden feedAnimal method
    //Use string interpolation to include the animal's name/food
    //The overridden method accesses the animal's name and food properties (which are available because we added the <: Animal type bound) to create a more informative message when feeding the animals.
 val animalFeeder: Feeder[Animal] = new Feeder [Animal] {
   override def feedAnimal(animal: Animal): Unit = {
     println(s"feeding ${animal.name} with ${animal.food}")
   }
 }

  // Due to contravariance, an Animal feeder can be assigned to a Swan feeder
 val swanFeeder: Feeder[Swan] = animalFeeder

  animalFeeder.feedAnimal(fluffyBunny) //feeding Fluffy with hay
  swanFeeder.feedAnimal(new Swan("Bondi", "sunflowers")) //feeding Bondi with sunflowers

  /**9. Try to call feedAnimal from the Dog Feeder with a Dog. What do you expect to be printed?

    10. Try to call it with a Cat. Why doesn’t this compile?*/

  case class Dog(name: String, food: String) extends Animal
  //create a dog specific feeder
  // Due to contravariance, an Animal feeder can be assigned to a Dog feeder
  // This makes sense: someone who can feed any animal can definitely feed dogs
  val dogFeeder: Feeder[Dog] = animalFeeder

  //create a dog instance
  val Mabel = Dog("Mabel", "biscuits")
  //the animal feeder knows how to feed any animal, including dogs
  dogFeeder.feedAnimal(Mabel) //feeding Mabel with biscuits

 // val Jerry = Cat("Jerry", "clay")This WON'T compile: dogFeeder.feedAnimal(Jerry)
//The reason this works is the essence of contravariance:
  //
  //If Dog is a subtype of Animal...
  //Then with contravariance (-T), Feeder[Animal] is a subtype of Feeder[Dog]
  //This allows us to assign animalFeeder to dogFeeder
  //
  //But when we try to call dogFeeder.feedAnimal(whiskers), it won't compile because the feedAnimal method on Feeder[Dog] expects an argument of type Dog, and whiskers is a Cat.
  //This demonstrates the key concept of contravariance as it applies to the ability to handle different types, while still maintaining type safety for method parameters.


  //// 4A Answer: Yes it does compile as Feeder[Animal] is a subtype of Feeder[Dog] therefore we can compile this without
  //  // an issue, just like the first question
  //  dogFeeder.feedAnimal(odieTheDog)
  //  // 4B Answer: We've overridden the method in Feeder[Animal] so we are calling the new method body, even though we
  //  // haven't implemented it in Feeder[Dog], so at runtime we print "Fed Odie some Dog Food"
  ////  dogFeeder.feedAnimal(garfieldTheCat)
  //  // Answer: Even though we've specified that feedAnimal from Feeder[Animal] can use an Animal, feedAnimal from the Feeder[Dog]
  //  // is expecting a Dog at compile time, which garfieldTheCat isn't.

}



