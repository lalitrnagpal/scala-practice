package com.lalit.practise

object a14_valuesandtypes {

  def main(args: Array[String]):Unit = {
    val i: Int = 42
    val d: Double = 42.00d
    val f: Float = 42.0f
    val l: Long = 42l
    val s: Short = 42
    val c: Char = 'a'
    val b: Boolean = true
    val str: String = "Lalit Nagpal"

    val infrdInt = 42
    val infrdDoub = 42.0


    print("i is " + i.getClass
          + " d is " + d.getClass
          + " l is " + l.getClass
          + " s is " + s.getClass()
          + " c is " + c.getClass()
          + " b is " + b.getClass()
          + " str is " + str.getClass()
          + " infrdInt is " + infrdInt.getClass()
          + " infrdDoub is " + infrdDoub.getClass()
    )
  }
}
