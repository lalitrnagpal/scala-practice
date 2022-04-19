package com.lalit.practise

object a19_codeblocksauxiliaryfunctions extends App {

  def aBigFunction(n: Int): Int = {

    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  println( aBigFunction(20) )

}
