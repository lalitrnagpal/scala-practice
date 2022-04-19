package com.lalit.practise

object a18_recurseforloops extends App {

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  // WHEN YOU NEED LOOPS, USE RECURSION.
  println( aRepeatedFunction("hello",3) )

}
