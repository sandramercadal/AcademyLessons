

//OPTIONS
//Option of a string for married person have the option to fill it in or not
//use the syntax Option


package Week3.Thurs

object Options extends App {

  //make a trait so it is consumed in this file
  //if they dont specify the crust they get the default, I wrap it in the option of a string

  trait Pizza {
    val size: Int
    val crust: Option[String]
  }

  object Personal extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") //Must wrap in a Some if we are giving it 'SOMEthing'
  }

  object Small extends Pizza {
    override val size: Int = 9
    override val crust: Option[String] = None //Not giving a default
  }

  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic") //assigning a default
  }

  object Large extends Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }


  //val for a new pizzaOrder
  val newPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("stuffed") //Option is wrapped in a some
  }


  val emptyCrustPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }


  //method for crust only
  def whatCrust(pizza: Pizza): String = {
    //pizza has a size and a crust
    //tab onto match extahustive
    pizza.crust match {
      case Some("classic") => "classic crust"
      case Some("italien") => "Italian crust"
      case Some("stuffed") => "stuffed crust"
      case None => "just the default classic crust"
    }
  }
  //Some & None defaults to a none option Pizza (14, None)
  //  //Some Pizza (14, Some,
  //  //both sides need to be warpped in the option
  //  //default crust - classic crust

  // you have to call a method for it to run
  //we have to println we are in an object
  println(whatCrust(newPizzaOrder)) //returns
  //test the opposite override val crust: Option[String] = None ("stuffed") ??


  //GET OR ELSE
  //either get the sum or give me this

  //println(newPizzaOrder.crust.get) //some stuffed returns "stuffed". Go to the option and return whatever inside of the sum.
  //This will not work with the none. you get error none.get so need to provide it with the catch.
  //println(emptyCrustPizzaOrder.crust.getOrElse ("classic"))
  //get what is in the sum or give me this
}













