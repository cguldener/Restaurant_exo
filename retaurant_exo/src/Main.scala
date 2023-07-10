import Person.{Camille, Seb}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val who: Person = Camille

    who match {
      case Camille => println("Hello Camille !")
      case Seb => println("hello Seb!")
    }
  }
}