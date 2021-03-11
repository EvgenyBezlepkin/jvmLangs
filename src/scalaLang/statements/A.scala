package scalaLang.statements


object Run {

  def main(args: Array[String]): Unit = {

    // variables mark as var or val
    var a = 1;
    val b = 2;


    // lazy values
    // initializing while first calling
    lazy val w = 10;


    // if has a value
    // both branches must return the same type
    var c = if (a > 0) 1 /* else () */


    // a block has also a value the last expression
    var d = {
      var a = 3; a += 5;
    }


    // for statement works as for-each
    for (i <- "Hello") {
      //print(i)
    }

    for (i <- 1 to 3; j <- 1 to 3) {
      //print(i + " " + j)
    }

    // with guard
    for (i <- -5 to 5 if i > 0) {
      //print(i)
    }

    // for generator creates collection as referred to as Vector
    // yield statement adds new value while each iteration
    val g = for (i <- 1 to 10) yield i
    //print(g)


    // functions
    // it has default arguments and named arguments
    def f (s1 : String = "def", s2:String = "ault") = {
      print(s1 + s2)
    }
    //f(s2 = "arg")


    // variable number of args
    def f2 (args : Int*) = {
      for (i <- args) print(i)
    }

    // pass e sequence
    // f2(1,2,3)

    // pass to operator
    // f2(1 to 5 : _*)


  }
}


















