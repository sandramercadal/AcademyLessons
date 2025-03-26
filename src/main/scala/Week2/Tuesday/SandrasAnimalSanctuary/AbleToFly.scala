package Week2.Tuesday.SandrasAnimalSanctuary

//Use the extends keyword to extend a trait.
trait AbleToFly {

  def canFly: Boolean

  def fly(): String = if (canFly) "I can fly! 🪽✈️" else "I can't fly🫤 "
}


//  AbleToFly(robin)
//}
//This approach gives you several ways to print information about the flying ability:
//
//Directly access the fly property and print it
//Call the flyMessage() method which returns a string based on the fly value
//Include the flying information in the aboutAnimal() method
//Create a separate function that takes any ableToFly object and prints its flying information
//
//The implementation of fly in the Bird class is based on the hasWings property, so birds with wings can fly, and those without cannot.RetryClaude does not have the ability to run the code it generates yet.Claude can make mistakes. Please double-check responses.
//
//


//
//  val robin = new Bird("Bobby", 3, true, "black")
//
//  // Print information about flying capability
//  println(s"${robin.name} can fly: ${robin.fly}")
//  println(robin.flyMessage())
//
//  // Or as part of the general animal information:
//  printAboutAnimals(robin)  // This will include the flying info if you modified aboutAnimal as shown above
//
//  // You can also check the flying ability of any ableToFly object:
//  def checkFlying(flyer: ableToFly): Unit = {
//    println(s"Flying status: ${flyer.fly}")
//    println(s"Flying message: ${flyer.flyMessage()}")
//  }
//






// def CuckoosInEngland : String
// def likeToMakeABurrow : String
//
// def RobinsInCirculation : String
// def lengthOfARobin: Int
//
//To incorporate the ableToFly trait and get a println statement, you need to:
//
//  Update your trait to require implementation of the fly method
//  Mix the trait into your Bird class
//Implement the required method in your Bird class
//Call the method and print its result
//trait ableToFly {
//  def fly: Boolean  // Abstract method that needs implementation
//
//  // This is an additional concrete method that can use the abstract method
//  def flyMessage(): String = {
//    if (fly) "I can fly high in the sky!"
//    else "I can't fly!"
//  }
//}
//
//// Mix the trait into your Bird class
//class Bird(val name: String, val age: Int, val hasWings: Boolean, val beakColour: String)
//  extends Animal(name, age) with ableToFly {
//
//  // Implement the required method from the trait
//  override def fly: Boolean = hasWings
//
//  override def aboutAnimal(): String = {
//    super.aboutAnimal() + s" I'm a bird with a $beakColour beak. " + flyMessage()
//  }
//}