object listFunctions {

  val letr = List('a', 'b', 'c', 'd')

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n+1)

  removeAt(2, List(1,4,3,6))
}

val testList = List(2, 3, 4, 5, 6)

var testTake = (testList take 2)


