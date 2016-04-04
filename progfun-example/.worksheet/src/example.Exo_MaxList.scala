package example

import common._

object Exo_MaxList {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  println("Welcome to the Scala worksheet");$skip(82); 

  def sum(xs: List[Int]): Int = if (xs.isEmpty) 0 else (xs.head + sum(xs.tail));System.out.println("""sum: (xs: List[Int])Int""");$skip(23); val res$0 = 

  sum(List(1, 3, 5));System.out.println("""res0: Int = """ + $show(res$0));$skip(148); 

  def max(xs: List[Int]): Int =
    if (xs.isEmpty) {
      val e = new java.util.NoSuchElementException
      throw e
    } else maxNonEmpty(xs);System.out.println("""max: (xs: List[Int])Int""");$skip(204); 

  def maxNonEmpty(xs: List[Int]): Int = if (xs.isEmpty) 0 else {
    var biggestInTail = maxNonEmpty(xs.tail)
    println (biggestInTail)
    if (xs.head > biggestInTail) xs.head else biggestInTail
  };System.out.println("""maxNonEmpty: (xs: List[Int])Int""");$skip(36); val res$1 = 

  max(List(10,9,8,7,6,5,4,3,2,1));System.out.println("""res1: Int = """ + $show(res$1))}

}
