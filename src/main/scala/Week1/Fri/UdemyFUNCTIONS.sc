
//have two functions but they are separate.
def functions(): Unit = {
  for (i <- 1 to 10) {
    sayHello()
  }

  def sayHello(): Unit = {
    println("Hello everyone")
  }
}
  // Call the functions to see the result
  functions() //returns:
  //Hello everyone x10




  //Print alphabet and invoked using a while loop
//  def printAlphabet(): Unit = {
//    println("a,b,c,d,e")
//  }
//
//  val iterations = 5 // Set the number of times you want to print
//  for (i <- 1 to iterations) {
//    printAlphabet()
//  }

//Design a function that asks for a user’s name. Then it asks for a user’s birth year.
//Finally, it prints out a message saying the user’s name and age. Call the function and test it.
//
//import scala.io.StdIn._
//
//def askUserInfo(): Unit = {
//  println("What is your name?")
//  val name = readLine() // Reads user's name
//
//  println("What is your birth year?")
//  val birthYear = readInt() // Reads user's birth year
//
////  val currentYear = 2023 // You can also dynamically get the year
////  val age = currentYear - birthYear // Calculates the user's age
////
////  println(s"Hello $name! You are $age years old.")
////
////}
////// Call the function to test it
//askUserInfo()

//NOW WITH PARAMETERS
    //List of strings

    def sayHello(people: List[String]): Unit = {
      for (person <- people)
        println (s"Hi $person")
    }

    val clients = List ("Anna", "John", "Michelle")
    sayHello(clients)


//FUNCTION RETURN
//Personal greeing
//val clients = List ("Anna", "Will", "Michelle")
//for (client <- clients) {
//  val greeting = personalisedGreeting(clients)
//  println(greeting)
//}
//
//def personalisedGreeting (person: String): String = {
//  person (0) match
//    case 'A' => s"Are you well $person"
//    case 'W' => s"Are you here $person"
//    case _ => s"Hi $person"
//

//get price iwth tax for these items
def addTax (price: Double) = price * 1.2

val products = Map("Shoes" -> 9.99, "Socks" -> 5.99, "Jeans" -> 39.99)

for (item <- products.keySet) {
  val finalPrice = addTax(products(item))
  println (s"$item costs $finalPrice")
}

def addition (p1: Int, p2: Int) = p1 + p2


//Create a function that receives the name of an animal, and returns the estimated lifespan.
//
//cats -> 15
//dogs -> 10
//rabbit -> 12
//everything else -> 20
//
//Ask the user to input an animal, then print out the estimated lifespan for that animal.
//
//import scala.io.StdIn._
//
//def getLifespan(animal: String): Int = { //only have 1 param so dont need int = { can use shorthand
//  animal.toLowerCase match {
//    case "cat" => 15
//    case "dog" => 10
//    case "rabbit" => 12
//    case _ => 20
//  }
//}
//
//def main(): Unit = {
//  println("Please enter the name of an animal:") // Ask for user input
//  val animal = readLine() // Read the input from the user
//  val lifespan = getLifespan(animal) // Get the estimated lifespan
//  println(s"The estimated lifespan of a $animal is $lifespan years.") // Print the result
//}
//
//// Call the main function to start
//main()
//





