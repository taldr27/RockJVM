package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

class Person(name: String, age: Int = 0) {
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

/*
  Novel and a Writer
  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }
  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n - 1)

  def print = println(count)
}
