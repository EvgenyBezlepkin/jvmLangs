package scalaLang.objects

// scala has not static keyword
// object keyword is used instead


// To start the program it needs to be the main method in object or object must extend from App
object Run extends App {

    //print(Test.i + ",")
    //print(Test.testMet)

    //print(new A().a)
    //print(new A().A.a)

    print(Enum.Green.id)
}


// example of singleton
object Test {
  val i = 5;
  def testMet(): Unit = {
    print((Math.random()+10).round)
  }
}


// example companion object (it is a replacement for static method)
class A {

  var a = A.a + 1

  object A {
    val a = 9;

}
}


// scala enumeration
object Enum extends Enumeration {

    // id, name
  val Red = Value(10, "A")
  val Green = Value(100, "AAA")

  def meth() = {

  }
}