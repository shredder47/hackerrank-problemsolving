package com.shredder

/*

   Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

   Sample Input
   1 2 3 4 5
   Sample Output

   10 14
 */
object Question5  {

  // Complete the miniMaxSum function below.
  def miniMaxSum(arr: Array[Long]) {
    val sortedArr = arr.sorted

    val minSum = sortedArr.slice(0,4).sum
    val maxSum = sortedArr.reverse.slice(0,4).sum
    println(minSum + " " + maxSum)

  }

  def main(args: Array[String]) {

    miniMaxSum(Array(1L,3L,5L,7L,9L))
    miniMaxSum(Array(1L,2L,3L,4L,5L))
  }
}