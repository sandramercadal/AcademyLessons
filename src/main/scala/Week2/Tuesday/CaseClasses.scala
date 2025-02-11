package Week2.Tuesday

object CaseClasses extends App{
/**
  //Standard Class. Starts with word Class.
  //no apply method built in (no boilerplate code) so need to add the syntax 'new'

 */

// A really simple class:
class SuperHeroWoman (realName: String, heroName: String, weakness: String)

  //OBJECT FROM A CLASS (instantiated)
 new SuperHeroWoman ("Mary Kent", "Superwomen", "Kyrptonite")
// (instantiated) made a new superHeroWoman object from the SuperHeroWoman class above.
//If I want to access this I need to put val in from of realName + heroName + weakness.

//CASE CLASS
//let's make this again using a case Class
  //starts with the word case also
  //each parameter is a val by default in a case class

case class SuperHero (realName: String, heroName: String, weakness: String)
val superMan= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")
  //Object made using the SuperHero case class.
  //cases don't look at the ref /value they look at the memory

  val superMan2= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")
  println(superMan == superMan2)  //returns True, compares field values after the equals ("Clark Kent", "Superman", "Kyrptonite")
  //not the object reference/memory locations like classes. They are 2 instances of superHero.
//q) what is .apply here??

  /**
   Q1 Create a dog case class with parameter of name, breed and age
   don't need val as vals are built into case classes
   e.g .
   case class SuperHero (realName: String, heroName: String, weakness: String)
   Created a class called Doggy
   */
  case class Doggy (name: String, breed: String, age: String)

  /**
   Q2 Create 4 dog objects:

   val superMan= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")
   (not sure why this has.appply in this example...)
   */

  val max = Doggy ("Max", "Greyhound", "6")
  val mabel = Doggy ("Mabel", "Dalmatian", "4")
  val ruby = Doggy ("Ruby", "Poodle", "6")
  val padeen = Doggy ("Padeen", "Whippet", "2")

  /**
   Q3 Create 4 dog objects:
   Then create a kennel case class with parameters of name and then a list of the dog case class.
   */
  //ATTEMPT: case class myKennel (name: String, Doggy: List)

  case class myKennel (name: String, dogs: List [Doggy])
//Need to call the list I made called Doggy
  /**
   Q4:
  Make a new kennel object and add your dogs from (Q.2).
  */
    //ATTEMPT didn't work

  val dogs: List[Doggy] = List(max, mabel, ruby, padeen)

  val newKennel = myKennel("New Kennel", dogs)
  println(newKennel)

  //val dogs: List[Doggy] = List(max, mabel, ruby, padeen)
  //val createAKennel = myKennel("My Kennel", dogs)
  //println(createAKennel)



  /**
   Q5:
   The kennel that you have set up wants to change its name but keep the dogs. Use the case class copy method.
   */
  val renamedNewKennel = newKennel.copy(name = "Brand New Kennel")
  println(renamedNewKennel)
//Above seems to work here is APRILS CODE:
//val renamedSydneyKennel = sydneyKennel.copy(name = "Loki & friends")
  //println(renamedSydneyKennel)
/**
  Extension:
  A)
 The kennel wants to expand to accept cats and birds as well.
  Update the kennel case class.
  Create a bird and cat case class using some creative parameters.
B)The kennel often gets a new dog/cat/bird joining. Add one of each to the kennel.
 (Go back to the collections lesson where we were adding to the list!!)

 //Extension A and B. APRILS CODE

Created a cat case and bird case.
New case called updated Kennel. add cats and birds to that and dog to that.
Updated the kennel.
Append like we did in the collections exercise.
() this has to be empty so that cats and birds can go in there.

 case class Cat(name: String, breed: String, age: Int)
 val cats: List[Cat] = List()
 case class Bird(name: String, species: String, wingSpan: Int)
 val birds: List[Bird] = List()
 case class updatedKennel(name: String, dogs: List[Dog], cats: List[Cat], birds: List[Bird]) {
 def addDog (dog: Dog) : updatedKennel = {
 updatedKennel(name, dogs:+ dog, cats, birds)
 }
 def addCat(cat: Cat): updatedKennel = {
 updatedKennel(name, dogs, cats :+ cat, birds)
 }
 def addBird(bird: Bird): updatedKennel = {
 updatedKennel(name, dogs, cats, birds :+ bird)
 }
 }
 val sydneyKennel1 = updatedKennel("Sydney Kennel", dogs, cats, birds)
 println(sydneyKennel)
 val renamedSydneyKennel1 = sydneyKennel1.copy(name = "Loki & friends")
 println(renamedSydneyKennel)
 val addDogCatBird = renamedSydneyKennel1.addDog(Dog ("Toto", "Cairn Terrier", 10)).addCat(Cat("Garfield", "Persian", 5)).addBird(Bird("Hedwig","Snowy", 60))
 println(addDogCatBird)
//or  println(addDog)
//or  println(addCat)
//or  println(addBird)
The updated kennel has 3 separate lists in there of cat, dog & bird
 }

 command and / forward slash to comment out code

*/

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

