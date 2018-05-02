/**
  * Created by ngu04 on 01/12/2017.
  */
object Algorithms {

  //find largest Number in List
  def largestFromList(num: Int, list: List[Int]): Int = {
    list match {
      case head :: tail => if (head > num) largestFromList(head, tail) else largestFromList(num, tail)
      case _ => num
    }
  }

  def largestFromListUsingFoldLeft(list: List[Int]): Int = {
    list.foldLeft(0)((a, b) => if (a > b) a else b)
  }


  def smallestFromListUsingFoldLeft(list: List[Int]) : Int = {
    list.foldLeft(Int.MaxValue)((a,b) => if(a < b) a else b)
  }


  def findSumOfTwo(total: Int, list: List[Int]): List[Option[(Int, Int)]] =  {
//    val a: Int = list.foldLeft(0)((a, b) => if((a+b) == total) Some(a,b) else None)
    for {
      (a,b) <- list.zipWithIndex
      (x,y) <- list.zipWithIndex
      if ((b != y) && (a + x  == total))
    } yield Option(a,x)
  }

  def sortList(list:List[Int]) = {
    list.sorted
  }

  def countSameLetters(list:List[String]) = {
    list.map { k =>
      val a = k.groupBy(_.toChar).map {
        case(k1,v1) => (k1->s"$k1${v1.size}")
      }.values.toList.sorted.mkString
      k -> a
    }.toMap
  }


  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) : Boolean = {

    def go(n:Int) : Boolean = {
      if(n >= as.length - 1) true
      else if(ordered(as(n),as(n+1))) false
      else go(n+1)
    }

    go(0)
  }

  def fibonacci(n:Int, previous:Int,next:Int): Int  = n match {
      case 0 => previous
      case 1 => next
      case _ => fibonacci(n - 1, next, next + previous)
  }

  def factorial(n:Int) = {
    def go(x:Int,acc:Int) :Int  = {
      if(x <= 0 ) acc
      else go(x-1,acc * x)
    }
    go(n,1)
  }


}
