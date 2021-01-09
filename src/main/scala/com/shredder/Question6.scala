package com.shredder

/*

You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Sample Input 0
3 2 1 3
Sample Output 0
2
 */
object Question6 {

  /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    // Write your code here

    val maxHeight = candles.max
    var totalMaxCount = 0

    candles.foreach(candle => {
      if(candle == maxHeight) totalMaxCount +=1
    })

    totalMaxCount
  }

//  def birthdayCakeCandles2(candles: Array[Int]): Int = {
//    // Write your code here
//
//    val maxHeight = candles.max
//
//    candles.count(_ == maxHeight)
//
//  }


  def main(args: Array[String]) {

    println(birthdayCakeCandles(Array(1, 2, 2, 1, 4)))
    println(birthdayCakeCandles(Array(1, 4, 4, 4, 2, 1, 1, 2, 3)))
  }
}