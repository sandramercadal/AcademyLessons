package Week2

/** CLASSES AND COMPANION OBJECTS
 * 1. The companion object must have the exact same name as the class and be defined in the same file so Scala knows they're companions.
 * 2. Companion object provides an apply method, which acts as a factory. This creates instances without using "new"
 * 3. Static-like Functionality - they provide class-level functionality that doesn't belong to any particular instance
 *      -val maxAge = 20  // Available to all dogs
 *      def validateAge(age: Int): Boolean = age > 0 && age <= maxAge
 *      }
 *  4. Can create multiple factory methods for different construction scenarios like a puppy is also a dog
 *  5. Companion objects can access the private members of the class and vice versa 
 * */

//Q1 Create a class to build your dogs (starts with caps)
class Dog (val name: String, val age: Int, val breed: String, val jumpsUp: Boolean, val likesToLick: Boolean) {

  //Q2 Add in some simple methods.
  def lickingBehaviour: String = s"$name wants to lick me"

  def likesToJumpUp: String = if (jumpsUp) "Don't jump up!!" else "You didn't jump up good doggy"

  def giveAge: Int = age
}

//3. Create a companion object for easy object creation. (Remb has same name and starts with Capital letter also)
object Dog extends App{
  //Q4. Create your dogs.
  def apply(name: String, age: Int, breed: String, jumpsUp: Boolean, likesToLick: Boolean): Dog = {
    new Dog(name, age, breed, jumpsUp, likesToLick) //Parameters without the vals and types
  }

  //Q5 5. Call each of your vals and methods.
  val myDog = Dog("Ruby", 2, "Patterjack", jumpsUp = true, likesToLick = true)

  //Call each of your vals and methods

  println(Dog.myDog.name) //Ruby
  println(Dog.myDog.age)  //2
  println(Dog.myDog.likesToLick)  //t
  println(Dog.myDog.jumpsUp)  //true
  println(Dog.myDog.likesToJumpUp)  //Don't jump up!!
  println(Dog.myDog.lickingBehaviour)  //Ruby wants to lick me
}