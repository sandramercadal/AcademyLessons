package ChildBenefit


object ChildBenefit extends App {
  val EldestChildRate = 26.05 //per week
  val FurtherChildRate = 17.25 //per week
  val reducedRateOneChild = 2.88 //per week
  val reducedRateTwoOrMore = 5.77 //per week per child
  // val fullChildBenefit = 500.0 //per year ??? 500
  // val reducedRateTwoOrMoreBenefit = 300.0 //per year  ??? 300
  // val reducedRateLessThanTwoBenefit = 150.0 //per year ??? 150
  val additionalDisabledRateBenefit = 200.0 //per year

  def isChildEligible(childInFamily: ChildInFamily): Boolean = {
    if (childInFamily.age < 16) true
    else if (childInFamily.age < 20 && childInFamily.inEducation) true
    else false
  }

  //  /** disabled child rate * */
  def additionalDisabledBenefitRate(children: List[ChildInFamily], income: Int): BigDecimal = {
    val countChildrenWithDisability = children.filter(_.isDisabled == true)
    if (countChildrenWithDisability.nonEmpty && income <= 100000)
      countChildrenWithDisability.length * 3.85
    else
      BigDecimal(0)
  }


  def calculateWeeklyAmount(children: List[ChildInFamily], income: Int): BigDecimal = {
    val eligible = children.filter(isChildEligible)

    eligible match {
      case Nil => BigDecimal(0) // Case when there are no eligible children
      case _ if income <= 50000 =>
        BigDecimal(EldestChildRate) + (eligible.length - 1) * BigDecimal(FurtherChildRate)
      case _ if income >= 50001 && income <= 100000 && eligible.length == 1 =>
        BigDecimal(reducedRateOneChild)
      case _ if income >= 50001 && income <= 100000 && eligible.length >= 2 =>
        BigDecimal(reducedRateTwoOrMore) * eligible.length
      case _ => BigDecimal(0) // Default case
    }
  }

  def finalTotalValue(children: List[ChildInFamily], income: Int) = {
    calculateWeeklyAmount(children, income) + additionalDisabledBenefitRate(children, income)
  }

}
  //  def calculateYearlyAmountEldest (): Double = {
  //     ??? * ??? //we are expecting here EldestChildRate * 52
  //      }
  //
  //  def calculateYearlyAmountFurtherChild (): Double = {
  // ??? * ???
  // we are expecting here FurtherChildRate * 52
  //  }




/** or
 * def calculateWeeklyAmount(children: List[ChildInFamily]): BigDecimal = {
 * val eligibleCount = children.count(isChildEligible)
 * if (eligibleCount == 0) BigDecimal(0)
 * else BigDecimal(EldestChildRate) + (eligibleCount - 1) * BigDecimal(FurtherChildRate)
 * }
 *
 * OR
 * def calculateWeeklyAmount(children: List[ChildInFamily]): BigDecimal = {
 * val eligibleCount = children.count(isChildEligible)
 * BigDecimal(EldestChildRate) + (eligibleCount - 1).max(0) * BigDecimal(FurtherChildRate)
 * }
 * Using max(0): Instead of checking if eligibleCount is zero, we use (eligibleCount - 1).max(0). This ensures that if there are no eligible children, the additional amount is simply zero without a conditional statement.
 * Single Expression: The function now calculates and returns the result in a single expression, making it shorter and cleaner.
 *
 *
 * */












