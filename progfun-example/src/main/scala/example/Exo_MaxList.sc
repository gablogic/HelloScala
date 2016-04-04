package example

import common._

object Exo_MaxList {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sum(xs: List[Int]): Int = if (xs.isEmpty) 0 else (xs.head + sum(xs.tail))
                                                  //> sum: (xs: List[Int])Int

  sum(List(1, 3, 5))                              //> res0: Int = 9

  def max(xs: List[Int]): Int =
    if (xs.isEmpty) {
      val e = new java.util.NoSuchElementException
      throw e
    } else maxNonEmpty(xs)                        //> max: (xs: List[Int])Int

  def maxNonEmpty(xs: List[Int]): Int = if (xs.isEmpty) 0 else {
    var biggestInTail = maxNonEmpty(xs.tail)
    println (biggestInTail)
    if (xs.head > biggestInTail) xs.head else biggestInTail
  }                                               //> maxNonEmpty: (xs: List[Int])Int

  max(List(10,9,8,7,6,5,4,3,2,1))                 //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| res1: Int = 10

}