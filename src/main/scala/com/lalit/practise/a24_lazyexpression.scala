package com.lalit.practise

object a24_lazyexpression {

  def main(args: Array[String]): Unit = {

    // stack overflow
    // printFirst(infinite(), 34)

    // 2nd argument is evaluated lazy, hence no stack overflow error
    printFirst( 34, infinite() )
  }

  // Infinite function
  def infinite(): Int = 1 + infinite()

  def printFirst( x: Int, y: => Int ) = println(x)

}
