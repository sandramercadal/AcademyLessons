package Week2.Monday.family

//Keep all our logic separatly to the class
//We want to run it so extends App

object FamilyLogic extends App {

  //Everytime we make a new instance of a class using the keyword new, we rea making an object.
  // I want to make a new child so use the words "new"
  //This child is an object

  new Child("Alice") //1 use
  val child1 = new Child("Alice") //reuse because I can call it with a val
  val child2 = new Child("Alice")
  //we have 2 brand new instances of that class. 2 separate objects
  println("IS child1 and 2 the same? " + (child1 == child2)) //When run returns false as each is a new object

  println(child1.forename)  //Returns Alice
  println(child1.under18) // Returns true. In Child.scala we have val under18: Boolean = true
  //  println(child1.idPlease) // cannot access because the method is private in the Child class


  val Nick = new Child("Nick")
  //Enter Nick & right click and you get all the items like IdPlease, under18 etc

  //CREATE AN ADULT - Typesafe
  //use keyword "new" as using the apply method
  val adult1: Adult = Adult.apply(new Forename("Amy"), new Surname("Smith")) //with apply method

  //Without apply method don't use keyword "new"
  val adult2: Adult = new Adult(new Forename("Amy"), new Surname("Smith"))

  //Adult 1 and 2 are two different adults
  //Navigate to where we need to get to:

  println(adult1.forename) //accessing the class level of Forename to get the string
  println(adult1.forename.name) //accessing inside the Forename class to get to the string


}

