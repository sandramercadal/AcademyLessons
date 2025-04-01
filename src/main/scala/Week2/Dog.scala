package Week2

//Q1 Create a class to build your dogs (starts with caps)
class Dog(val name: String, val age: Int, val breed: String, val jumpsUp: Boolean, val likesToLick: Boolean) {


  //Q2 Add in some simple methods.
  def lickingBehaviour: String = s"$name wants to lick me"

  def likesToJumpUp: String = if (jumpsUp) "Don't jump up!!" else "You didn't jump up good doggy"

  def giveAge: Int = age
}

//3. Create a companion object for easy object creation. (Remb has same name and starts with Capital letter also)
object Dog extends App{
  //Q5 5. Call each of your vals and methods.
  val myDog = Dog("Ruby", 2, "Patterjack", true, false)

  //Q4. Create your dogs.
  def apply(name: String, age: Int, breed: String, jumpsUp: Boolean, likesToLick: Boolean): Dog = {
    new Dog(name, age, breed, jumpsUp, likesToLick) //Parameters without the vals and types
  }

  //Q5 - Call each of your vals and methods

  println(Dog.myDog.name) //Ruby
  println(Dog.myDog.age)  //2

}