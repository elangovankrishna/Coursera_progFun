object sqrtNewtonsWay {

  def abs(x: Double) = if (x <0) -x else x

    def sqrt(x: Double) = {
/** We Defined the Newtons Sqrt method using Blocks
  * and Removed using X inside the block since its passed as is*/
    def sqrtIter(guess: Double): Double =
      if (isGoodEnf(guess)) guess
      else
        sqrtIter(improve(guess))

    def isGoodEnf(guess: Double) =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

 sqrt(2)
  sqrt(4)
  sqrt(1e60)
}
