import scala.io.Codec.fallbackSystemCodec.name


/** chapter 1  */
def hello() = {
  println("Hello, World")
}
println(hello)

println("hello, reader!")

/**malleable */

/** sets up a map from countries to their capitals, modifies the map by adding a new binding ("Japan" -> "Tokyo"), and prints the capital associated with France. */
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))

/** alternatives to above default Map implementation is HashMap, TreeMap, Par, ParMap executes operations in parallel */

/**Growing new types library class scala.math.BigInt
 * The function takes a parameter x of type BigInt, which is a type in Scala that can handle very large integers.
 * Base Case: if (x == 0) 1 checks if x is zero. If it is, the function returns 1. This is because the factorial of 0 is defined to be 1.
 *
 * Recursive Case: If x is not zero, it calculates the factorial using recursion: x * factorial(x - 1). This means it multiplies x by the factorial of x - 1 until it reaches the base case.*/
def factorial(x: BigInt): BigInt =
  if (x == 0) 1 else x * factorial(x - 1)
  println(factorial(30)) //265252859812191058636308480000000

/** Akka is a toolkit for building concurrent, distributed, and resilient message-driven applications in Scala. Create systems that can handle a large number of tasks simultaneously without getting bogged down. E.g:

 Actors: You can use actors to represent independent components that communicate with each other through messages, making it easier to manage state and behavior.

 Concurrency: Akka abstracts the complexity of threading and provides an easy way to write concurrent applications with minimal effort.

 Fault Tolerance: It can help you build systems that can recover from failures. If one actor fails, the system can continue to work by restarting just that part of the application.

 Distributed Systems: You can use Akka to build applications that run across multiple machines, making it easier to scale. */

/** Scalability with combination of object-oriented and functional programming. In Scala a function value is an object. Function
 types are classes that can be inherited by subclasses. The great idea of object-oriented programming is to make these containers fully general, so that they can contain operations as well as data, and that they are themselves values that can be stored in other containers, or
 passed as parameters to operations. Such containers are called objects.*/

/** Scala is an object-oriented language in pure form: every value is an object and
 every operation is a method call. For example, when you say 1 + 2 in Scala, you are actually
 invoking a method named + defined in class Int. */

/**Traits - Objects are constructed by mixin composition, which takes
 the members of a class and adds the members of a number of traits to them. In this way,
 different aspects of classes can be encapsulated in different traits. This looks a bit like multiple
 inheritance, but differs when it comes to the details. Unlike a class, a trait can add some new
 functionality to an unspecified superclass. This makes traits more "pluggable" than classes.**/

/** Java libraries - almost all Scala code makes heavy use of Java libraries, often without programmers being
 aware of this fact.*/

/** Writing classes is muh easier in Scala than Java*/
class MyClass(index: Int, name: String)

/**Manages complexity better than Java */
val nameHasUpperCase = name.exists(_.isUpper)

/**Scala has a very sophisticated type inference system that lets you omit almost all type info that's usually considered annoying*/
//Shouldn't need to repeat that hashMap has Ints as keys and String as values  in val x: HashMap[Int, String] = new HashMap[Int, String]()

//Either of the two less annoying alternatives work just as well
//val x = new HashMap[Int, String]()
//val x: Map[Int, String] = new HashMap()

/** C H A P T E R   2  */
def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}
println(max(10, 11))//11 is greater than 10

/** Page 43 */
