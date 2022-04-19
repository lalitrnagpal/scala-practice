package com.lalit.practise

class Subject(name: String) {

  def isInstanceOfSubject(a: Any): Boolean = {
    a.isInstanceOf[Subject]
  }

  override def hashCode(): Int = {
    name.hashCode
  }

  override def equals(that: Any): Boolean = {
    that match {
      case that: Subject => this.hashCode == that.hashCode && this.isInstanceOfSubject(that)
      case _ => false
    }
  }
}

object a13_valuesvariablestypes {

  def main(args: Array[String]): Unit = {

    var x = new Subject("Maths")
    var y = new Subject("Maths")

    print("x and y are same => " + x.equals(y))

  }

}
