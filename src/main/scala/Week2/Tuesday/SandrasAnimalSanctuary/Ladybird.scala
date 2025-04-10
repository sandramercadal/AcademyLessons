package Week2.Tuesday.SandrasAnimalSanctuary

//Ladybird extends Insect

//using case classes for cleaner code - Boolean wrapper for hasSpots and wingSpan rather than just passing primitive types around.
import Week2.Tuesday.SandrasAnimalSanctuary.{HasSpots}

class Ladybird(
                name: String,
                age: Int,
                wingSpan: WingSpan, //not double as have implemented case classes for  this now
                val hasSpots: HasSpots) ////not Int as have implemented case classes for this now
  extends Insect (name, age, wingSpan) with AbleToFly  {


  override def aboutAnimal(): String = {
    super.aboutAnimal()+ s" I'm a Ladybug. I have ${hasSpots.value} spots!" + fly() + "Nice to meet you!!"
  } //will print the val parameters

  //add the abstract method from AbleToFly trait. Make it override
  override def canFly: Boolean = true
}

//Create the new object of ladybird as a companion obj:
object Ladybird {

  def createAnimal(name: String,
                   age: Int,
                   wingSpan: WingSpan, //not double as have case class, same for hasPSots not an Int
                   hasSpots: HasSpots): Ladybird = {
    new Ladybird(name, age, wingSpan, hasSpots)
  }
}

