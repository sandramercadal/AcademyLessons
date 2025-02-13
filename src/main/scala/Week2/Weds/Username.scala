
//The username must be equal to or more than 8 letters long.
//It must be all lowercase.
//Both of the above need to be met to be true.
//Anything else at all will return a false, even if there is a Caps in there etc
//Retuning a Boolean

//Focus on the testing here


package Week2.Weds


// Username must be equal to or more than 8 letters long.
// Must be all lowercase
class Username {

  def checkUsername (username: String): Boolean = {
    if (username.length >= 8 && username.toLowerCase == username){
      true
    } else {
      false
    }
  }

}



