package Week2.Monday.family
/**
//going to give it a forename and a surname so the output will be two strings together
// Forename and Surname starts with CAPS

class Forename (val name: String)

  class Surname (surname: String) //no val at the beginning, this cannot be accessed because we haven't assigned the val

//make a new class
//Made using TYPESAFE
  class Adult (val forename: Forename, val surname: Surname) {
  val under18: Boolen = false
}

object Adult {
  def apply (forename: Forename, surname: Surname): Adult = new Adult(forename, surname)


}
*/