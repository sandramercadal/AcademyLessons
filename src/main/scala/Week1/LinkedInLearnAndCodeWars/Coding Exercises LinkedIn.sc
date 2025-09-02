/** Q1 - Create a Palindrome function - this code checks if a given word is a palindrome by comparing the original word (in lowercase) with its reverse. If they match, it indicates that the word reads the same forwards and backwards. */
object Palindrome {

  def isPalindrome(word: String): Boolean = {
    val lower = word.toLowerCase //converts word to lowercase and stores it in a new variable called lower so palindrome is not case-sensitive.
    lower.reverse == lower //checks reversed version of the lower string is equal to the original lower string.
  }
}

println(Palindrome.isPalindrome("Kayak")) //true
println(Palindrome.isPalindrome("sandra")) //false

/** Q2 - Simple passwd checker which must meet character req */
object PasswordChecker {

  object PasswordChecker {

    def hasPunctuation(string: String): Boolean =
      string.exists(char =>
        char == '.' ||
          char == ',' ||
          char == ';' ||
          char == ':' ||
          char == '?' ||
          char == '!' ||
          char == '"' ||
          char == '_' ||
          char == ')' ||
          char == '('
      )

    def isValidPassword(password: String): Boolean =
      password.size >= 8 && //character length
        password.exists(_.isUpper) && //is Uppercase
        password.exists(_.isLower) && //is lowercase
        (password.exists(_.isDigit) || hasPunctuation(password)) // create own hasPunctuation def and pass it the password
  }


