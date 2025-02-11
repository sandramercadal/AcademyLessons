package Week2.Tuesday

object CaseClasses extends App{

  //Standard Class. Starts with word Class. A really simple class:
  //no apply method built in so need to add new
  //class SuperHero (realName: String, heroName: String, weakness: String)
 //new SuperHero ("Clark Kent", "Superman", "Kyrptonite") //(instantiated) made a new superHerp object from the SuperHero class .
//if I want to acces these I need to put val in from of realName + heroName + weakness


//let's make this again using a case Class
  //starts with the word case
  //each paramenter is a Val bu deafult

case class SuperHero (realName: String, heroName: String, weakness: String)
val superMan= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")
  //Object made using the SuperHero case class.
  //casecases dont look at the ref /value they look at the memory

  val superMan2= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")
  println(superMan == superMan2)  //returns True, compares field values after the equals ("Clark Kent", "Superman", "Kyrptonite")
  //not the object reference/memory locations like classes. They are 2 instances of superHero.

  /**
   Q1 Create a dog case class with parameter of name, breed and age
   don't need val as built into case classes
   */
  //Dog list from yesterday:
      // val dog1 = Dog =Dog.apply (new Name ("Mabel"), newAge (2))
      //val dog2 = Dog =Dog.apply (new Name ("Ruby"), newAge (12))

  //class Doggy (Name: String, Breed: String, age: String)
  //new Doggy ("Rufus", "Poodle", "4")

  //case class Doggy (Name: String, Breed: String, age: String)
  //val Doggy= Doggy.apply ("Rufus", "Poodle", "4")

  /**q2 Create 4 dog objects from the dog case class*/

  //case class Doggy2 (Name: String, Breed: String, age: String)   etc

  // val Doggy1= Doggy1.apply ("Max", "Greyhound", "6")
  //val Doggy2= Doggy2.apply ("Mabel", "Damlamtian", "6")
  //val Doggy3= Doggy3.apply ("Ruby", "Poodle", "6")
  //val Doggy4= Doggy4.apply ("Padeen", "Whippet", "6")

  //COPYING A CASE CLASS
  // WE MAKE A SHALLOW COPY you cant do this was cases
  //Ther is a built on menthod called .copy thne nothing afterwards the words copy if we want exactly the same
  //ifg it want to change anything afte rthe word copy you put what you want eg .copy (weakness= "gravity")

  //.copy method
//We are going to change superman and keep siperman2 the sae to compare
  //val copiedSuperman = superMan.copy()  //direct copy
  val copiedSuperman = superMan.copy(weakness = "gravity")  //

  println(copiedSuperman)
  println(copiedSuperman.weakness)
  println(superMan.weakness) //originla is not being ressaigned
val updatedName = superMan.copy (realName= "Andy Probert", weakness = "pints")
  println(updatedName.realName + updatedName.weakness)

//option comamand +L gets it all in line

 //TASK
 println("\nTask\n")




}

