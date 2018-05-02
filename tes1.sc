
"asdasd".groupBy(_.toChar).map {
  case(k,v) => (k,s"$k${v.size}")
}.values.mkString


