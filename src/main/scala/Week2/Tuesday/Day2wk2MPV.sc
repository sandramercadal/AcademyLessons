/**
Q1) Main differences between a CLASS and a CASE CLASS?

 BUILT_IN FEATURES:
 In Scala, Class and Case Class are used to define blueprints for objects but Case Class has several built-in features.
This makes it more convenient for developers.

THE USE OF "CASE" at the beginning of a case class:
There is different syntax to begin with:
 To create a case use the words "case class" (no " required)
A class begins with "class"  (no " required)

THE USE OF "NEW" when creating a class:
To create a class we need to use the words 'new' with a Class:
 e.g. new Car

INHERITED BEHAVIOURS
A CASE CLASS compares based on values
We saw this with the Superhero example:
*/
 case class SuperHero (realName: String, heroName: String, weakness: String)
 val superMan= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")

 val superMan2= SuperHero.apply ("Clark Kent", "Superman", "Kyrptonite")
 println(superMan == superMan2)  //returns True, matches ("Clark Kent", "Superman", "Kyrptonite")

//This returns true because it compares the values even though they are different objects.
//They are considered equal in values, not memory addresses.

/**
 VAL
Val is an automatic constructor parameter with Case Class.
With Class it is not. You have to explicitly declare "val"

MUTABILITY
With Class, we can define "var" making it mutable.
With Case class, Fields are immutable by default, but you can use "var"

PATTERN MATCHING
With a CLass this is not supported. It is with Case Class.

*/
//Q2) Without coding it, which of the following lines of code is runnable and which will produce an error?
// Then, code it and check!
/**
case class Person (name: String, age: Int, nationality: String, isStudent: Boolean)
//GUESS: Structure looks fine, but parameters of name, age etc are not defined in a subsequent val
//It won't return much maybe just class = Person.

 val firstPerson = new Person("Carlos", 23, "Spanish", true)
//GUESS: Is a class has 'new'

 val secondPerson = Person("Carlos", 23, "Spanish", true)
//GUESS:
//This is the opposite, it does not contain 'new' I would expect anothr outcome though maybe?

 val thirdPerson = Person("Chloe", 25, "British", false)
//GUESS: Looks runnable

 class Animal (name: String, colour: String, pet: Boolean)
//GUESS: Parameters of name, pet etc are not defined in a subsequent val

 val cat = Animal("cat", "black", true)
//GUESS: This one doesn't look right. cat vs Animal

 val dog = new Animal("dog", "white", true)
//GUESS:
//Is a class has 'new'
//Looks runnable.

*/
//Q3) After reviewing all combinations, which ones are true when compared using the “==“ operator?
// Once decided, code it and check!

case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)
//GUESS: Looks runnable in right structure as we have been learning
//Case Class

//ALl of these are like we did for DOG?
val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
//GUESS:Looks runnable

val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
//GUESS:Looks runnable

val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
//GUESS:Looks runnable

val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
//GUESS:Looks runnable

val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
//GUESS:Looks runnable

val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")
//GUESS:Looks runnable