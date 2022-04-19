package com.lalit.practise

object a23_callbynameandvalue {

  def main(args: Array[String]): Unit = {

    println("The below just prints the passed value")
    calledByValue( System.nanoTime() )
    println("")
    println("The below is evaluated lazy, evaluated everytime")
    calledByName( System.nanoTime() )
  }

  def calledByValue(x: Long): Unit = {
    println("calledByValue -> " + x )
    println("calledByValue -> " + x )
    println("calledByValue -> " + x )
  }

  def calledByName(x: => Long): Unit = {
    println("calledByName -> " + x )
    println("calledByName -> " + x )
    println("calledByName -> " + x )
  }

}
