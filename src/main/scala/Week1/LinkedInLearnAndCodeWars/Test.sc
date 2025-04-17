//def stringToInt (input2: String): Int = {
//  input2.toInt
//}
//
//println(stringToInt("12345"))
//
//def stringToNumber(string: String): Int = {
//  string.toInt
//}
//
//
//val num1 = stringToNumber("1234")
//val num2 = stringToNumber("-7")

//def removeStringSpace (string: String): String = {
//  string.replaceAll(" ", "")
//}
//println(removeStringSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))

def stringClean(string: String): String = {
  string.replaceAll("\\d", "")  // Regex \\d
}
println(stringClean("1Mary12345"))