package Week2.Monday.family

//Keep all our logic seperatley to the class
//We want to run it so extends App
object FamilyLogic extends App {

  //I want to make a new child so use the words new
  //This child is an object
  // Everytime we make a new instance of a class using the key work new we aer making an object

  new Child("Alice") //1 use
  val child1 = new Child("Alice") //reuse because I can call it with a val
  val child2 = new Child("Alice")
  //we have 2 btand new instances of that class. 2 separate objects
  println("IS child1 and 2 the same? " + (child1 == child2)) //When run returns false as each is a new object

  println(child1.forename)
  println(child1.under18)
  println(child1.idPlease)

  val Nick = new Child("Nick")
  //Enter Nick & right click and you get all the items like IdPlease, under18 etc

  //CREATE AN ADULT
  //use keyword new as using the apply menthod
  val adult1: Adult = Adult.apply(new Forename("Sandra"), new Surname("Mercadal"))
  //Without apply method don't use keyword new
  val adult2: Adult = Adult = new Adult(new Forename("Sandra"), new Surname("Mercadal"))
  //Adult 1 and 2 are two different adults
  //Navigat eto where we need to get to:
  println(adult1.forename.name) //accessing the class level its hovering outside the class as it reyrns a location
  println(adult1.forename.name) //accessing inside the Forename class to get the string

}