package com.shredder

import scala.collection.mutable.ListBuffer

object Question11 extends App {

  //https://www.hackerrank.com/challenges/grading/problem

  val input =
    Array(
      73,
      67,
      38,
      33)

  var finalScore = new ListBuffer[Int]()

  for (elem <- input) {

    var rounded = elem

    while (rounded%5!=0){
      rounded = rounded +1
    }

    if(elem >= 38 && (rounded-elem) < 3){
      finalScore += rounded
    }else{
      finalScore += elem
    }
  }

  println(finalScore.toArray)

}
