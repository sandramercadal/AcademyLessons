package Week2.Monday

/** OBJECTS
 If something needs to be used again and again we make it in a class.
 sometimes we only need one copy of something, in which case we can just make a new object
 */
//add extends App to be able to run it and get a green arrow o the left

object Objects extends App {

object mathsConcepts {
  val pi: Double = 3.1415926535
  val e: Double = 2.718
  val goldenRation: Double = 1.6180339
  val euler: Double =0.57721
}

println (mathsConcepts) // returns Week2.Monday.Objects$mathsConcepts$@4e04a765
println (mathsConcepts.euler) //returns 0.57721


  object PrimaryColours { //grouping
    val blue: String = "blue"
    val yellow: String = "yellow"
    val red: String = "red"
  }

  //calling the objects
  //start on outer colours so call
  println(PrimaryColours.red) //returns red
  println(PrimaryColours.red.toUpperCase) //returns RED

/**
 TASK - Create an object for the days of the week.
 Populate the object with a value for each day.
 prove you can access these values by calling them.
 */
  object daysOfTheWeek { //grouping
    val Monday: String = "Monday"
    val Tuesday: String = "Tuesday"
    val Wednesday: String = "Wednesday"
    val Thursday: String = "Thursday"
    val Friday: String = "Friday"
    val Saturday: String = "Saturday"
    val Sunday: String = "Sunday"
  }

  println(daysOfTheWeek.Tuesday)  //returns Tuesday
  println(daysOfTheWeek.Tuesday.toLowerCase) //returns tuesday
}

//CLASSES
// If we want to build something again and again like a blueprint. SO using it in different places throughout the code
//Always start with a  capital letter

class ClassDefinition (classpapameters: String) {
  //String is a type
  //(Optional) Class Body. if we wont we dont need curly brackets
  //Fields and methods go here - collectively called numbers
  //Must give default values.
}

//CLASS PARAMETERS
//We can pass in raw values ie values we would write in like age: Int
//or values we have already stored. WE could also pass another class!

//TYPE SAFETY
//Use classes as paramenters
//classes are handy for making the output more readable
//2 Ints or strings or booleans next to eachother as the output is difficult e.g 1,33"
//Every class likes its only file
//class Hamster ().....

