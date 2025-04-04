package Week3

import Week3.Enums.Weekday.Value

object Enums extends App {

  //Useful to represent a fixed, Finite sets of data/sets of related things.
  //make code more organised and type-safe since it restricts a variable to be one of the defined values.

  //SYNTAX is "extends Enumeration" & SYNTAX is "value"
//singleton object
  object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println(Weekday.values) //Weekday.ValueSet(Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
  println(Weekday.Monday) //Monday

  //Below is useful with acronyms
  object BetterWeekday extends Enumeration {
    val Monday = Value("Mon") //Each call to Value("...") creates a new enum value with a custom string representation. The internal values are assigned automatically (0, 1, 2, etc.), but the string representations are I've provided in parentheses
    val Tuesday = Value("Tue")
    val Wednesday = Value("Wed")
    val Thursday = Value("Thurs")
    val Friday = Value("Fri")
    val Saturday = Value("Sat")
    val Sunday = Value("Sun")
  }

  println(BetterWeekday.values) //BetterWeekday.ValueSet(Mon, Tue, Wed, Thurs, Fri, Sat, Sun)
  println(BetterWeekday.Sunday) //Sun

  //Pattern matching example
  //Each call to Value() creates a new enumeration value and automatically assigns it a unique identifier. The string parameter you provide gives it a custom string representation when displayed.
  def matchWithEnum(weekdays: BetterWeekday.Value) = {  //takes a single parameter called weekdays, which is of the type BetterWeekday.Value.
                                                              // BetterWeekday is an enum that defines days of the week.
    weekdays match {
      case BetterWeekday.Monday => println(s"Oh, it's ${BetterWeekday.Monday}")
      case BetterWeekday.Tuesday => println(s"Oh, it's ${BetterWeekday.Tuesday}")
      case BetterWeekday.Wednesday => println(s"Oh, it's ${BetterWeekday.Wednesday}")
      case BetterWeekday.Thursday => println(s"Oh, it's ${BetterWeekday.Thursday}")
      case BetterWeekday.Friday => println(s"Oh, it's ${BetterWeekday.Friday}")
      case BetterWeekday.Saturday => println(s"Oh, it's ${BetterWeekday.Saturday}")
      case BetterWeekday.Sunday => println(s"Oh, it's ${BetterWeekday.Sunday}")
    }
  }
  matchWithEnum(BetterWeekday.Saturday) //Oh, it's Sat

  //We want an exhaustive match - all enums are assigned a match case.
  //We don't see an error message/warning if it isn't. (We could miss values)



  object ReorderedWeekday extends Enumeration {
    val Monday = Value(1)
    val Tuesday = Value(2)
    val Wednesday = Value(3)
    val Thursday = Value(4)
    val Friday = Value(5)
    val Saturday = Value(6)
    val Sunday = Value(0)
  }

  println(ReorderedWeekday.values)



  //ENUMS TO CASE OBJECT TYPE ENUMERATION

  //TASK FROM LESSON SLIDES
  //Using the names of the people on this cohort, use native enumeration to display the enums around your data.
  //Print all the data.

  object Cohort2 extends Enumeration {
    val Sandra, Ash, Dorothea, Waris, Nimo, Tudor, Eloise, Lan, Farnoosh = Value
  }
  println(Cohort2.values) //all the data
  println(Cohort2.Sandra) //Sandra


//CASE OBJECT ENUMERATION
  //Now turn these enums into case object type enumeration.
//I've created a sealed trait called CohortCaseObject

  sealed trait CohortCaseObject
  case object Sandra extends CohortCaseObject
  case object Ash extends CohortCaseObject
  case object Dorothea extends CohortCaseObject
  case object Waris extends CohortCaseObject
  case object Nimo extends CohortCaseObject
  case object Tudor extends CohortCaseObject
  case object Eloise extends CohortCaseObject
  case object Lan extends CohortCaseObject
  case object Farnoosh extends CohortCaseObject

  //I still want to print the values, what can I do?
  //need a def method

  //I'm calling my method aboutCohort
  def aboutCohort(cohortCaseObject: CohortCaseObject): String = cohortCaseObject match {
    case Sandra => "I am Sandra"
    case Ash => "I am Ash"
    case Dorothea => "I am Dorothea"
    case Waris => "I am Waris"
    case Nimo => "I am Nimo"
    case Tudor => "I am Tudor"
    case Eloise => "I am Eloise"
    case Lan => "I am Lan"
    case Farnoosh => "I am Farnoosh"
  }

  println(aboutCohort(Sandra)) //




}


/** package Week3.Thurs
 *
 * object Enums extends App{
 *
 *
 * //Working with a finite sets of data.
 * //Syntax is 'extends Enumeration' & wrap it in an object
 *
 * //1ST WAY TO DO THIS:
 * // we could write in a list which is uselful when we have acronyms like VAT:
 * //assign it to a val
 *
 *
 * object Weekday extends Enumeration {
 *
 * object Weekday extends Enumeration {
 * val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
 * }
 *
 * println(Weekday.values)
 * println(Weekday.Monday)
 * //grouped all together and accessed as a group and use the syntax 'Value'
 * //we are assigning the days of the week to Value with a caps and call it values with a small letter
 *
 *
 * //2ND WAY TO DO THIS:
 *
 * // How would  we split them up? needs to be wrapped in an object for grouping purposes
 * //Below is useful with acronyms
 * //'Extends Enumeration'
 * //("Mon" is being assigned its ow specific value)
 *
 * object BetterWeekday extends Enumeration {
 * val Monday  = Value("Mon")
 * val Tuesday  = Value("Tue")
 * val Wednesday  = Value("Wed")
 * val Thursday = Value("Thurs")
 * val Friday = Value("Fri")
 * val Saturday = Value("Sat")
 * val Sunday = Value("Sun")
 * }
 * println(BetterWeekday.values)
 * println(BetterWeekday.Sunday)
 * //assigns the own specific value of "mon", "tues", "weds" etc
 *
 *
 *
 * //PATTERN MATCH EXAMPLE
 * def matchWithEnum(weekdays: BetterWeekday.Value)= {
 * weekdays match {
 * case BetterWeekday.Monday => println(s"Oh, it's ${BetterWeekday.Monday}")
 * case BetterWeekday.Tuesday => println(s"Oh, it's ${BetterWeekday.Tuesday}")
 * case BetterWeekday.Wednesday => println(s"Oh, it's ${BetterWeekday.Wednesday}")
 * case BetterWeekday.Thursday => println(s"Oh, it's ${BetterWeekday.Thursday}")
 * case BetterWeekday.Friday => println(s"Oh, it's ${BetterWeekday.Friday}")
 * case BetterWeekday.Saturday => println(s"Oh, it's ${BetterWeekday.Saturday}")
 * case BetterWeekday.Sunday => println(s"Oh, it's ${BetterWeekday.Sunday}")
 * }
 * }
 * matchWithEnum(BetterWeekday.Saturday)
 *
 *
 * //We want an exhaustive match - all enums are assigned a match case.
 * //We don't see an error message/warning if it isn't. (We could miss values)
 *
 * object ReorderedWeekday extends Enumeration {
 * val Monday  = Value(1)
 * val Tuesday  = Value(2)
 * val Wednesday  = Value(3)
 * val Thursday = Value(4)
 * val Friday = Value(5)
 * val Saturday = Value(6)
 * val Sunday = Value(0)
 * }
 * println(ReorderedWeekday.values)
 * //Gives us sunday at the beginning of the list now
 *
 *
 * //SEALED CASE OBJECTS
 * //Preferred way we have already started doing this
 * //rather than wrap in an pbject, we already have a sepearte object so extend a trait
 * //If I have a sealed trait I can only access it in this file
 * //Downside is there is not an easy way to print them all out but we get extra methods
 * //we don't have default ordering, if we know something that needs to be ordered it is better to use standard enumeration?
 *
 *
 *
 *
 * sealed trait Weekday
 * case object Monday extends Weekday
 * case object Tuesday extends Weekday
 * case object Wednesday extends Weekday
 * case object Thursday extends Weekday
 * case object Friday extends Weekday
 * case object Saturday extends Weekday
 * case object Sunday extends Weekday
 *
 *
 * //custom errors
 * //  my custom error has a name or a description of some sort and then an error code
 * abstract class Error (name: String, errorCode:Int)
 * case object NotFound extends Error("Not found", 404)
 *
 * //I can have as many custom errors as I want
 * case object HairColourError extends Error("Hair colour is invalid", 404)
 * }
 */