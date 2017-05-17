object inserationSort {

  def isort(xs: List[Int]): List[Int] = xs match {

    case List() => List()
    case y::ys => insert(y, ys)
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {

    case List() => List(x)
    case y::ys => if(x <= y) x :: xs else y :: insert(x, ys)

  }

isort(List(7,3,9,2,4))

}