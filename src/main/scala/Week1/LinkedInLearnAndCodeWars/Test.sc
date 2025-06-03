def reverseWords(text: String): String = {
  text.split(" ").map(_.reverse).mkString(" ")
}
println(reverseWords("World Hello"))