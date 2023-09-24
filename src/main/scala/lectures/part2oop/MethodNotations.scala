package lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out ${person.name}"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix or operator notation

  // "operators in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
}
