package Week2.Monday.family

//going to give it a forename and a surname so the output will be two strings together
// Forename and Surname both start with CAPS: Forename & Surname

class Forename (val name: String)

class Surname (surname: String) //no val at the beginning, this cannot be accessed because we haven't assigned the val

//make a new class
//Made using TYPESAFE because we are using the classes as types.
class Adult (val forename: Forename, val surname: Surname) { //type safe because we are using classes as types.
  val under18: Boolean = false
}

//notice the use of "new" here
//This is the companion object
object Adult {
  def apply(forename:Forename, surname: Surname): Adult = new Adult(forename, surname)


}