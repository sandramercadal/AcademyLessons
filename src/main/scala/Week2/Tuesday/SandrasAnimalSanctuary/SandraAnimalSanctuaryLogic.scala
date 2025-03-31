package Week2.Tuesday.SandrasAnimalSanctuary

//Keep all our logic separate to the class
//We want to run it so extends App


object SandraAnimalSanctuaryLogic extends App{

  /** I create my function to print animal details */

  def printAboutAnimals (animal: Animal): Unit = {
    println (animal.aboutAnimal())
  }

  /**List of all my animals in my sanctuary */
  val sandraAnimalSanctuary: List[Animal]= List (robin, warthog, ladybird, ostrich)


  //def printBirdWhoflies(bird: AbleToFly): Unit = {
    //println(bird.canFly)
  //}


  /**LIST TO STORE MY ANIMALS THIS IS NOT AN OBJECT - Let's create some animals!
*/
  val robin = new Robin ("Elvis", 3, true, "white", true) //can fly
  val ostrich = new Bird ("Jenny", 5, false, "pink") //An Ostrich can't fly
  val warthog = new Mammal ("Pumbaa", 16, true, "black")
  val ladybird = new Insect ("Dobby", 3, 3.5)

  //val penguin = Bird ("Percy, 2, false, "black")
  //val bat = Mammal ("Mufasa, 21, true, "orange")


printAboutAnimals(robin) //Elvis
printAboutAnimals(warthog) //Pumbaa
printAboutAnimals(ladybird) //Dobby
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
//sandraAnimalSanctuary.foreach(printAboutAnimals())

//If lost - Command + hover turns things blue
