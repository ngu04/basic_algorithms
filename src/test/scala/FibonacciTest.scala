
import org.scalatest.{Matchers, WordSpec}

/**
  * Created by ngu04 on 01/12/2017.
  */
//0,1,2,3,4,5,6,7,8,9,10,11
//0,1,1,2,3,5,8,13,21,34,55

class FibonacciTest extends WordSpec with Matchers {

  "Fibonacci series"  should {
    "give 2 st number in series" in  {
      val nthNumber = Fibonacci.getFibonacciNumber(2)
      nthNumber shouldEqual 1
    }

    "give number in series" in  {
      val nthNumber = Fibonacci.getFibonacciNumber(7)
      nthNumber shouldEqual 13
    }


    "given nth number in series" in {
      3 shouldBe Factorial.fibonacci(4)
      5 shouldBe Factorial.fibonacci(5)
      8 shouldBe Factorial.fibonacci(6)
    }



  }


}
