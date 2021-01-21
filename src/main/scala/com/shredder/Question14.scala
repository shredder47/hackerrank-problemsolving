package com.shredder

import scala.collection.mutable.ListBuffer

object Question14 extends App {

  // https://www.hackerrank.com/challenges/the-birthday-bar/problem

/*  Sample Input 0

  5
  1 2 1 3 2
  3 2

  Sample Output 0

  2
*/

  /**
   * s: an array of integers, the numbers on each of the squares of chocolate
     d: an integer, Ron's birth day
     m: an integer, Ron's birth month
   */

  val s = Array(1,2,1,3,2)
  val d  = 3
  val m = 2

  println(birthday(s,d,m))

  // Complete the birthday function below.
  def birthday(s: Array[Int], d: Int, m: Int): Int = {

    val chunkSumsList = new ListBuffer[Int]()

    for(i <- 0 to s.length-m){
      var chunkSum = 0
      for( j <- 0 until m){
        chunkSum += s(i+j)
      }
      chunkSumsList += chunkSum
    }
    chunkSumsList.count(_ == d)
  }

}
