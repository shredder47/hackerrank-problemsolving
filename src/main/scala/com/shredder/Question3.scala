package com.shredder

/*
 Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
 */

object Question3 {

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]) {
    var pos = 0f
    var nega = 0f
    var zero = 0f

    for (elem <- arr) {
      if(elem > 0) pos +=1
      if(elem < 0) nega +=1
      if(elem ==0) zero +=1
    }

    println(BigDecimal(pos/arr.length).setScale(6,BigDecimal.RoundingMode.CEILING))
    println(BigDecimal(nega/arr.length).setScale(6,BigDecimal.RoundingMode.CEILING))
    println(BigDecimal(zero/arr.length).setScale(6,BigDecimal.RoundingMode.CEILING))

  }

  def main(args: Array[String]) {

    val arr = Array(-4,3,-9,0,4,1)

    plusMinus(arr)
  }
}