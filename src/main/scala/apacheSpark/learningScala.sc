println(s"can write a function, Like one + two:  ${1 +2}")


val theUltimateAnswer = " To life, the universe, and everything is 35"

val extractor = """.* (\d+).*""".r

val extractor(answer) = theUltimateAnswer

val answerInt = answer.toInt
