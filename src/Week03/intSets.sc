object intsets {

}

val t1 = new NonEmpty(3, new emptySet, new emptySet)
val t2 = t1 incl 4
val t3 = t2 incl 2


/** Base or SupeClass IntSets as an Abstract class with just methods defined in them with no imp*/

abstract class IntSets{

  def incl(x: Int): IntSets
  def contains(x: Int): Boolean

}

/**subckasses of IntSets */

class emptySet extends IntSets {

  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSets = new NonEmpty(x, new emptySet, new emptySet)
  override def toString: String = "."
}

class NonEmpty(elem: Int, left: IntSets, right: IntSets) extends IntSets{

  def contains(x: Int): Boolean =

    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSets =
    if(x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  override def toString: String = "{" + left + elem + right + "}"

}