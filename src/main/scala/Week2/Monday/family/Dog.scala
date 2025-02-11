package Week2.Monday.family

//Q1 - Create a class so you can build your dogs
//Blueprint
//Check your brackets
//The class name you give it starts with a CAPS
//Add val to the name you give it

  //class Dog (val givenName: String) { // in (enter classparameters in brackets), in {curlies enter body of the class}.
    // All the logic goes in the body.

    //val isItADog: Boolean = true
    //val DoesitHaveOwner: Boolean = true
    //val numberOfLegs: String = "4"
    //def vetCheck: String = "When was the dog's last vet appointment?"
  //}


/**
val dog1 = Dog =Dog.apply (new Name ("Mabel"), newAge (2))
val dog2 = Dog =Dog.apply (new Name ("Ruby"), newAge (12))

println (dog1.name.name)
println (dog2.newAge.newAge)

class Dog (val name: String, val age: Int, val IsAGoodDog: Boolean) {

  def speak : String = s"$name wants a treat!"
  def giveAge: Int = age
  def areyouGoodDog: String = if  ...goodDog
  //then go to family logic and paste your dog data?
  val rufus: Dog = Dog ("rufus", 5, false)

println (rufus.name)
println (rufus.speak)
}
*/
//Q2 - Add in some simple methods

//Q3 Create a companion Object

//object Dog {

  //def apply (forename: String): Dog = new Dog(givenName)

  //APPLY METHOD
  //val rufus = Dog.apply ("Rufus")
  //println (rufus.isItADog)

//}

//Q4

//INHERITANCE -
// How does it get passed down??
//Do you work down by surname, family tree or how??
//superclass at top like Grandfather / Grandmother
//Father / mother then children
//uncle & aunt and then cousins
//When you give something an additional class you can only do this one. This has drawbacks.
//If you have a book how could this look? page lengths, genres,
//How to create a class of books ? What would be the super book? key components that make up a book and what is additional?
//Author, title, genre - So many possibilities
// class Book essential is title & author)
//We can only extend 1 thing

//TRAITS
//see course notes
//We can incorporate multiple traits
