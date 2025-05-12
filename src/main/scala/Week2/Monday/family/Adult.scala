package Week2.Monday.family

//going to give it a forename and a surname so the output will be two strings together
// Forename and Surname both start with CAPS: Forename & Surname


//Two classes:
class Forename (val name: String)
//The val keyword means that name is a public property of the Forename class, and you can access it directly from an instance of Forename.

class Surname (surname: String) //no val at the beginning, this cannot be accessed outside the class because we haven't assigned the val

//make a new class
//Made using TYPESAFE because we are using the classes as types.
class Adult (val forename: Forename, val surname: Surname) { //type safe because we are using classes as types. Has 2 properties both defined with val making them accessible.
  val under18: Boolean = false
}

//notice the use of "new" here
//This is the companion object of the class Adult
object Adult {
  def apply(forename:Forename, surname: Surname): Adult = new Adult(forename, surname)


}