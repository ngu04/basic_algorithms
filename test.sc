
val stringList = List("APPLE","BANANA")

stringList.flatMap(x => x*2)

val list: Array[Int] = Array(1,2,3,null)

list.map(x => List(x * 2))
list.flatMap(x => List(x * 2))



list.fold(1)((a,b) => a * b)

list.foldLeft(0)((a,b) => a + b)
list.foldRight(0)((a,b) => a + b)


list.reduce((a,b) => a + b)


val intList  = List(1,2,4,5,3)



val result: List[(Int, Int)] = for {
  x <- intList
  y <- intList
  if(x+y) == 7
} yield (x,y)





