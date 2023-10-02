package lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def + (nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def hangOutWith(person: Person): String = s"${this.name} is hanging out ${person.name}"
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix or operator notation

  // "operators in Scala
  val tom = new Person("Tom", "Fight Club")
//  println(mary hangOutWith tom)

  /*
    1. Overload the + operator
       mary + "the rockstar" => new person "Mary (the rockstar)"

    2. Add an age to the Person class
       Add a unary + operator => new person with the age + 1
       +mary => mary with the age incrementer

    3. Add a "learns" method in the Person class => "Mary learns Scala"
       Add a learnsScala method, calls learns method with "Scala".
       Use it in postfix notation

    4. Overload the apply method
       mary.apply(2) => "Mary watched Inception 2 times"
   */

  println((mary + "the rockstar")())
  println((+mary).age)
  println(mary.learnsScala)
  println(mary(10))
}
