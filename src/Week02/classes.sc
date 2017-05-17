class CheckSumAccumulator{

  private var sum = 0

  def add(b: Int): Unit = {
    sum += b
  }

  def checkSum(): Int = {

  }
}

val acc = new CheckSumAccumulator
val csa = new CheckSumAccumulator

acc.sum = 3