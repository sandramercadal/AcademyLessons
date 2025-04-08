package Week1.Fri
import scala.io.StdIn.readLine

object ChatWithMeV3 extends App{

  /**A simple chat application that interacts with the user through the terminal.*/

  // Val for topic choices (private val can be added as best practise)
  val Weather = "weather"
  val Films = "films"
  val Politics = "politics"
  val Yes = "yes"
  val No = "no"

  // Map topics to responses for easier maintenance (private val can be added)
  val topicResponses = Map(
    Weather -> "It looks like a nice day to go for a walk outside",
    Films -> "You like movies, me too! I love ET, it's a classic!",
    Politics -> "I don't really like politics"
  )

  /**Asks user's name and greets them*/
  private def greetUser(): Unit = {
    val name = readLine("What's your name: ")
    println(s"Hi, $name")
  }

  /**Starts a chat */
  private def startChat(): Unit = {
    val prompt = "What do you want to talk about today: the weather, films or politics?"
    val choice = readLine(prompt).toLowerCase.trim

    // Pattern matching instead of if-else chain
    val response = topicResponses.getOrElse(choice, "You didn't make a choice") //uses getOrElse
    println(response)
  }

  /**Manages the conversation flow with recursive calls */
  def makingConversation(): Unit = {  //(private def can be added)
    startChat()

    val continue = readLine("Do you want to continue (yes/no): ").toLowerCase.trim
    continue match {
      case Yes => makingConversation() // Recursive call
      case No => println("Bye!")
      case _ =>
        println("I didn't understand. Please answer 'yes' or 'no'.")
        makingConversation() // Give another chance
    }
  }

  // Start the application
  greetUser()
  makingConversation()
}






