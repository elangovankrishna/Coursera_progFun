package week04

/**
  * Created by ke20506 on 12/30/2016.
  */

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

