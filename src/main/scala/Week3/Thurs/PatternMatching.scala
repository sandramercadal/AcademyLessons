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
 //How do we change the above into PM? we swap around (weather == "cold") and use the  syntax match
  //our if statement is case number 1
  //if else is case number 2
  //case of everything else is case number 3
  //if the weather matches thecase of cole i want you to print (s"It is $weather! Take a coat.").
  weather.toLowerCase match {
    case "cold"  => println (s"It is $weather! Take a coat.")  //cold is not valid
    case "raining"  => println (s"It is $weather! Take an umbrella")//cold is not valid
    case _  => println  (s"$weather is not valid")    //_ is wildcard, will catch anything else but wont give you much info just is not valid

  }
//If else statement vs PM
  //

  //PATTERN MATCHING
  //WE can PM off vals, tarits, objects, enums and more.

  //Now we add .toLowerCase
  //weather.toLowerCase match
   //if (weather.toLowerCase == "cold") {
  //we get :
  //It is Cold! Take a coat.
    //It is Cold! Take a coat.


  //Horoscope
  //day and mpnth you were born
  //if case is more than this, less than this,
  //all the star signs
  // if case is equal or more than this you can do this


//MATCHING with OR

  val numbOfWatermelons : Int =2
  numbOfWatermelons match  {  //call you val and it lights up with first case
    case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    case 4 | 5 => println ("he needs a bag")
    case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  }
  //RETURNS It is Cold! Take a coat.

  val numbOfWatermelons2 : Int =4
  numbOfWatermelons2 match  {  //call you val and it lights up with first case
    case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    case 4 | 5 => println ("he needs a bag")
    case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  }
  //RETURNS he can carry them without a bag

  val numbOfWatermelons3 : Int =9
  numbOfWatermelons3 match  {  //call you val and it lights up with first case
    case 1 | 2| 3 => println ("he can carry them without a bag") //with PM you only need one line
    case 4 | 5 => println ("he needs a bag")
    case x => println(s"$x is invalid") //if you want to use interpolation with an Int you have to assign it to something so it can call eg X
  }

  //RETURNS he needs a bag


//Mix PM and EMUM
  //we have said this is a finite set of data so shouldnet need to use a wildcard


  //Exhastive PM so every optioin is included fiwe have a wildcard we are automatically making it exhastive


//Moving on from classes and Emums now lets think of a real live case
  //Creating a social media platform with notifictaions eg email, sms, voicemail, call

  //if want to see a nitifiation but dont want to see the message PM can help
//start with abstract class, cant instantiate it has to be extended. Not there to be made.
  //case class is my bottom level so  don't need to extend them


  //abstract class Notification
  abstract class Notification //Have to extend this - abstract
  case class Email (sender: String, title: String, body:String) extends Notification //extending my grouping mechanism
  case class Text (sender: String, body:String) extends Notification
  case class VoiceNote (sender: String, lengthOfBody:Int) extends Notification

  val notification: Notification = Text ("Mum", "Where are you?") //I get a msg from mum and it says "where are you?"
  //If I get a notification I want to match off the type of notification it is

  notification match {
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



}

