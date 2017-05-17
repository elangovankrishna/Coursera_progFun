package week04

/**
  * Created by ke20506 on 12/29/2016.
  * This program is to work on Natural numbers meaning to check and see if the given number is non negative using FIRST PRINCIPLES
  */

// PEANO NUMBERS - technical term
abstract class Nat {

  def isZero: Boolean
  def predecessor: Nat
  /**def successor: Nat - this was the same implementation on both sub classes */
  def successor = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat

}

object Zero extends Nat {

  def isZero: Boolean = true
  def predecessor = throw new Error("0.predecessor")
  /** def successor =  new Succ(this) */
  def +(that: Nat) = that
  def -(that: Nat) = if (isZero) this else throw new Error("negative number")
}

class Succ(n: Nat) extends Nat{

  def isZero = false
  def predecessor = n
  /** def successor = new Succ(this) */
  def +(that: Nat) = this + that
  def -(that: Nat) = if (that.isZero) this else n - that.predecessor
}

