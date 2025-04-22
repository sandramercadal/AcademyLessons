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

def hoopCount(number: Int): String = {
  if (number >= 10) s"Great, now move on to tricks"
  else s"Keep at it until you get it"
}
println(hoopCount(1))