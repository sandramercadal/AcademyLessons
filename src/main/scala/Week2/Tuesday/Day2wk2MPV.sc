//1. What are three main differences between a class and a case class?
//Case classes have built in features
//No need to use val with case classes
//We can pattern match with case classes
//Case classes are immutable only.

//Q2) Without coding it, which of the following lines of code is runnable and which will produce an error?
// Then, code it and check!
//a
case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)  //✅Correct Syntax for Case class
//b
//val firstPerson = new Person("Carlos", 23, "Spanish", true) //Incorrect syntax for case class.

// Notice the "new" here, You don't need "new" here as built into case classes
//println(firstPerson)
val firstPerson = Person("Carlos", 23, "Spanish", true) //Incorrect syntax for case class.
//c
val secondPerson = Person("Carlos", 23, "Spanish", true) //Will run as does not have new
println(secondPerson)

//d
val thirdPerson = Person("Chloe", 25, "British", false) //✅correct syntax for a case class
println(thirdPerson)

//e
class Animal(name: String, colour: String, pet: Boolean) //✅Correct Syntax for Case class

//val cat = Animal("cat", "black", true) //❌This won't run as it doesn't have 'new' and that's needed when it is a class to
//make a new object so cat won't be made. Remember classes need ‘new’ to give them the additional functionality that we
// get built in with case classes.

val dog = new Animal("dog", "white", true) //this will run as a regular class not case class has 'new'
println (dog) //


// MVP Exercise 3
//Case class called Muffin with 3 parameters.
case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)

//Instance of the Muffin case class with its parameters:
val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
println(chocolateMuffin)

val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
println(blueberryMuffin)

val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
println(vanillaMuffin)

val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
println(anotherChocolateMuffin)

val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
println(oneMoreChocolateMuffin)

val finalChocolateMuffin = Muffin("chocolate", 2.50, "MercatorBakery")
println(finalChocolateMuffin)

chocolateMuffin == anotherChocolateMuffin  //✅True beacuse the (what is inside the brackets) is same.

chocolateMuffin == oneMoreChocolateMuffin //❌Here in oneMoreMuffin, Chocolate has a caps and choclateMuffin does not
//so false
chocolateMuffin == finalChocolateMuffin //❌//One has 2.50 the other 3.50

//DO EXTENSION HERE - CASE CLASS EXTENSION
//1. Construct a case class that takes in a minimum of 3 parameters, each of a different type,
//and a case object.
case class Toy (name: String, color: String, needsBatteries: Boolean)

case object ToyFactory //is a singleton object. The only instance of it in my program.
//2. Create 3 instances of the case class.

val doll = Toy ("Annabel", "White", needsBatteries = true)
val teddyBear = Toy ("Rupert", "yellow", needsBatteries = false)
val spinningTop = Toy ("Totem", "red", needsBatteries = false)

//Use the “.copy” method to create a further 3 instances, each time modifying a different class parameter
val annabelDeluxe = doll.copy ("AnnableDeluxe", "pink", needsBatteries = true)
val rupertJunior = teddyBear.copy ("RupertJunior", "cream", needsBatteries = false)
val superTop = spinningTop.copy ("Super", "purple", needsBatteries = false)

//4. Use the “.toString” method to print all parameters of the instance you have already
//created for exercise 3.

println(annabelDeluxe.needsBatteries.toString) //Both println the same of true but .toString explicitly calls this method on a boolean
println(annabelDeluxe.needsBatteries)

//5. Use the “.equals” method to compare case class instances you have already created as
//part of the exercises so far.
doll.equals(annabelDeluxe) // False as Annabel vs AnnabelDeluxe
teddyBear.equals(annabelDeluxe) //False
teddyBear.equals(rupertJunior) //False as rupertJunior is not defined as another instance of Toy
doll.equals(doll) //True

// Extension APRILS CODE
//1. Construct a case class that takes in a minimum of 3 parameters, each of a different type, and a case object.

case class Car(manufacturer: String, colour: String, price: BigDecimal, ukManufacturer: Boolean, noOfSeats: Int)

case object Mazda

// Extension Exercise 2
//2. Create 3 instances of the case class.

val bmw = Car("BMW", "blue", 65000.00, ukManufacturer = false, 2)
val mini = Car("Mini", "red", 40000.50, ukManufacturer = true, 5)
val ford = Car("Ford", "grey", 30000.00, ukManufacturer = false, 5)

// Extension Exercise 3
//Use the “.copy” method to create a further 3 instances, each time modifying a different class parameter

val bmwX5 = bmw.copy(price = 85000, noOfSeats = 5)
val blueMini = mini.copy(colour = "blue")
val ukFord = ford.copy(ukManufacturer = true)

// Extension Exercise 4
//4. Use the “.toString” method to print all parameters of the instance you have already
//created for exercise 3.

println(bmwX5.price.toString)
println(firstPerson.age.toString)

// Extension Exercise 5
//5. Use the “.equals” method to compare case class instances you have already created as
//part of the exercises so far.
bmw.equals(ford)
bmwX5.equals(firstPerson)
bmw.equals(bmw)
firstPerson.equals(secondPerson)


// Research APRILS CODE
//1.We discussed about “.copy”, “.toString” and “.equals” methods but there are a lot more
//available, such as “.getClass”, “canEqual” etc. Find as many as you can, what do they
//do? Try to apply them the case classes you’ve created.
//2. Is there difference between “.equals” and “.==” methods and why?

//1.
val displayClass = bmw.getClass
val notEquals = firstPerson.!=(secondPerson)
val canEqual = mini.canEqual(ford)
val hashcode = ford.hashCode()
val doubleEqualsSymbolSameCaseClass = thirdPerson == firstPerson
val doubleEqualsSymbolDifferentCaseClass = bmwX5 == (firstPerson)

//2.
//At face value there seems to be no difference between “.==“ and “.equals” because they both check structural equality, but there are a few.
//",equals" is inherited from Java’s Object class, ".==" is defined as a method on the Any class.
//Main purpose of “.==“ is that it handles internally nulls, as “.equals” doesn’t and need to do it manually.
//“.equals” is sometimes overriden by developers for custom equality checks.