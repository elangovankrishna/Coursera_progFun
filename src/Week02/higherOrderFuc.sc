object week02 {

  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else
        loop(a + 1, f(a) + acc)
      loop(a, 0)
  }

  sum(x => x, 3 , 5)

  def factSum(f: Int => Int)(a: Int, b: Int): Int = {

    if (a > b) 1 else f(a) * factSum(f)(a+1, b)
  }
  factSum(fact)(3,4)

  def fact(n: Int): Int = if (n == 0) 1 else n * fact(n-1)


  def sumTest(f: Int => Int)(a: Int, b:Int): Int = {
      if (a > b) 0
      else f(a) + sumTest(f)(a+1, b)
  }

  sumTest(x => x * 2)(1,1)
}