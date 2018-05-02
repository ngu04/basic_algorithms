import org.scalatest.{FunSpec, Matchers}

/**
  * Created by ngu04 on 01/12/2017.
  */
class AlogrithmsSpec extends FunSpec with Matchers {

  describe("Largest") {
    it("number") {
      val largest = Algorithms.largestFromList(0,List(1,5,7,9,19))
      largest == 19
    }

    it("number using foldLeft") {
      val largest = Algorithms.largestFromListUsingFoldLeft(List(1,54,7,9,19))
      largest == 54
    }
  }

  describe("Smallest") {
    it("numner in List") {
      val smallest = Algorithms.smallestFromListUsingFoldLeft(List(1,54,7,9,19))
      smallest shouldBe 1
    }
  }

  describe("Find combination of 2 number"){
   it("equal to total") {
     val resultList = Algorithms.findSumOfTwo(10,List(1,3,4,5,6,7))
     resultList should contain allOf (Some(3,7),Some(4,6))
   }
  }

  describe("Sorted List"){
    it("Get sorted List") {
      val resultSorted = Algorithms.sortList(List(4,7,9,1,2,45))
      resultSorted shouldBe List(1,2,4,7,9,45)
    }
  }

  describe("Count Char") {
    it("In the String") {
      val mapChar:Map[String,String] = Map("aaabba"->"a4b2","aabbb"->"a2b3")

      mapChar shouldBe Algorithms.countSameLetters(mapChar.keys.toList)
    }
  }


  describe("Check Sorted") {
    it("For the Integer greater") {

      true shouldBe Algorithms.isSorted(Array(1,2,3,4,5),(x:Int,y:Int) => x > y )

    }

  }


}
