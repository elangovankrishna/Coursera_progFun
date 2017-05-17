object overrides {

}

var t1 = new Sub
t1.y
t1.x

/** Override keyword is needed to redefine an implemented method on the base class*/

abstract class Base{
  def x = 1
  def y: Int
  }

class Sub extends Base {
  override def x = 2
  def y = 4
}