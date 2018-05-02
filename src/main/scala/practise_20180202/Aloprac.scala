package practise_20180202

/**
  * Created by ngu04 on 03/02/2018.
  */
object Aloprac {
  //0,1,1,2,3,5,8,13,21,34
  def fibonanci(n:Int,previous:Int = 0 ,next:Int = 1) :Int = n match {
      case 0 => previous
      case 1 => next
      case _ => fibonanci(n-1,next,previous+next)

  }

  def factorial(n:Int,acc:Int = 1) : Int = {
    if(n <= 0) acc
    else factorial(n-1,acc * n)
  }

  def max (list:List[Int],num:Int = 0) : Int = list match {
    case head :: tail => if(head > num) max(tail,head) else max(tail,num)
    case _ => num
  }

}
