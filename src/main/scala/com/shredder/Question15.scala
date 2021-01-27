package com.shredder

object Question15 extends App {

  // https://www.hackerrank.com/challenges/migratory-birds/problem


  /**
   *
   * INPUT:  1 4 4 4 5 5 5 5 3
   *
   * OUTPUT: 4
   */

  println(migratoryBirds(Array(1, 2, 2, 3, 3, 3, 1, 1, 2, 2)))

  // Complete the migratoryBirds function below.
  def migratoryBirds(arr: Array[Int]): Int = {

    // Array to store each bird's occurance
    var countArr =
      Array(0,
        0,
        0,
        0,
        0,
      )


    // Loop to iterate all the elements in the array
    for (idx <- arr.indices) {

      if (arr(idx) == 1) {
        countArr(0) = countArr(0) + 1
      }

      if (arr(idx) == 2) {
        countArr(1) = countArr(1) + 1
      }

      if (arr(idx) == 3) {
        countArr(2) = countArr(2) + 1
      }

      if (arr(idx) == 4) {
        countArr(3) = countArr(3) + 1
      }

      if (arr(idx) == 5) {
        countArr(4) = countArr(4) + 1
      }

    }

    var maxCount = Integer.MIN_VALUE
    var minIdBird = 0

    //
    for (idx <- countArr.indices) {
      val currentElemCount = countArr(idx)
      //If current birds count is more than prev Max, then set the max count to current
      if (currentElemCount > maxCount) {
        maxCount = countArr(idx)
        minIdBird = idx + 1
      }
    }
    minIdBird
  }


}
