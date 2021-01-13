package com.shredder

import scala.collection.mutable.ListBuffer

/**
 * Codility Interview Question from Zalando
 *
 * Split the String into number chunks of 2 and find the max number out of those combination
 *
 * Example - 505552  -> 50 05 55 52 -> The Max here is 55
 *
 * String S consists only of digits ['0'....'9']
 * String S Do not start with 0
 */
object Question9 extends App {

  val str = "505552"
  println(solution(str))

  solution(str)
  //50 05 55 52

    def solution(s: String): Int = {

      val extractedList =new ListBuffer[Int]()
      var max = Int.MinValue

      for (i <- 0 until str.length-1) {
       extractedList +=  s.substring(i,i+2).toInt
      }

      for (elem <- extractedList) {
        if(elem>max) max = elem
      }
      max
    }



}



