package scalaLang.collections


object Run {

  def main(args: Array[String]): Unit = {

    var a = new scala.collection.immutable.HashMap[String, Int]
    a += ("a" -> 1, "b" -> 2)
    //print(a("b"))

    var b = new scala.collection.mutable.HashMap[String, Int]
    b.addAll(a)
    b("b") = 5
    b -= "a"
    b.addOne("a", 1)
    for ((k, v) <- b) print(k + " -> " + v + ", ")






  }
}
