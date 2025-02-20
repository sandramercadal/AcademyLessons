package Week3.Thurs

object PizzaTask extends App{

//MATCHING WITH OR - Spicy or BBQ or Veggie etc like the watermelon example

  //val numbOfWatermelons : Int =2
  //numbOfWatermelons match  {  //call you val and it lights up with first case
    //case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    //case 4 | 5 => println ("he needs a bag")
    //case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  //}
  //RETURNS It is Cold! Take a coat.

  //Task 1 - given a flavour I need to make match
  //start with a val to match the flavours then add the edge case
  //val flavour match off flavour and give an order
  //also unknown flavours
  //how to make it exahastive

  val flavour: String = "spicy"
flavour match {
  case "spicy" => "American Hot"
  case "bbq" => "BBQ chicken"
  case "veggie" => "Veggie"
  case "sweet" => "Hawaiian"
  case _ => println("Not valid")

//Given an option and returning something different

  //Task 2 -
//what is 8 here in the val??

  val pizzaSizeMatch : Int = 8
  pizzaSizeMatch match {
    case 7 => println ("personal")
    case 9 => println ("small")
    case 11 => println ("medium")
    case _ => println ("Enter a valid size")
  }

  println(pizzaSizeMatch)


  //CASE CLASS OF A PIZZA

    //TASK 2a
    //match case for 7 - personal

    //TASK 2b
    //Pizza case class that accepts the price and crust

    //So far when we made something we alwasy have to hav eit in there but sometimes we might alywa have everything



    case class Pizza (size: Int, crust: String)
  val pizzaOrder : Pizza = Pizza(14, "Stuffed")
  val getPrice = pizzaOrder match {
    case Pizza (7, "classic") => 5.99
    case Pizza (9, "classic") => 10.99
    case Pizza (9, "italian") => 10.99

  }
}

//println (getPrice)





}
