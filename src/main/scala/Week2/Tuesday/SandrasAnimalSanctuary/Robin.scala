package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal

//Traits are something lots of things can have e.g. insect and bird can both fly also species

class Robin (name: String,
             age: Int,
             hasWings: Boolean,
             colourOfFeathers: String,
             val hasRedBreast: Boolean)
  extends Bird (name, age, hasWings, colourOfFeathers)  {


  //example override val (something new)
  //canFly is already implemented in the parent Bird class
  //override def not val to match the trait definition
override def canFly: Boolean = true

  override def aboutAnimal(): String = {
    super.aboutAnimal()+
      s"I'm actually a Robin, and I have a ${colourOfFeathers.toLowerCase} feathers." + (if (hasWings) "I can fly 🪰"  else "I can't fly")


      }
  }


object Robin {

  def createAnimal (
                     name: String,
                     age: Int,
                     hasWings: Boolean,
                     colourOfFeathers: String,
                     hasRedBreast: Boolean) :
  Robin =
    new Robin (name, age, hasWings, colourOfFeathers, hasRedBreast)
}





