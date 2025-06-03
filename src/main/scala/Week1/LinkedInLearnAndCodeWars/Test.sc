def reverseAndRemoveNonAlpha (string: String): String = {
  string.filter(_.isLetter).reverse
}


println(reverseAndRemoveNonAlpha("krishan"))


