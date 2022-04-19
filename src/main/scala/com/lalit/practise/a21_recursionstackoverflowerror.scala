package com.lalit.practise

import scala.annotation.tailrec

object a21_recursionstackoverflowerror extends App {

  // This will crash with Stack Overflow Error
  // print( factorialThatCrashesWithStackOverflowError( 10000 ) )

  print( factorialThatWontCrashTailRecursion( 10000, 1 ) )

  def factorialThatCrashesWithStackOverflowError(n: Int): Int = {
    if ( n <= 1 ) 1
    else {
      val result = n * factorialThatCrashesWithStackOverflowError( n - 1 )
      print(s"${result} ")
      result
    }
  }

  @tailrec
  def factorialThatWontCrashTailRecursion(n: Int, accumulator: BigInt): BigInt = {
    if ( n <= 1 ) accumulator
    else
      factorialThatWontCrashTailRecursion( n - 1, n * accumulator )
  }
}
