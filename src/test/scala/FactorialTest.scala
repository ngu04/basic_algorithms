import org.scalatest.{Matchers, WordSpec}

/**
  * Created by ngu04 on 13/12/2017.
  */
class FactorialTestSpec extends WordSpec with Matchers {

  "Factorial" should {
    "Nth factor" in {
      //4*3*2*1
      6 shouldBe Factorial.factorial(3)
      24 shouldBe Factorial.factorial(4)
      3628800 shouldBe Factorial.factorial(10)
    }
  }




}
