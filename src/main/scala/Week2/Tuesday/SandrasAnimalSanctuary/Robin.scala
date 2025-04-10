package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal

//Traits are something lots of things can have e.g. insect and bird can both fly also species

//Boolean wrapper for cleaner code via case class
import Week2.Tuesday.SandrasAnimalSanctuary.{HasRedBreast, HasWings}

class Robin (name: String,
             age: Int,
             hasWings: HasWings, /**Using a case class**/
             //hasWings: Boolean, //(unlabeled true values can be confusing - use a Case class.)
             featherColour: String,
             //val hasRedBreast: Boolean) //(unlabeled true values can be confusing - use a case class)
             val hasRedBreast: HasRedBreast) /**Using a case class**/
  extends Bird (name, age, hasWings, featherColour)  {


  //example override val (something new)
  //canFly is already implemented in the parent Bird class
  //override def not val to match the trait definition
override def canFly: Boolean = true

  override def aboutAnimal(): String = {
    super.aboutAnimal()+
      s"I'm actually a Robin, and I have a ${featherColour.toLowerCase} feathers." + (if (hasWings.value) "I can fly 🪰"  else "I can't fly")
      }
  }


object Robin {

  def createAnimal (
                     name: String,
                     age: Int,
                     hasWings: HasWings,
                     featherColour: String,
                     hasRedBreast: HasRedBreast) : Robin =
    new Robin (name, age, hasWings, featherColour, hasRedBreast)
}





