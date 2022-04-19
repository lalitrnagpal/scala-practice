package com.lalit.practise

import scala.annotation.tailrec

object a25_defaultarguments extends App {

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture(width = 800)

  // savePicture( 800 )         // Compiler won't understand and will take 800 as the value of format - but that is a String

  /*
    1. pass in every leading argument
    2. name the arguments
   */

  savePicture(height = 600, width = 800, format = "bmp")

  // Order wont matter after you have named them
  savePicture( width = 800, height = 600, format = "bmp" )

  // The Factorial one
  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  println( "Factorial of 10 -> " + trFact(10) )

  println( "Factorial of 10 ( accumulator starting with 2 ) -> " + trFact(10, 2) )



}
