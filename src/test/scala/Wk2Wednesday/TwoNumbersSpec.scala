

//I need to extend the test file and I want to add Any flat spec
//anything you want here to describe the test parameters.
//"in" is final key word before run
//import Week2.Weds.TwoNumbers
//import org.scalatest.flatspec.AnyFlatSpec

  //Error catch
  //We want to test edge cases. We want our tests to be able to fail but they still need to  compile.
  //A test passes because we expect it to fail or hit our error catch. writting a failing test. The method inside is a fail. f
  //In Scala we test to fail

package Wk2Wed

import Week2.Weds.TwoNumbers
import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add x and y" in {
    val numbers = new TwoNumbers(1,2) //making a new instance of my class so I can access the methods like we did with our dogs
    assert(numbers.add == 3) //this will return a boolean. Method == Expected
  }

  "subtract" should "subtract x from y" in { //y-x = 2-1 Notice the order
    val numbers = new TwoNumbers(1, 2)
    assert(numbers.subtract == 1)
  }

  "multipy" should "multipy x and y" in {
    val numbers = new TwoNumbers(4, 5)
    assert(numbers.multipy == 20)
  }
}
  // We want to test edge cases. We want our tests to be able to fail, but they still need to compile.
  //  "multipy" should "error when the input is a double" in {
  //    val numbers = new TwoNumbers(4.5, 5)
  //    assert(numbers.multipy != 22)
  //  }


