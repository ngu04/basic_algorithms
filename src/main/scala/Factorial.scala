/**
  * Created by ngu04 on 13/12/2017.
  */
object Factorial {

  def factorial(n:Int) : Int = {

    def go(n:Int,accu:Int) : Int = {
      if (n <= 0 ) accu
      else go(n - 1, n * accu)
    }

    go(n,1)

  }

  //
  def fibonacci(count :Int , previous:Int=0,next:Int=1) : Int = {
    count match {
      case 0 => previous
      case 1 => next
      case _ => fibonacci(count - 1 ,next, previous + next)
    }
  }

}
