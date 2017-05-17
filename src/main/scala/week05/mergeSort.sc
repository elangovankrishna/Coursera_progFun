object mergeSort {

  /** we could use math.ordering and instead of (lt: (T, T) => Boolean
    * we can use (ord: ordering[T] in the signature*/
  def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {

    val n = xs.length/2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {

        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x:: xs1, y::ys1) =>
          /** instead we can use ord.lt(x,y) */
          if (lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }

  }


  val testList = List(1, -4, 5, 7,2)
  /** Instead we can use (Ordering. Int */
  msort(testList)((x: Int, y: Int) => x < y)


  val testString = List("apple", "pinaple", "apricot", "berry", "cantelope")
  /** Instead we can use (Ordering. String */
  msort(testString)((x: String, y: String) => x.compareTo(y) < 0)
}