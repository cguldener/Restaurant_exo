/// LIST ///


/// FOR COMPREHENSION ///

/*
 allows you to iterate over collections and generate combinations or transformations.
*/

// In the animal example, we use the for comprehension to create combinations of animal categories and names, yielding a sequence of tuples.

val categories = List("Mammals", "Birds")
val animals = Map( // Map is a collection type in Scala that represents a collection of key-value pairs
  "Mammals" -> List("Dog", "Cat", "Elephant"), //  animal categories (keys) to lists of animal names (values)
  "Birds" -> List("Parrot", "Eagle", "Penguin") // -> operator is used to associate each key with its corresponding value.
)
val animalCombinations = for {
  category <- categories
  animal <- animals(category) // <- syntax to iterate over categories and the corresponding list of animals for each category from the animals map
} yield (category, animal) // yield used to generate a new value for each combination of category and animal. Here a tuple (category, animal)

animalCombinations.foreach(println) // print each combination of animal category and name




/// Choose your type and write a type ///

def applyF[T](i: T, f: T => Unit): Unit = f(i)


val animals2 = List("mammifere", "oiseaux")
val prec_animals = List[(String, List[String])](("mammifere", List("chien", "chat")))

// List[(String,List[String])]


// Mapping

val myMap1 =
  Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
myMap1.size

// Maps add
val myMap2 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")
val aNewMap = myMap2 + ("IL" -> "Illinois")
aNewMap.contains("IL")

// Map values iterated
val myMap3 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")

val mapValues = myMap3.values
mapValues.size
mapValues.head //Failed presumption: The order in maps is not guaranteed

val lastElement = mapValues.last
lastElement

// Map may be accessed
myMap3("MI")
myMap3("OH")

// Maps insertion with duplicate key updates previous entry with subsequent value
val mapValues2 = myMap3.values
mapValues.size
myMap3("MI")

// If a nonexistent map key is requested using myMap(missingKey), a NoSuchElementException will be thrown. Default values may be provided using either getOrElse or withDefaultValue for the entire map
val myMap4 =
  Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
intercept[NoSuchElementException] {
  myMap4("TX")
}
myMap4.getOrElse("TX", "missing data")

val myMap5 =
  Map(
    "MI" -> "Michigan",
    "OH" -> "Ohio",
    "WI" -> "Wisconsin",
    "IA" -> "Iowa") withDefaultValue "missing data"
myMap5("TX")



