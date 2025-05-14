
////def boolToWord(boolean: Boolean): String = boolean match {
////  case true => "Yes"
////  case false => "No"
////}

//def booleanToString(b: Boolean): String = b.toString
//println(booleanToString(false))
////or
//def booleanToString2(value: Boolean): String = {
//  if (value) {
//    "true"
//  } else {
//    "false"
//  }
//
//}
//println(booleanToString2(false))
//
//def reverseLetter(str: String): String = {
//  str.filter(_.isLetter).reverse
//
//}
//println(reverseLetter("Sandra101"))

//case class Person(name: String) {
//
//  def greet(otherName: String): String = {
//    s"Hello $otherName, my name is $name"
//  }
//}
//val joe = Person("Joe")
//println(joe.greet("Kate"))


//def maps(xs: List[Int]): List[Int] =
//  xs.map(_ * 2)

object Kata {

  def maps(xs: List[Int]): List[Int] = for {
    x <- xs
  } yield x * 2
}
println(Kata.maps(List(1, 2, 3)))