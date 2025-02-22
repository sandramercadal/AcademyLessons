package Week2.Tuesday.SandrasAnimalSanctuary

//Keep all our logic separate to the class
//We want to run it so extends App


object SandrasAnimalSanctuaryLogic extends App{

  // I create my function to print animal details

  def printAboutAnimals (animal: Animal): Unit = {
    println (animal.aboutAnimal())
  }


  //LIST TO STORE MY ANIMALS THIS IS NOT AN OBJECT - Let's create some animals
  //An Ostrich & Penguin cant fly

  //val ostrich = Bird ("Ostrich, 6, false, "Pink")
  //val penguin = Bird ("Percy, 2, false, "black")
  //val warthog = Mammal ("Pumba, 16, true, "grey")
  //val tiger = Mammal ("Mufasa, 21, true, "orange")
  //val eagle = bird ("Eagle, 3, true, "black")

}


//If lost - Command + hover turns things blue
