package com.shredder

import java.io.PrintWriter
import scala.io.StdIn

/*
  Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9

The left-to-right diagonal 1+5+9 = 15 . The right to left diagonal = 3+5+9 = 17. Their absolute difference is |15 - 17| = 2.
 */

object Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here

    val size = arr.length
    var rd = 0
    var ld = 0

    for (i <- 0 until (size)) {

      rd += arr(i)(i)
      ld += arr(i)((size -1) - i )
    }

    println(rd)
    println(ld)

    (rd-ld).abs

  }

}

object Question2 {
  def main(args: Array[String]) {


    val arr = Array.ofDim[Int](3, 3)

    arr(0) = Array(1,2,3)
    arr(1) = Array(4,5,6)
    arr(2) = Array(9,8,9)

    val result = Result.diagonalDifference(arr)
    println(result)

  }
}

