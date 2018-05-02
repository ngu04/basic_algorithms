/**
  * Created by ngu04 on 29/11/2017.
  */
class Example {

  val list: List[List[Int]] = List(List(1,2,3),List(3,4,5),List(3,4,5,6))


  val a  = List(1,2,4,5,3)

  val result: List[(Int, Int)] = for {
    x <- a
    y <- a
    if(x+y) == 7
  } yield (x,y)


  result.map(println)

  val stringList = List("APPLE","BANANA")
  def getListFlatten = {
    stringList.flatMap( x =>  x * 2)
  }
}
