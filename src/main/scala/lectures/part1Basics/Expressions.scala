package lectures.part1Basics

object Expressions extends App {
  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // If expression
  println(aConditionValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything in Scala is an expression

  // side effects: println, whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

}
