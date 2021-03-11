package scalaLang.classes

import scala.beans.BeanProperty


object Run {

  def main(args: Array[String]): Unit = {

    val ex = new A();
    ex.setSex("s")
    ex.getSex
    ex.getName
    ex.a_(4)

    new B("new", 10).test()

  }
}


class A() {

  // values

  private var age = 0
  @BeanProperty
  val name : String = "A";
  @BeanProperty
  var sex : String = "A";

  def a_(value:Int) = age = value
  def a = age


  // auxiliary constructors

  def this(age2 :Int) {
    this()
    age = age2
  }

  def this(age :Int, sex2:String) {
    this(age)
    sex = sex2
  }

}


// main constructor

@BeanProperty
class B(var name:String = "def", var age:Int = 0) {

  def test(): Unit = {
    print(name + age)
  }

}


// inner classes






