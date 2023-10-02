package lectures.part2oop

object Inheritance extends App {

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (borad: polymorfism)
  val unknownAnimal: Animal = new Dog("K9")
//  unknownAnimal.eat

  // overRiding vs overLoading

  // super

  // preventing overrides
  // 1 - use final
  // 2 - use final on the entire class
  // 3 - seal the class = extend classes in this file, prevents extension in other files
}
