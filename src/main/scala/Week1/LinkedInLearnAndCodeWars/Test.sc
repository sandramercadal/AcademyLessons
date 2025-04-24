//Make a function that returns the value multiplied by 50 and increased by 6. If the value entered is a string it should return "Error".

//def valueMultipliedPlus6 (int: Int) :Int {
// int x 50 + 6 else "error"
//}

//def valueMultipliedPlus6(value: Any): Any = {
//  value match {
//    case i: Int => i * 50 + 6
//    case _ => "Error"
//  }
//}
//println(valueMultipliedPlus6(1))

//def sameCase(a: Char, b: Char): Int = {
//  if (!a.isLetter || !b.isLetter) {
//    return -1
//  }
//  else if ((a.isUpper && b.isUpper) || (a.isLower && b.isLower)) {
//    return 1
//  }
//  else {
//    return 0
//  }
//}
//println(sameCase('U', '9'))

//def stringToNumber(string: String): Int= string.toInt
//println(stringToNumber("23"))
//
//def peopleWithAgeDrink(age: Int): String = {
//  if (age < 14)"drink toddy"
//  else if (age < 18 )"drink coke"
//  else if (age < 21 )"drink beer"
//  else "drink whisky"
//}
//println(peopleWithAgeDrink(20))

//def cost(days: Int): Int = {
//  val dailyCarRental = 40
//  val initialCost = dailyCarRental * days
//
//  if (days >= 7) {
//    initialCost - 50
//  } else if (days >= 3) {
//    initialCost - 20
//  }
//  else
//    initialCost
//}
//
//println(cost(7))




def boolToWord(boolean: Boolean): String = boolean match {
  case true => "Yes"
  case false => "No"
}
println(boolToWord(true)) //Yes