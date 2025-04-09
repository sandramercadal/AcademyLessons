package Week2.Tuesday.SandrasAnimalSanctuary

//Keep all our logic separate to the class
//We want to run it so extends App

object SandraAnimalSanctuaryLogic extends App{

  /** I create my function to print animal details */

  def printAboutAnimals (animal: Animal): Unit = {
    println (animal.aboutAnimal())
  }

  /**LIST TO STORE MY ANIMALS THIS IS NOT AN OBJECT - Let's create some animals!
   use key word 'new'
   */
  val robin = new Robin ("Elvis", 3, HasWings(true), "white", HasRedBreast(true))//Robins can fly. Boolean wrappers here for (true)
  val warthog = new Warthog ("Pumbaa", 16, HasLongEars(true), "black", HasFourTusks(true))
  val ladybird = new Ladybird ("Dobby", 3, WingSpan(3.5), HasSpots(5))
  val bat = new Bat ("Blake", 21, true, "black", true)
  val ostrich = new Bird ("Jenny", 5, HasWings(false), "pink") //An Ostrich can't fly

  /**List of all my animals in my sanctuary */
  val sandraAnimalSanctuary: List[Animal]= List (robin, warthog, ladybird, ostrich, bat)

printAboutAnimals(robin) //Elvis
printAboutAnimals(warthog) //Pumbaa
printAboutAnimals(ladybird) //Dobby
printAboutAnimals(bat) //Blake
  printAboutAnimals(ostrich) //Jenny
/**Test the trait */
println(robin.canFly) //True - Robins can fly!
println(robin.fly()) //True - Robins can fly!
println(s" Can robins fly? ${robin.canFly}") //Can robins fly? true

println(s"${ostrich.name} is an Ostrich: ")
println(ostrich.fly())

  println(s"${ostrich.name} is an Ostrich, " + ostrich.fly())
  println(s"${robin.name} is a Robin, " + robin.fly())

}
//  sandraAnimalSanctuary.foreach(printAboutAnimals())

//If lost - Command + hover turns things blue
