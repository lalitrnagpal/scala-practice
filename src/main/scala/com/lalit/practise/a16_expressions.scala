package com.lalit.practise

object a16_expressions extends App {

    // Expression
    val x = 1 + 2

    println( 2 * 3 + 4 )

    // + - * / & | ^ << >> >>> ( right shift with zero extension )

    println(1 == x)
    // == != > >= < <=

    // little bang i.e. the not operator
    println(!(1 == x))
    // ! && ||

    var aVariable = 2

    aVariable += 3 // also works with -= *= /= ..... side effects

    println( aVariable )

    // IF expression
    val aCondition = true
    val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
    println(aConditionedValue)

    println(if(aCondition) 5 else 3)
    println(1 + 3)

    var i = 0
    // NEVER WRITE THIS AGAIN.
    val aWhile = while (i < 10) {
        println(i)
        i += 1
    }

    // EVERYTHING in Scala is an Expression!
    val aWeirdValue = (aVariable = 3) // Unit === void
    println(aWeirdValue)

//    That's because the while expression returns Unit. So examples of side effects
//    are printing something to the console, for example. while loops and reassigning
//    of vars, these are all side effects and there are expressions returning Unit.
//    So make sure you get the right,  Side Effects are reminiscent of imperative
//    programming. That is, they are like instructions, but in Scala there's
//    still expressions returning Unit.

}
