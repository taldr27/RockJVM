package lectures.part1Basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  private def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)

  private def savePicture(format: String, width: Int = 1920, height: Int = 1080): Unit = println("saving")
  savePicture("jpg", 800, 600)
}
