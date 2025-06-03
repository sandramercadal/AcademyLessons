def reverseWords(str: String): String = {
  str.split(" ").reverse.mkString(" ")
}
println(reverseWords("World Hello"))