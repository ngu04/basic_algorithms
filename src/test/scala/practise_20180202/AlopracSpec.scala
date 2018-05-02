package practise_20180202

import org.scalatest.{FunSpec, Matchers}

/**
  * Created by ngu04 on 03/02/2018.
  */
class AlopracSpec extends FunSpec with Matchers{

  import  Aloprac._
  it("fibonacci for n numbers") {
    fibonanci(0) should be  (0)
    fibonanci(1) should be  (1)
    fibonanci(2) should be (1)
    fibonanci(3) should be (2)
    fibonanci(4) should be (3)
    fibonanci(5) should be (5)
    fibonanci(6) should be (8)
    fibonanci(7) should be (13)
  }

  it("factorail for n number") {
    factorial(1) shouldBe 1
    factorial(2) shouldBe 2
    factorial(3) shouldBe 6
    factorial(4) shouldBe 24
  }

  it("Max should return largest in list"){
    max(List(1,4,5,51,2)) should be (51)
  }

  it("practise list assert") {
    List(1,3) should contain (3)

    List(1,2,3,5,6) should contain atLeastOneOf (1,7,8)

    List(1,2,3,5,6) should contain (1)

    List(1,2) should equal(List(1,2))

  }


}
