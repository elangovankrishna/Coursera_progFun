/** All the class from week02 will be imported using "_" keyword
  * import week02.{Rational, something} - will import just those classes
  * import.Rational - will import just Rational
  * you can either import an OBJECT or CLASS
  * */
import week02._

object ScratchPad {

  new Rational(1,2)

  def error(msg: String) = throw new Error(msg)

  /** the below is a TYPE checker of Scala between AnyVAL and AnyREF or ANY base classes
    * since the below exp has INT and BOOLEAN as the type
    * */



  if(true) 1 else false
}