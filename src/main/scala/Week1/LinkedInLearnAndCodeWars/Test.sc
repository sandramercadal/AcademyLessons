
////def boolToWord(boolean: Boolean): String = boolean match {
////  case true => "Yes"
////  case false => "No"
////}

def booleanToString(b: Boolean): String = b.toString
println(booleanToString(false))
//or
def booleanToString2(value: Boolean): String = {
  if (value) {
    "true"
  } else {
    "false"
  }

}
println(booleanToString2(false))

/**Define a function that removes duplicates from an array of non negative numbers and returns it as a result.
 The order of the sequence has to stay the same.
 Examples:
 Input -> Output
 [1, 1, 2] -> [1, 2]
 [1, 2, 1, 1, 3, 2] -> [1, 2, 3]**/
def distinct(xs: Seq[Int]): Seq[Int] = xs.distinct
// Example usage:
println(distinct(Seq(1, 2, 2, 3)).mkString(", ")) // Output: 1, 2, 3