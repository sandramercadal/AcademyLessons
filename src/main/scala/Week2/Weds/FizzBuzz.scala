package Week2.Weds

class FizzBuzz { //doesn't take parameters

  def fizzBuzz (x: Int): String = {
    if (x % 3 == 0 && x % 5 == 0 && x != 0) {
      "FizzBuzz"
    } else if (x % 3 == 0 && x != 0) { // if the number divides perfectly into 3 and is not zero
      "Fizz"
    } else if (x % 5 == 0 && x != 0) {
      "Buzz"
    } else { //if anything else
      x.toString
    }
  }

}

//Zero should hit our else case as everywhere else we have specified != 0

//SPEC FILE : create FizzBuckSpec that sits under Scala Test not Scala Main
//val of fizzbuzz
