/**
 * Samantha wants to buy a flat.
 * She earns £45,000 per annum and has a deposit of £20,000.
 * The flat she wants to buy is £280,000.
 * Her credit score is 577.
 *
 * Conditions:
 * Mortgage = x4 salary per annum
 * Deposit = 10% of purchase price
 * Minimum credit score to qualify for a mortgage = 550
 *
 * Write the logic to validate whether:
 * 1. She is able to get a mortgage and if so, how much can she borrow?
 * 2. She can purchase her flat at the current asking price.
 * 3. EXT: Write a test spec
 *
 * Break it down into steps:
 * Write a method to calculate the maximum mortgage someone can get.
 * Write a method to check if the credit score is high enough to secure a mortgage.
 * Write a method to check if the deposit is enough based on the purchase price.
 * Now, put this together to evaluate task a.
 * Now, task b, use a for comp and the methods you have written above to determine if she can purchase the flat.
 */

case class Person (name: String, salary: Int, deposit: Double, creditScore: Int)

//STEP 1
def maxMortgage(salary: Int) : Int = salary * 4


//Def + case object/s x3 or structure another way

