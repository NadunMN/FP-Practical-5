object Fibonacci {
  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    val n = 10  // Change this value to print a different number of Fibonacci numbers
    println(s"The first $n Fibonacci numbers are:")
    printFibonacci(n)
  }
}
