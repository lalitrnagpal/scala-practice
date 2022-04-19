package com.lalit.practise

object a20_exercise {

  def main(args: Array[String]): Unit = {
      greeting("Lalit", 45)
      println( factorial(1, 5) )
      println( fibonacci(3) )
      println( isPrime(23) )
  }

  def greeting(name: String, age: Int): Unit = {

    println(s"Hello $name, your age is $age")
  }

  def factorial(fact: Long, ctr: Int): Long = {

    if (ctr > 1) factorial(fact * ctr, ctr - 1)
    else fact
  }

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def isPrime( n: Int ): Boolean = {
    def isPrimeUntil( t: Int ): Boolean =
      if ( t <= 1 ) true
      else n % t != 0 && isPrimeUntil( t-1 )

    isPrimeUntil(n / 2)
  }


}
