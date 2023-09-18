package lectures.part1Basics

object Functions extends App {
  def aFunction (a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // When you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I'm $age years old"
    2. Factorial function 1 * 2 * 3 * ... * n
    3. A fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
    4. Tests if a number is prime
   */

  def greeting(name: String, age: Int): Unit = {
    println(s"Hi, my name is $name and I'm $age years old!")
  }

  greeting("Diego", 25)

  def factorial(number: Int): Int = {
    if (number <= 1) 1
    else number * factorial(number - 1)
  }

  println(factorial(10))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else (fibonacci(n - 1) + fibonacci(n - 2))

    // 1 1 2 3 5 8 13 21

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
