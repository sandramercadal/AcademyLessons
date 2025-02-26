package Week4.Weds

import Week3.Fri.EithersLesson.{NewError, isOdd}

import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.util.{Failure, Random, Success}

object Futures extends App {

  //What are futures?
  //These represent values that are not yet ready, but they will be in the future.

  //WHY we use them?
  //If we didn't use them, sometimes our programme would pause and wait for long operations to complete (for example, fetching data from a database or an API)
  //We want it to carry on doing things
  //The Future allows us to run tasks in the background without stopping the whole programme.

  //How do we create them?
  //A future of hello World
  //just like options and either i have to tell it what type of future [e.g string]
  //to import click on the future word and click option and enter and choose the scala one. imports two things at the top:
  //import scala.concurrent.ExecutionContext.Implicits.global
  //import scala.concurrent.Future

  //start by wrapping it in a future with {
  //then I put it to sleep using thread (everything works on a thread)
  val futureHelloWorld: Future[String] = Future {
    Thread.sleep(2000) //pausing the thread for 2 seconds pause for as long as it needs
    "Hello Future World!"
  }

  //NOT LIKE THIS
  println("Standard print line: " + futureHelloWorld) //Future not complete. This is printing the futures itself rather than the value.

  //1st Way to Print - use .foreach as a callback
  futureHelloWorld.foreach(result => println(s"Using .foreach: $result")) //result is what we are storing it in temporarily. can call it anything.
  //Hello Future World!

  //2nd Way to print - use onComplete (use this when we want to handle success and failure)
  futureHelloWorld.onComplete {
    case Success(result) => println(s"Using onComplete: $result")
    //I clicked on success like bfore and it imported import scala.util.Success
    case Failure(exception) => println(s" Failure with OnComplete: ${exception.getMessage}")
    //clicked again as before this time on Failure and i imported import scala.util.{Failure, Success}
  }
  //Standard print line: Future(<not completed>)
  //Using onComplete: Hello Future World!
  //Using .foreach: Hello Future World!


  //3rd way - using a wait time using Await.result
  val waitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS) //Wait 5 seconds, if you don't receive the value in 5 seconds, time out.
  println("Using await: " + Await.result(futureHelloWorld, waitTime)) //collect it, print it after you have waited for the time stated.
  //THIS WILL BLOCK THE THREAD (and therefore future cannot be used in parallel)
  //Use when essential.

  println("I'm printed after the futures are called") //proving that with .foreach and on.Complete this is printed before, so its
  //happeming while we are waiting for the future to be returned eg we have ordered a coffee and whilst we wait, we have a little chat
  //I'm printed after the futures are called
  //Using .foreach: Hello Future World!
  //Using onComplete: Hello Future World!


  //FINAL RUN OF EVERYTHING ABOVE
  //  Standard print line: Future(<not completed>)
  //  Using await: Hello Future World!
  //I'm printed after the futures are called
  //Using .foreach: Hello Future World!
  //Using onComplete: Hello Future World!

  //TASK 1
  //write a method called additionInTheFuture that takes in two ints and returns the addition of the ints in the futures.

  //def additionInTheFuture (a: Int, b:Int): Future [Int] = Future {
  //Thread.sleep(1000)
  //a + b
  //}

  //additionInTheFuture(4,6).foreach(result => println (s"Using .foreach: $result"))

  //get the method and do it in the future
  def fecthIsOddOrErrorInTheFuture(num: Int): Future[Either[NewError, String]] = Future { //in the future you are going to get an either, ew error or a new string
    Thread.sleep(1000) //always starts by poppint it to sleep
    isOdd(num) //got and get it from week 3 fri but before you do that go to sleep for a bit
  }

  //This is a val instead of using a def even though this is a future, I want it to  use the default Thread.sleep(1000) otherwise will have lots of futures I dont need to make a new one
  val eventualIsOddError: Future[Either[NewError, String]] = fecthIsOddOrErrorInTheFuture(5) //right is odd?

  //val eventualIsOddError: Future [Either[NewError, String]] = fecthIsOddOrErrorInTheFuture(3) //Left

  Thread.sleep(1100) //This will force the thread to sleep before it gets to the .value in the pattern match which forces it to get the
  //future immediately


  //This function only cares about deciding if the future completed or not. It will not get us out of the Either.
  //If it completes and receives either the left or right it will be a success. If the future didnt complet due to a time out, it will hit the none.
  //This is better than our code crashing.
  //What is .value?? before I match .value is immediately checking the value before the future has had time to complete
  val result = eventualIsOddError.value match {

    //eithers here
    case Some(Success(complete)) => s"Future completed: $complete"
    case None => "Future did not complete in the given time."
  }
  //at this point it is no lonmger a future so can use println
  println("isOddError" + result)
  //Using .foreach: Hello Future World!
  //Using onComplete: Hello Future World!
  //isOddErrorFuture did not complete in the given time.


  //How to combine futures?
  //We do this when we want multiple tasks done at once
  //WE are not going to force them to sleep, it means they will run in parallel asynchronously on separate threads
  //FRR COMP is best way to do this:

  val futureInt1: Future[Int] = Future { //hover over future and as we have given it a sleep we are handing over to the executor and we are happy with variable sleep types
    100
  }
  val futureInt2: Future[Int] = Future {
    8
  }

  val combinedFutureInt = for { //for comp will wait for all results to be back before it yields the final results
    number1 <- futureInt1 //go anf find the futureInt 1 and when you get it store in number1
    number2 <- futureInt2 //go anf find the futureInt 2 and when you get it store in number2
    //yield is syntax then I want to get number number1+ number2
  } yield number1 + number2

  //put in val if I want to use ot again otherwise use a println
  println(Await.result(combinedFutureInt, waitTime)) //I created a waitTime already previously returns 108

  //TASK1

//1. Create two Futures: One returning "Hello" and the other "World". Combine them into "Hello World".
  //Need to use Await. here

  val futureOne: Future [String] = Future {
    //Thread.sleep (2000)
 "Hello"
  }

  val futureTwo: Future [String] = Future {
    //Thread.sleep (2000)
 "World"
  }


//val futureHelloWorldMessage .onComplete {
  //  case Success (result) => println (s"Using onComplete: $result")
    //I clicked on success like bfore and it imported import scala.util.Success
    //case Failure (exception) => println(s" Failure with OnComplete: ${exception.getMessage}")
    //clicked again as before this time on Failure and i imported import scala.util.{Failure, Success}


  val combinedFutureOneAndTwo: Future[String] = for {
    hello <- futureOne
    world <- futureTwo
  } yield s"$hello $world"
//or yield word1 + " " + word2 + "!"

  println(Await.result(combinedFutureOneAndTwo, waitTime))


//Q2
  /** TASK 2 */
  //  Create Two Futures:
  //  1st - A Future that returns "User: Alice"
  //  2nd - A Future that returns "Order: Pizza"
  //  Combine the result of the two futures into a for comprehension so we print the user and the order.
  //  EXT: Introduce a random delay before each Future completes. For the Pizza order, refactor it to state a Order: Salad, unless they have waited too long, then Order:Pizza.

  // Simulate fetching user data with a random delay
  val fetchUser: Future[String] = Future {
    val randomDelay = Random.nextInt(2000) + 1000 // Random delay between 1-3 seconds
    Thread.sleep(randomDelay)
    "User: Alice"
  }

  // Simulate fetching order data with a random delay
  val fetchOrder: Future[String] = Future {
    val randomDelay = Random.nextInt(2000) + 1000 // Random delay between 1-3 seconds
    Thread.sleep(randomDelay)
    if (randomDelay < 2000) "Order: Salad" else "Order: Pizza"
  }
  // Combine both Futures
  val combinedResult: Future[String] = for {
    user <- fetchUser
    order <- fetchOrder
  } yield s"$user, $order"

  // Print the final result
  combinedResult.foreach(println)


  Thread.sleep(3000) //set on later than the object above - This ensures the object thread doesn't finish before the future has completed
  }




