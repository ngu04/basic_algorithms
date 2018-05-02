import scala.annotation.tailrec

object Fibonacci {

  //https://alvinalexander.com/scala/scala-recursion-examples-recursive-programming

    @tailrec
    def getFibonacciNumber(x: Int, previous: Int = 0, next: Int = 1) : Int = {
      x match {
        case 0 => previous
        case 1 => next
        case _ => getFibonacciNumber(x - 1, next, next + previous)
      }
    }

  }
