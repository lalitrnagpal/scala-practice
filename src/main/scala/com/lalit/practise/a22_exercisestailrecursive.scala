package com.lalit.practise

import scala.annotation.tailrec

object a22_exercisestailrecursive {

  def main(args: Array[String]): Unit = {

    println( concatenateTailRecursive("Hello ", 10, "") )

    println(isPrime(2003))
    println(isPrime(629))

    println(fibonacci(8))

  }

  @tailrec
  def concatenateTailRecursive(str: String, count: Int, strAccumulator: String ): String = {
    if ( count <= 0 ) strAccumulator
    else concatenateTailRecursive(str, count - 1, strAccumulator + str )
  }

  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  def fibonacci(n: Int): Int = {

    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =

      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

}
