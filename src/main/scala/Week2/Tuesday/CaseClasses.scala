package Week2.Tuesday

object CaseClasses extends App {
  /**
   * //Standard Class. Starts with word Class.
   * //no apply method built in (no boilerplate code) so need to add the syntax 'new'
   *
   */

  // A really simple standard CLASS:
  //class SuperHero (val realName: String, val heroName: String, val weakness: String)

  //OBJECT from the above CLASS (instantiated)
  //new SuperHero ("Mary Kent", "Superwomen", "Kyrptonite")
  // (instantiated) made a new superHero object from the SuperHero class above.
  //If I want to access this I need to put val in from of realName + heroName + weakness.


  //CASE CLASS
  //let's make this again using a case Class
  //starts with the word case also
  //each parameter is a val by default in a case class
  case class SuperHero(realName: String, heroName: String, weakness: String)

  //Let's create 2 instances of superHero using the SuperHero case class and the syntax .apply
  val superMan = SuperHero.apply("Clark Kent", "Superman", "Kyrptonite")

  val superMan2 = SuperHero.apply("Clark Kent", "Superman", "Kyrptonite")
  println(superMan == superMan2) //returns True, compares parameters ("Clark Kent", "Superman", "Kyrptonite")not the object reference/memory locations like classes.


  //COPYING A CASE CLASS
  // WE MAKE A SHALLOW COPY
  //Built in method called .copy then no syntax afterwards if we want exactly the same
  //if we want to change anything after the word "copy" you put what you want eg .copy (weakness= "gravity")

  //.copy method
  //We are going to change superman and keep spiderman2 the same to compare
  //val copiedSuperman = superMan.copy()  //direct copy
  val copiedSuperman = superMan.copy(weakness = "gravity") // making a new val! not mutating the original
  println(copiedSuperman.weakness) ////gravity
  println(superMan.weakness) //Original is not being reassigned. //kryptonite

  val updatedName = superMan.copy(realName = "Andy Probert", weakness = "pints")
  println(updatedName.realName + updatedName.weakness) //Andy Probertpints


  /** TASK
   * Q1 Create a dog case class with parameter of name, breed and age
   * don't need val as vals are built into case classes
   */
  case class Dog(name: String, breed: String, age: Int)

  /**
   * Q2 Create 4 dog objects:
   * val superMan= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite") (we had .apply in this example...)
   */

  val ruby = Dog("Ruby", "patterjack", 10)
  val mabel = Dog("Mabel", "cockerpoo", 1)
  val padeen = Dog("padeen", "greyhound", 3)
  val fern = Dog("fern", "spaniel", 11)

  /**
   * Q3: Then create a kennel case class with parameters of name and then a list of the dog case class.
   */

  case class Kennel(name: String, dogs: List[Dog])  //Dog is my case class from earlier

  /** Q4: Make a new kennel object and add your dogs from (Q.2).
   */

  val dogs: List[Dog] = List(ruby, mabel, padeen, fern) //List[Dog] means have a list that holds elements of the type Dog.
  // So, List[Dog] is essentially a collection of Dog objects.
  val yourLocalKennel = Kennel("Your Local Kennel", dogs)

  println(yourLocalKennel) //Kennel(Your Local Kennel,List(Dog(Ruby,patterjack,10), Dog(Mabel,cockerpoo,1), Dog(padeen,greyhound,3), Dog(fern,spaniel,11)))


  /** Q5: The kennel that you have set up wants to change its name but keep the dogs. Use the case class copy method.
   */
  val renamedYourLocalKennel = yourLocalKennel.copy(name = "Village Kennel")
  println(renamedYourLocalKennel) //Kennel(Village Kennel,List(Dog(Ruby,patterjack,10), Dog(Mabel,cockerpoo,1), Dog(padeen,greyhound,3), Dog(fern,spaniel,11)))


  /** EXTENSION
   * The kennel wants to expand to accept cats and birds as well.
   * Update the kennel case class.
   *
   * Create a bird and cat case class using some creative parameters.
   * The kennel often gets a new dog/cat/bird joining.
   * Add one of each to the kennel. (Go back to the collections lesson where we were adding to the list!!)
   */
  case class Cat(name: String, breed: String, age: Int)
  val cats: List[Cat] = List() // starts off empty

  case class Bird(name: String, breed: String, age: Int)
  val birds: List[Bird] = List() // starts off empty


  //: UpdatedKennel = indicates that the method returns an object of type UpdatedKennel.
  //UpdatedKennel(name, dogs:+ dog, cats, birds) creates and returns a new UpdatedKennel instance:
  case class UpdatedKennel(name: String, dogs: List[Dog], cats: List[Cat], birds: List[Bird]) {
    def addDog (dog: Dog) : UpdatedKennel = {  //Method called addDog that takes a single parameter dog of type Dog.
      UpdatedKennel(name, dogs:+ dog, cats, birds)  //The :+ operator is used to append elements to a list
    }
    def addCat(cat: Cat): UpdatedKennel = {
      UpdatedKennel(name, dogs, cats :+ cat, birds) //The :+ operator is used to append elements to a list
    }
    def addBird(bird: Bird): UpdatedKennel = {
      UpdatedKennel(name, dogs, cats, birds :+ bird) //The :+ operator is used to append elements to a list
    }
  }
//val sydneyKennel1 = updatedKennel("Sydney Kennel", dogs, cats, birds)
  //  println(sydneyKennel)
  //  val renamedSydneyKennel1 = sydneyKennel1.copy(name = "Loki & friends")
  //  println(renamedSydneyKennel)
  //  val addDogCatBird = renamedSydneyKennel1.addDog(Dog ("Toto", "Cairn Terrier", 10)).addCat(Cat("Garfield", "Persian", 5)).addBird(Bird("Hedwig","Snowy", 60))
  //  println(addDogCatBird)


  //APRILS CODE
  //She used sydneyKennel renamed to Loki & friends
  // Update the kennel case class.

  //case class Cat(name: String, breed: String, age: Int)

  //val cats: List[Cat] = List()


  //case class Bird(name: String, species: String, wingSpan: Int)

  //val birds: List[Bird] = List()


  //case class updatedKennel(name: String, dogs: List[Dog], cats: List[Cat], birds: List[Bird]) {
  //def addDog (dog: Dog) : updatedKennel = {
  //updatedKennel(name, dogs:+ dog, cats, birds)
  //}
  //def addCat(cat: Cat): updatedKennel = {
  //updatedKennel(name, dogs, cats :+ cat, birds)
  //}
  //def addBird(bird: Bird): updatedKennel = {
  //updatedKennel(name, dogs, cats, birds :+ bird)
  //}
  //}
  //val sydneyKennel1 = updatedKennel("Sydney Kennel", dogs, cats, birds)
  //println(sydneyKennel)
  //val renamedSydneyKennel1 = sydneyKennel1.copy(name = "Loki & friends")
  //println(renamedSydneyKennel)
  //val addDogCatBird = renamedSydneyKennel1.addDog(Dog ("Toto", "Cairn Terrier", 10)).addCat(Cat("Garfield", "Persian", 5)).addBird(Bird("Hedwig","Snowy", 60))
  //println(addDogCatBird)


}
