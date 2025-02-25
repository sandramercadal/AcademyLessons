package Week2.Tuesday.SandrasAnimalSanctuary

//Ladybird extends Insect
//I took out the vals here before name, age etc but kept it in for new ones for Ladybird

class Ladybird(name: String, age: Int, hasSpots: Int, wingSpan: Double)
  extends Insect (name, age, wingSpan) {
  def aboutLadybird(): String = s"Hello I'm a Ladybug. I have $hasSpots spots!" //will print the val parameters
}


//Create the new object of ladybird:
object Ladybird1 {

  def createAnimal(name: String, age: Int, hasSpots: Int, wingSpan: Double):
  Ladybird = new Ladybird(name, age, hasSpots, wingSpan)
}

