import scala.io.StdIn.readLine

object Counter extends App {
  //TODO ask user to enter a sentence
  //TODO calculate and save character frequency into a Map
  //you can use mutable and/or immutable Map
  //print out this map with character frequencies
  //so your Map most likely will be of type [Char,Int]
  //also i think getOrElseUpdate method will be helpful

  val mySentence: String = (readLine("Please, enter a sentence. "))
  val map = scala.collection.mutable.HashMap.empty[Char, Int]
  for (symbol <- mySentence) {
    if (map.contains(symbol))
      map(symbol) += 1
    else
      map +=((symbol, 1))
  }
  println(map)
}
