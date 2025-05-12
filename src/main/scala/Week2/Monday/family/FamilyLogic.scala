package Week2.Monday.family


object FamilyLogic extends App {

  //Everytime we make a new instance of a class using the keyword new, we are making an object.
  // I want to make a new child so use the words "new"
  //This child is an object. We already created it in the other worksheet (child.scala)

  new Child("Alice") //1 use
  val child1 = new Child("Alice") //reuse because I can call it with a val
  val child2 = new Child("Alice")

  //we have 2 brand new instances of that class Alice. 2 separate objects
  println("IS child1 and 2 the same? " + (child1 == child2)) //When run returns false as each is a new object

  /**This code is like playing with toys! Imagine I have a special toy called "Child" that I can name.
   !!!!Making a New Toy:!!!!
   The first line new Child("Alice") is like saying, "I want to make a new toy and I will name it Alice!"
   But it doesn’t keep it anywhere.

  !!!!!Keeping the Toy:!!!!
   The second line val child1 = new Child("Alice") is like saying, "I want to make another toy named Alice and I will keep it in a box called child1."
   Now I can play with it later because it's saved.

  !!!!Another Toy:!!!!
   The third line val child2 = new Child("Alice") does the same thing again! It makes a third toy named Alice and puts it in another box called child2.

   So now, have three toys named Alice, but I can only play with the ones in the boxes (child1 and child2) since they are saved!
  */

  println(child1.forename)  //Returns Alice
  println(child1.under18) // Returns true. In Child.scala we have val under18: Boolean = true
  //  println(child1.idPlease) // cannot access because the method is private in the Child class


  val Nick = new Child("Nick")
  //Enter Nick & hold down command key and right click and you get all the items like IdPlease, under18 etc
val Sandra = new Child ("Sandra")

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

