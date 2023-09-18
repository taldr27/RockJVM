package lectures.part1Basics

object ValuesVariablesTypes {
  def main(args: Array[String]): Unit = {
    val x: Int = 42
    println(x)

    // VALS ARE iMMUTABLE
    // Compiler can infer types

    val aString: String = "hello"
    val anotherString: String = "goodbye"

    val aBoolean: Boolean = false
    val aChar: Char = 'a'
    val anInt: Int = x
    val aShort: Short = 423
    val aLong: Long = 420314912L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14

    // variables
    var aVariable: Int = 4

    aVariable = 5 // side effects
  }
}
