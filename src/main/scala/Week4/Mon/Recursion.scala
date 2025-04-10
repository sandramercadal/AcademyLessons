package Week4.Mon

import scala.annotation.tailrec


/** RECURSION with enums and sealed case objects */
object Recursion extends App {

  //Standard recursion
  //maybe for a small amount of data eg a cohort of 10 values or up to 7000 values as we have seen. After that it breaks.
  //A recursive call which calls the original method inside the method
  //each new call adds to the call stack
  //It will remember all of these calls before completing. Memory call stack remembered before it can break out and evaluate.
  //we need to write a way to get out of the loop (use if else as learnt this) or case nil then break out
  //will continue to recursively call until the base case is reached
  //Once the base case is reached, it will resolve in reverse order from top of stack to back down eg working up a ladder then working down a ladder

  //factorial methods - multiply all positive INTS in a list ( input = 4 --> 4x3x2x1 not zero)
  //whatever the number i want to multiply everything before it
  //How do i get out ? Think of this first, I dont want it to get to zero
  //when number gets to 1 we want it to stop
  //can use println for error catching

  def factorial(n: Int): Int = {
    if (n <= 1) { //Is n really small like 1 or less?? break out how I escape the recursion  //is 4 less than or equal to 1 no so go to the else statement
      1 //base case - If n is 1, return 1 and then the stored call stack can start unwinding. Its working with 4 fo the next number it thinks of is 3
    } else {
      println(s"Incoming n: $n") //what is my result coming in as
      println(s"New n: ${n - 1}") //what is my result coming in as
      //I need to call this so i probably need to attach this to a val
      // val finalResult = n * n-1 //takes me to 3 but I want it to go all the way to a list so need to wrap in factorial method
      //It keeps going in the else untill it finds the number 1
      val finalResult = n * factorial(n - 1)
      println(s"Final n call: $n") //wont reach this until the base case has been reached and its starts unwinding through the call stack
      finalResult
    }
  }
  println(factorial(4)) // 4x3x2x1 = 24. 24 ways to line up 4 Jelly beans. Factorial is used to calculate combinations and permutations.

  //factorial (4)
  //RECURSIVE LOOP - call stack - paused - not yet evaluated (waiting until the loop ends to evaluate)
  //factorial(4) --> 4 x factorial (4-1) --> factorial (3) - Bottom of stack
  //factorial(3) --> 3 x factorial (3-1) --> factorial (2)
  //factorial(2) --> 2 x factorial (3-1) --> factorial (1) - Top of stack. Unwinds from top to bottom

  //factorial(1) --> hitting the base case --> (exit the recursive loop) --> return 1
  //the call stack is everything in our recursion
  //DOWN THE LADDER //UNWIND we got to factorial 2
  //factorial(2) --> 2 x factorial (2-1) --> 2 x factorial(1) --> 2 x 1 = 2
  //factorial(3) --> 3 x factorial (3-1) --> 3 x factorial(2) --> 3 x 2 = 6 //factorial 3 equals 6. it has taken 2 in this equation from before
  //factorial(4) --> 4 x factorial (4-1) --> 4 x factorial(3) --> 4 x 6 = 24 //factorial 4 equals 24. it has taken 6 in this equation from before
  //Final result =24




  //Stack overflow error - there is only so much memory in the call stack, If this exceeded we get this error.
  //println (factorial(10000))

  //TWO WAYS TO WRITE A RECURSIVE METHOD, whichever method you use, you can identify someone elses code with the other method

  //TAIL RECURSION - AIM FOR THIS
  //smarter way
  //1. The recursive call must be the last operation a function performs. (@tailrec will check this). Where we out this call is 1st difference
  //2. Prevents stack overflow error:
  //2a. doesnt need to remb all prev values, all needed info is passed through an accumulator (acc). cc is storing the needing value and it updates ite ever sinhgle call
  // 2b. A. Scala replaces recursive calls with a simple loop under the hood, called Tail call optimization (TCO)
  //Replaces and updates the acc with every recursive call.

  //The recursive call comes at the end

  //Two ways to do this: \
  // 1st WAY: with a helper method:

  def smarterFactorial(n: Int): Int = {  //acc not added here just in factorialHelper
    @tailrec
    def factorialHelper(x: Int, acc: Int): Int = { //pass our int again but we cant call it int so change the name so x. Now pass in the acc that will aslo be a int as it matches
      //write our method here inside the factorial helper
      //Helper method means we don't need to chage the top method on line above
      if (x <= 1) acc //return the acc. Superstar doing all the work here - stores the intermediate value. Dont need to have a large memory as call stack is being updated each time
      else {
        println(s"Current X inside else: $x") // stay here util we get to our 1 . this can be anything until we leave the loop
        println(s"Value of current acc inside else: $acc") // 12
        factorialHelper(x - 1, acc * x) // x - 1 so it works itself down the list, subtract one every time.
        // Acc is running total so allow it to complete  and store completed value and gets updated
        //this is the last expression this means it is tail recursive. Override old values and pass it on in new update acc each time.
        //x - 1  --> moving down our numbers list eg from 3 to 2 to 1
        //acc * x --> running total
      }
    }
    //final method call is call to your help
    factorialHelper(n, 1) //the first running totoal is what we want it to start with
    //call the helper, pass n the origibnal n so we start the recursion at the top level, acc will start at wherever our if case is
  }

  //the final call needs to be the recursive call

  println("\nTail rec with helper: " + smarterFactorial(4)) //24


  //acc is like a placeholder, take these 2 then update it, again take it store, hold and unwind
  //

  //tie in eithers from last for negative nums


  //Tail rec without helper method. simpler method as long as you are able to change the wrapper
  //  //pop it in a sandwich or not?
  @tailrec
  def smarterFactorialWithoutHelper(n: Int, acc: Int = 1): Int = { //acc passed at top level
    if (n <= 1) acc
    else smarterFactorialWithoutHelper(n-1, acc * n)
  }
  println("\nTail rec without helper: " + smarterFactorialWithoutHelper(4))

 //Endless use to this

 //Lets try tail recursion with strings and no helper
  //TAIL RECURSION as I added @tailrec
  //Try adn go back in our own time amd make with tail

  @tailrec
  def concatenateWords(aWord: String, n:Int, acc:String): String = { //pass in aWord and repeat a number of times and pass an acc and return a string. the acc return type is same as method return type
    //start at how we can break out
    if (n<=0) {
      println(s"current aWord inside if: $aWord")
      println(s"current acc inside if: $acc")
      acc
    }
    else {
      println(s"current aWord inside else: $aWord")
      println(s"current acc inside else: $acc")
      concatenateWords(aWord, n - 1, aWord + acc)
    }
  }
  println(concatenateWords("Hello World!", 3, "")) ///"" start with an empty string this is the base case
  //Hello World!Hello World!Hello World!





  //val myStringList = List ("a", "b", "c") dont need this as can println (concatenateWords ("hello", 5))

  //def elementsInAStringCount (strings: List [String]) : Int = {
    //if (strings.isEmpty) {
      //0
    //} else {
     // 1 + myStringList (strings.tail)
   // }

  //}

//  def printAnimals(animals: List[String]): Unit = {
//    if (animals.isEmpty) {
//      println("No more animals to print.")
//    } else {
//      println(animals.head) // Print the first animal
//      printAnimals(animals.tail) // Call the function recursively with the rest of the list
//    }
//  }
//
//  val animalList = List("Dog", "Cat", "Elephant", "Giraffe")
//  printAnimals(animalList)
//  In this example:
//
//    The printAnimals function checks if the list animals is empty.
//    If it's not empty, it prints the first animal (animals.head), and then calls itself with the rest of the list (animals.tail).
//    This process continues until the list is empty, at which point it prints a message saying there are no more animals to print.
//    When you run this code with the list of animals, you'll see the names printed one by one.




 }




