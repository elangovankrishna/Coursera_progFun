/** Sum of n number using different algorithms */

def sum(x: Int): Int = {

  if (x < 0) 0 else x + sum(x-1)
}

sum(3)

def sum1(x: Int) = {

  if (x<0) 0 else (x*(x+1))/2
}

sum1(3)