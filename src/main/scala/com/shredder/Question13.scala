package com.shredder

object Question13 extends App {

  // https://www.hackerrank.com/challenges/apple-and-orange/problem

  val s = 7
  val t = 11

  val a = 5
  val b = 15

  val apples = Array(-2,2,1)
  val oranges = Array(5,-6)

  countApplesAndOranges(s,t,a,b,apples,oranges)


  // Complete the countApplesAndOranges function below.
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {

    val appl = apples.map(_ + a)
    val orng = oranges.map(_ + b)

    val applesLandedInHouse = appl.count(x => if (x >= s && x <= t) true else false)
    val orangesLandedInHouse = orng.count(x => if (x >= s && x <= t) true else false)

    println(applesLandedInHouse)
    println(orangesLandedInHouse)
  }

}
