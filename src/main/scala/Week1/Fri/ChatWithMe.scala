package Week1.Fri

import scala.io.StdIn.readLine

/**EXTENSION

1. Write a function to interact with the terminal. If you enter the word ”Hello”, have the
  command line return “Hello X”, where X is a given name.
2. Expand on your basic terminal interaction from above. Have a small conversation given
specific inputs (this can be about anything you like; weather, films, sports…)
*/

object ChatWithMe extends App{

val whatIsYourName = (name: String) => print(s"Hi $name!") //Sandra
  whatIsYourName(readLine("what's your name?")) //Hi Sandra

  val whatIsTheWeatherLikeToday = (weather: String) => print(s"Today it is $weather!") //Hi  Sandra!what's the weather like today? sunny
  whatIsTheWeatherLikeToday(readLine("what's the weather like today?")) //Today it is  sunny!

  val whatIsTodaysDate = (date: String) => print(s"Today's date is the $date") // 8th
  whatIsTodaysDate(readLine("what's the date today?")) //Today's date is the  8th
}
