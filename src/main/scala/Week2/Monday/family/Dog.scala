package Week2.Monday.family
//TASK DOGS
/**
This family have many dogs.

1. Create a class so you can build your dogs, being sure to include class parameters that will help us build the dog.

2. Add in some simple methods.

3. Create a companion object for easy object creation.

4. Create your dogs.

5. Call each of your vals and methods.

EXT: Add a Boolean type into you class parameters. Add a method to the class body which uses this Boolean in an if else statement.
*/
//1
class Dog (val name: String, val age: Int, val goodDog: Boolean) {
//2
  def speak: String = s"$name wants a treat!"

  def giveAge: Int = age

  def areYouAGoodDog: String = if (goodDog) "Such a good dog!!" else "You are not on the santa paws list..."
}
//3
object Dog {
  //4
  def apply(name: String, age: Int, goodDog: Boolean) : Dog = new Dog(name, age, goodDog)

//4
//HOW to call?
}




//INHERITANCE -
// How does it get passed down??
//Do you work down by surname, family tree or how??
//superclass at top like Grandfather / Grandmother
//Father / mother then children
//uncle & aunt and then cousins
//When you give something an additional class you can only do this one. This has drawbacks.
//If you have a book how could this look? page lengths, genres,
//How to create a class of books ? What would be the super book? key components that make up a book and what is additional?
//Author, title, genre - So many possibilities
// class Book essential is title & author)
//We can only extend 1 thing

//TRAITS
//We can incorporate multiple traits
