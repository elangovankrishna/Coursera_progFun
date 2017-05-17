object listFun {

  val chars = List("a", "a", "b", "b", "b", "c", "c", "c", "c" )

  def pack[T](xs: List[T]): List[T] = xs match {

    case Nil => Nil
    case y1 :: ys1 =>
      val (first, rest) = xs span(y =>  y == y1)
      first :: pack(rest)
  }

  pack(chars)

}