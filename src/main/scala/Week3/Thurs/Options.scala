
//OPTIONS
//in HMRC - Option of a string eg for married person have the option to fill it in or not
//use the syntax "Option[type]"

//PIZZA TASK
//Lets think about our pizza restaurant again.
//If the customer doesn’t specify their preferred crust, the restaurant will just give a classic crust by default.
//This is how we would change our case class:
//How to change a case class to include and Option // case class Pizza (size: Int, crust: Option[String])

//This code uses a trait to define a common structure for different types of pizzas,
// while utilizing Scala's Option type to handle cases where a crust might or might not be specified.

package Week3.Thurs

object Options extends App {

  //make a trait so it is consumed in this file. Defines 2 properties
  //if they don't specify the crust they get the default, I wrap it in the option of a string
//the crust can either have a value (like "classic" or "stuffed") or be None, meaning there's no crust selected.
  trait Pizza {
    val size: Int
    val crust: Option[String] // crust is OPTION (an optional string).
  }

  /**You create four different pizzas objects by extending the Pizza trait:**/
  //Notice override val - when you define a trait or a class, the properties you declare are essentially abstract unless you provide a concrete implementation.
//Personal: 7 inches with a classic crust.
//Small: 9 inches with no crust (None). As no crust chosen, will default to classic
//Medium: 11 inches with a classic crust.
//Large: 14 inches with no crust (None). As no crust chosen, will default to classic

  object Personalised extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") //Must wrap in a Some if we are giving it 'something'
  }

  object Small extends Pizza {
    override val size: Int = 9
    override val crust: Option[String] = None //With no crust choice so classic by default
  }

  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic") //assigning a default classic crust
  }

  object Large extends Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None //With no crust
  }

  /**Create some instances of Pizza orders **/
  //14" with stuffed crust
  val newPersonalisedOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("stuffed") //Option is wrapped in a some
  }

  //14" with no special crust so default
  val noCrustSpecifiedOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }

  /**method to determine crust type **/
  def whatCrust(pizza: Pizza): String = {
    //pizza has a size and a crust
    //tab onto match exhaustive
    pizza.crust match {
      case Some("classic") => "classic crust"
      case Some("italien") => "Italian crust"
      case Some("stuffed") => "stuffed crust"
      case None => "just the default classic crust"
    }
  }

  /**Testing all the Pizzas**/
  println("Pre-defined pizzas:")
  println(s"Personalised: Size = ${Personalised.size}, Crust = ${whatCrust(Personalised)}")
  println(s"Small: Size = ${Small.size}, Crust = ${whatCrust(Small)}")
  println(s"Medium: Size = ${Medium.size}, Crust = ${whatCrust(Medium)}")
  println(s"Large: Size = ${Large.size}, Crust = ${whatCrust(Large)}")

  println("\nCustom orders:")
  println(s"New Personalised Order: Size = ${newPersonalisedOrder.size}, Crust = ${whatCrust(newPersonalisedOrder)}")
  println(s"No Crust Specified Order: Size = ${noCrustSpecifiedOrder.size}, Crust = ${whatCrust(noCrustSpecifiedOrder)}")

  // Demonstrating getOrElse
  println("\nDemonstrating getOrElse:")
  println(s"newPersonalisedOrder crust: ${newPersonalisedOrder.crust.getOrElse("classic")}")
  println(s"noCrustSpecifiedOrder crust: ${noCrustSpecifiedOrder.crust.getOrElse("classic")}")
}






  //println(newPersonalisedOrder) //stuffed crust
  //println(emptyCrustPizzaOrder) //


  //println(s"New Pizza Order: Size = ${newPizzaOrder.size}, Crust = ${newPizzaOrder.crust.getOrElse("No crust")}")

  //println(s"Empty Crust Pizza Order: Size = ${emptyCrustPizzaOrder.size}, Crust = ${emptyCrustPizzaOrder.crust.getOrElse("No crust")}")


  //Some & None defaults to a none option Pizza (14, None)
  //  //Some Pizza (14, Some,
  //  //both sides need to be warpped in the option
  //  //default crust - classic crust

  // you have to call a method for it to run
  //we have to println we are in an object
  //println(whatCrust(newPersonalisedOrder)) //stuffed crust


  //test the opposite override val crust: Option[String] = None ("stuffed") ??


  //GET OR ELSE
  //either get the sum or give me this

  //println(newPizzaOrder.crust.get) //some stuffed returns "stuffed". Go to the option and return whatever inside of the sum.
  //This will not work with the none. you get error none.get so need to provide it with the catch.
  //println(emptyCrustPizzaOrder.crust.getOrElse ("classic"))
  //get what is in the sum or give me this
















