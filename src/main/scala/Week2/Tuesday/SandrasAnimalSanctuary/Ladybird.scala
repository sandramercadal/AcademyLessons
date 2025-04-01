package Week2.Tuesday.SandrasAnimalSanctuary

//Ladybird extends Insect
class Ladybird(
                name: String,
                age: Int,
                wingSpan: Double,
                val hasSpots: Int)
  extends Insect (name, age, wingSpan) with AbleToFly  {


  override def aboutAnimal(): String = {
    super.aboutAnimal()+ s" I'm a Ladybug. I have $hasSpots spots!" + fly() + "Nice to meet you!!"
  } //will print the val parameters

  //add the abstract method from AbleToFly trait. Make it override
  override def canFly: Boolean = true

}

//Create the new object of ladybird:
object Ladybird {

  def createAnimal(name: String, age: Int, wingSpan: Double, hasSpots: Int):
  Ladybird = {
    new Ladybird(name, age, wingSpan, hasSpots)
  }
}

