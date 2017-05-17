import java.io._

def ranNum(x: Int) = {
  val r = new scala.util.Random()
  val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/ke20506/Desktop/Projects/Scala/progFun/target/test.txt" )))
  for (i <- 1 to 10000000) yield writer.write(r.nextInt().toString + System.getProperty("line.separator"))
  writer.close()
}

ranNum(10)
