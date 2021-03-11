package scalaLang.array

import scala.collection.mutable.ArrayBuffer

object Run {

  def main(args: Array[String]): Unit = {


    // constant value

    val a = new Array[Int](10)
    val b = Array("a" , "b")


    // variable value

    val c = ArrayBuffer[Int]()
    // add value
    c += 1
    c += (1,2,3)
    //for (i <- c) print(i)
    // subtract value
    c -= 2
    //for (i <- c) print(i)


    // some operations

    var arr = Array(2,3,4)
    arr.min
    val arr2 = arr.map(_ + 2) // map(i => i + 2)
    //for (i <- arr2) print(i)
    val arr3 = arr.sortWith(_ < _)
    scala.util.Sorting.quickSort(arr)


  }
}
