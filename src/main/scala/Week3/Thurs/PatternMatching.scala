package Week3.Thurs

object PatternMatching extends App {

//MATCHING STRINGS
  val weather: String = "Cold"

  if (weather.toLowerCase == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }
 //How do we change the above into PM? we swap around (weather == "cold") and use the syntax "match"
  //our if statement is case number 1
  //if else is case number 2
  //case of everything else is case number 3
  //if the weather matches the case of cold I want you to print (s"It is $weather! Take a coat.").
  weather.toLowerCase match {
    case "cold"  => println (s"It is $weather! Take a coat.")  //cold is not valid
    case "raining"  => println (s"It is $weather! Take an umbrella")//cold is not valid
    case _  => println  (s"$weather is not valid")    //_ is wildcard, will catch anything else but wont give you much info just is not valid

  }

//MATCHING with OR

  val numbOfWatermelons : Int =2
  numbOfWatermelons match  {  //call you val and it lights up with first case
    case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    case 4 | 5 => println ("he needs a bag")
    case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  }
  //RETURNS he can carry them without a bag

  val numbOfWatermelons2 : Int =4
  numbOfWatermelons2 match  {  //call you val and it lights up with first case
    case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    case 4 | 5 => println ("he needs a bag")
    case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  }
  //RETURNS he needs a bag

  val numbOfWatermelons3 : Int =9
  numbOfWatermelons3 match  {  //call you val and it lights up with first case
    case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    case 4 | 5 => println ("he needs a bag")
    case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  }
//Returns 9 is invalid



//Mix PM and EMUM
  //we have said Enum is a finite set of data so shouldnt need to use a wildcard
  //Exhaustive PM so every option is included, have a wildcard we are automatically making it exhaustive


//Moving on from classes and Emums now lets think of a real live case
  //Creating a social media platform with notificataions eg email, sms, voicemail, call
  //if want to see a notification but don't want to see the message PM can help
//start with abstract class, cant instantiate it has to be extended. Not there to be made.
  //case class is my bottom level so  don't need to extend them

  //abstract class Notification
  abstract class Notification //Have to extend this as abstract. This is a big box where we keep all our diff types of notifications
  //Store specific types of data in each case class
  case class Email (sender: String, title: String, body:String) extends Notification //extending my grouping mechanism
  case class Text (sender: String, body:String) extends Notification
  case class VoiceNote (sender: String, lengthOfBody:Int) extends Notification

  val notification: Notification = Text ("Mum", "Where are you?") //Making a new notification
  // I get a msg from mum and it says "where are you?"
  //If I get a notification I want to match off the type of notification it is

  //and another one
  val anotherNotification: Notification = VoiceNote ("Dad Did you get home safely?", 45) //Making another new notification

  notification match {
    case Email(sender, title, body) => println("Email from " + sender)
    case Text(sender, body) if sender == "Mum" => println("Text from " + sender + ". Message: " + body)
    case Text(sender, body) => println("Text from " + sender)
    case VoiceNote(sender, lengthOfBody) => println("Voice note from " + sender + " Length: " +lengthOfBody)
  }

  anotherNotification match {
    case Email(sender, title, body) => println("Email from " + sender)
    case Text(sender, body) if sender == "Mum" => println("Text from " + sender + ". Message: " + body)
    case Text(sender, body) => println("Text from " + sender)
    case VoiceNote(sender, lengthOfBody) => println("Voice note from " + sender + " Length: " +lengthOfBody)
  }
  //I can pick and choose what I want to return from text, email
  //I am in an obj i need to println or assign it to a val
  //to call it i need to attach it to a methjod od a val
//be careful of our order it reads the first case first
//will return Text from mum


 //TASK 1 PIZZA SHOP
  //Accept a string for a flavour/topping and return  a different type of pizza for each one.
 //E.g. Spicy -> American Hot
 //What are going doing to do about unknown flavours?
 val flavour: String = "bbq"  //We need a value
  flavour match {  //We need a match
    case "spicy" => println("American Hot") //we need at least one case
    case "bbq" => println("BBQ chicken")
    case "veggie" => println("Veggie")
    case "sweet" => println("Hawaiian")
    case _ => println("Not valid.")
  }

  //TASK 2a
  //Accept pizza measurements for sizes:
  //7 = Personal, 9 = Small, 11 = Medium, 14 = Large

  val pizzaSize: Int = 14  //holds the size of Int. We need pizzaSize itself before we can evaluate what case it matches to.
  val pizzaSizeMatch = pizzaSize match { //this val uses the size above against predefined cases.
    case 7 => "personal"
    case 9 => "small"
    case 14 => "large"
    case _ => "Enter a valid size"
  }
  println(pizzaSizeMatch)

  //2b
  //Make a Pizza case class that accept size and crust parameters. Now match off all the possible options and return the price of the pizza.
  //Personal £5.99: classic
  //Small £10.99: classic, italian
  //Medium £12.99: classic, italian, stuffed (+ 2.99)
  //Large £14.99: classic, italian, stuffed + (+ 2.99)

  case class Pizza(size: Int, crust: String)
  val pizzaOrder: Pizza = Pizza(10, "stuffed")
  val getPrice = pizzaOrder match {
    case Pizza(7, "classic") => 5.99
    case Pizza(9, "classic") => 10.99
    case Pizza(9, "italian") => 10.99
    case Pizza(11, "classic") => 12.99
    case Pizza(11, "italian") => 12.99
    case Pizza(11, "stuffed") => 15.98
    case Pizza(14, "classic") => 14.99
    case Pizza(14, "italian") => 14.99
    case Pizza(14, "stuffed") => 17.98
    case _ => "Enter a valid pizza"
  }
  println(getPrice)


  //TASK
  //Make a chocolate bar case class with an optional filling.
  //Write a method to return the filling of the chocolate bar, which if empty, will give a default.
  //Demonstrate this working by making some chocolate objects.



}

