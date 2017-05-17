object lists {
   /**Paranthesis Balancing assignment
    *
    */

  def balance(chars: List[Char]): Boolean = {

    def balance(chars: List[Char], left: Int): Boolean ={
      if(chars.isEmpty) left == 0
      else
      if (chars.head == ')') {
        left > 0 && balance(chars.tail, left - 1)
      }
      else if (chars.head == '(') {
        balance(chars.tail, left + 1)
      }
      else {
        balance(chars.tail, left)
      }
    }
    balance(chars, 0)
  }

  balance(("(HI".toList))
}


