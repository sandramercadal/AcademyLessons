package Week2.Monday.family

//Blueprint
//Check your brackets
//The class name you give it starts with a CAPS "class Child"
//Add val to make it accessible "val forename"
class Child (val forename: String) {
 // in (enter classparameters in brackets), in {curlies enter body of the class}.
 // All the logic goes in the body.

val under18: Boolean = true
 def idPlease: String = "Can I see your ID?"

}

 //above is a blueprint lets use it...
//When you make a new Child they get all the parameters specified e.g. under18 etc
//If we want to name them and call them we need to add a val so val forename
//Private means the code is only for what is in those curley brackets, cannot access in Child class.
// Private reduces the scope of where it is accessible.

 //COMPANION OBJECT
 //There is an easy way to make a child without using the word new as in new Child("Alice")
 //Uses an apply method so don't need to use the key word (what did I mean by this??)
 //object enterANameAsChild
 //A blue semicircle will appear so you can jump to the corresponding one
 //We write 2 words now instead of 3 to make a new instance of a class
 //sits underneath the file
//Companions have to be sitting right next door to each other


  object Child {
   def apply(forename: String): Child = new Child(forename) //short hand to make new instances of you class.

  //Access the companion classes private methods
  //APPLY METHOD
  val bob = Child.apply("Bob")
   println(bob.idPlease)

  }
