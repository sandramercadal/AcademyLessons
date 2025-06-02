//package ChildBenefit
//
//import org.scalatest.matchers.should.Matchers
//import org.scalatest.wordspec.AnyWordSpec
//
//
//class ChildBenefitSpec extends AnyWordSpec with Matchers {
//
//  // all tests for the first method
//  "isChildEligible" should {
//    "return true" when {
//      "child is younger than 16 and in education" in {
//        val child = ChildInFamily(age = 15, inEducation = true, isDisabled = false)
//        val result = ChildBenefit.isChildEligible(child)
//        val expectedResult = true
//        result shouldBe expectedResult
//      }
//    }
//  }
//
//  "return true" when {
//    "child is younger than 16 and not in Education" in {
//      val child = ChildInFamily(age = 15, inEducation = false, isDisabled = false)
//      val result = ChildBenefit.isChildEligible(child)
//      val expectedResult = true
//      result shouldBe expectedResult
//    }
//  }
//
//  "return true" when {
//    "child is between 16 and 19 and is in Education" in {
//      val child = ChildInFamily(age = 17, inEducation = true, isDisabled = false)
//      val result = ChildBenefit.isChildEligible(child)
//      val expectedResult = true
//      result shouldBe expectedResult
//    }
//  }
//
//  "return false" when {
//    "child is between 16 and 19 and is not in Education" in {
//      val child = ChildInFamily(age = 17, inEducation = false, isDisabled = false)
//      val result = ChildBenefit.isChildEligible(child)
//      val expectedResult = false
//      result shouldBe expectedResult
//    }
//  }
//
//  "return false" when {
//    "child is 20 and in education" in {
//      val child = ChildInFamily(age = 20, inEducation = true, isDisabled = false)
//      val result = ChildBenefit.isChildEligible(child)
//      val expectedResult = false
//      result shouldBe expectedResult
//    }
//  }
//
//  "return false" when {
//    "child is 20 and not in education" in {
//      val child = ChildInFamily(age = 20, inEducation = false, isDisabled = false)
//      val result = ChildBenefit.isChildEligible(child)
//      val expectedResult = false
//      result shouldBe expectedResult
//    }
//  }
//
//  "return false" when {
//    "child is 22 and in education" in {
//      val child = ChildInFamily(age = 22, inEducation = true, isDisabled = false)
//      val result = ChildBenefit.isChildEligible(child)
//      val expectedResult = false
//      result shouldBe expectedResult
//    }
//  }
//
//  //tests for 2nd method
//  "additionalDisabledBenefitRate" should {
//    "return 0" when {
//      "no child has a disability" in {
//        val child = List(ChildInFamily(10, true, false))
//        val income = 500000
//        val result = ChildBenefit.additionalDisabledBenefitRate(child, income)
//        val expectedResult = 0
//        result shouldBe expectedResult
//      }
//    }
//
//    "return 0" when {
//      "child has a disability and income over 100k" in {
//        val child = List(ChildInFamily(10, true, true))
//        val income = 110000
//        val result = ChildBenefit.additionalDisabledBenefitRate(child, income)
//        val expectedResult = 0
//        result shouldBe expectedResult
//      }
//    }
//
//    "return 3.85" when {
//      "if  one child has a disability and income is 50k" in {
//        val child = List(ChildInFamily(10, true, true))
//        val income = 50000
//        val result = ChildBenefit.additionalDisabledBenefitRate(child, income)
//        val expectedResult = 3.85
//        result shouldBe expectedResult
//      }
//    }
//
//    "return 3.85" when {
//      "if one child has a disability, another child has no disability and income is 50k" in {
//        val child = List(ChildInFamily(10, true, true), ChildInFamily(15, true, false))
//        val income = 50000
//        val result = ChildBenefit.additionalDisabledBenefitRate(child, income)
//        val expectedResult = 3.85
//        result shouldBe expectedResult
//      }
//    }
//
//    "return 7.70" when {
//      "if two children have a disability, another child has no disability and income is 50k" in {
//        val child = List(ChildInFamily(10, true, true), ChildInFamily(8, true, true), ChildInFamily(15, true, false))
//        val income = 50000
//        val result = ChildBenefit.additionalDisabledBenefitRate(child, income)
//        val expectedResult = 7.70
//        result shouldBe expectedResult
//      }
//    }
//
//    "return 7.70" when {
//      "if two children have a disability and income is 50k" in {
//        val child = List(ChildInFamily(10, true, true), ChildInFamily(12, true, true))
//        val income = 50000
//        val result = ChildBenefit.additionalDisabledBenefitRate(child, income)
//        val expectedResult = 7.70
//        result shouldBe expectedResult
//      }
//    }
//  }
//
//  //tests for 3rd method
//  "calculateWeeklyAmount" should {
//    "return £26.05" when {
//      "TC1 - child is 10, in education, no disabilities" in {
//        val children = List(ChildInFamily(10, true, false))
//        val income = 45000
//        val result = ChildBenefit.calculateWeeklyAmount(children, income)
//        val expectedResult = 26.05
//        result shouldBe expectedResult
//      }
//    }
//
//    "return £43.30" when {
//      "TC2 - children 8 and 17, in education, no disabilities" in {
//        val children = List(ChildInFamily(8, true, false), ChildInFamily(17, true, false))
//        val income = 45000
//        val result = ChildBenefit.calculateWeeklyAmount(children, income)
//        val expectedResult = 43.30
//        result shouldBe expectedResult
//      }
//    }
////
////    "return £2.88" when {
////      "TC3 - child is 10, in education, no disability, income over 50k" in {
////        val children = List(ChildInFamily(10, true, false))
////        val income = 55000
////        val result = ChildBenefit.calculateWeeklyAmount(children, income)
////        val expectedResult = 2.88
////        result shouldBe expectedResult
////      }
////    }
////
////    "return £11.54" when {
////      "TC4 - 2 children 5 and 18, in education, no disability, income 60k" in {
////        val children = List(ChildInFamily(5, true, false), ChildInFamily(18, true, false))
////        val income = 60000
////        val result = ChildBenefit.calculateWeeklyAmount(children, income)
////        val expectedResult = 11.54
////        result shouldBe expectedResult
////      }
////    }
////
////    "return 0" when {
////      "TC5 - one child, age 17, in education, no disability" in {
////        val children = List(ChildInFamily(17, false, false))
////        val income = 40000
////        val result = ChildBenefit.calculateWeeklyAmount(children, income)
////        val expectedResult = 0
////        result shouldBe expectedResult
////      }
////    }
////
////    "return 0" when {
////      "TC7 - 2 children, in education, no disability, income over 100000" in {
////        val children = List(ChildInFamily(10, true, false), ChildInFamily(14, true, false))
////        val income = 101000
////        val result = ChildBenefit.calculateWeeklyAmount(children, income)
////        val expectedResult = 0
////        result shouldBe expectedResult
////      }
////    }
////  }
////
////
////    //method 4
////    "finalTotalValue" should {
////      "return 51" when {
////        "TC6 - two children 7 and 16 in education with disability, income 45k" in {
////          val children = List(ChildInFamily(7, true, true), ChildInFamily(16, true, true))
////          val income = 45000
////          val result = ChildBenefit.finalTotalValue(children, income)
////          val expectedResult = 51
////          result shouldBe expectedResult
////        }
////      }
////
////      "return 6.73" when {
////        "TC6 - one child age 9 with disability, income 55k" in {
////          val children = List(ChildInFamily(9, true, true))
////          val income = 55000
////          val result = ChildBenefit.finalTotalValue(children, income)
////          val expectedResult = 6.73
////          result shouldBe expectedResult
////        }
////      }
////    }
//  }


