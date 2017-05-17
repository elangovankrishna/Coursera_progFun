package week02

/**
  * Created by ke20506 on 12/27/2016.
  */
class Rational(x:Int, y:Int) {

  require(y != 0, "Denom number must be a nonzero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a%b)
  private val g = gcd(x,y)
  def numer = x / g
  def denom = y / g

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def whichIsMax(that: Rational) = if (this.less(that)) that else this

  def add(that: Rational) =

    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg: Rational = new Rational (-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString: String = numer + "/" + denom
}
