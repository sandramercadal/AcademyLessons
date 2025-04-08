package Week1.Fri

import scala.io.StdIn.readLine

/**EXTENSION

 1. Write a function to interact with the terminal. If you enter the word ”Hello”, have the
 command line return “Hello X”, where X is a given name.
 2. Expand on your basic terminal interaction from above. Have a small conversation given
 specific inputs (this can be about anything you like; weather, films, sports…)
 */

object ChatWithMeV2 extends App {

    private def greetUser(): Unit = {
      val name: String = readLine("What's your name: ")
      println(s"Hi, $name")
    }

    private def startChat(): Unit = {
      val choice: String = readLine("What do you want to talk about today : the weather, films or politics?"
      ).toLowerCase

      if (choice == "weather")
        println("It looks like a nice day to go for a walk outside")
      else if (choice == "films")
        println("You like movies, me too! I love ET" +
          ", it's a classic!")
      else if (choice == "politics")
        println("I don't really like politics")
      else
        println("You didn't make a choice")
    }

    private def makingConversation(): Unit = {
      while (true) {
        startChat()
        val continue: String = readLine("Do you want to continue (yes/no): ").toLowerCase
        if (continue != "yes") {
          println("Bye!")
          System.exit(0)
        }
      }
    }
    greetUser()

    makingConversation()

}


