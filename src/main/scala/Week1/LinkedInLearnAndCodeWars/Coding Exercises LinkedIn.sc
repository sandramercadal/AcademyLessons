/** Q1 - Create a Palindrome function - this code checks if a given word is a palindrome by comparing the original word (in lowercase) with its reverse. If they match, it indicates that the word reads the same forwards and backwards. */
object Palindrome {

  def isPalindrome(word: String): Boolean = {
  val lower = word.toLowerCase//converts word to lowercase and stores it in a new variable called lower so palindrome is not case-sensitive.
  lower.reverse == lower//checks reversed version of the lower string is equal to the original lower string.
  }
}
println(Palindrome.isPalindrome("Kayak")) //true
println(Palindrome.isPalindrome("sandra")) //false

