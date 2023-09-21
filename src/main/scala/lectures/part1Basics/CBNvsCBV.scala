package lectures.part1Basics

object CBNvsCBV extends App {
  private def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  private def calledByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  private def infinite(): Int = 1 + infinite()
  private def printFirst(x: Int, y: => Int) = print(x)

//  printFirst(infinite(), 34)
  printFirst(34, infinite())
}
