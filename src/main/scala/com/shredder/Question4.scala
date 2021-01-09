package com.shredder


/*
  Find the min positive value that can be placed in the array of size n
  Ex [-1,0,1,3,4] , the most min positive value will be 2
  Ex [-1,-2,-3] , the most min positive value will be 1
  Ex [-1,-2,-3,1,2] , the most min positive value will be 3
 */
object Question4  extends App {

  val arr1 = Array(-1,-2,1,3,4,5,7,8,11)
  val arr2 = Array(-1,-2,-3,1,2)
  val arr3 = Array(0,1,2,3,4,5,7,8,11)
  val arr4 = Array(0,1,2,3,4,5,6,7,8,9)
  val arr5 = Array(-1,-2,-22,-10)


  println(findMinPositiveNumber(arr1))
  println(findMinPositiveNumber(arr2))
  println(findMinPositiveNumber(arr3))
  println(findMinPositiveNumber(arr4))
  println(findMinPositiveNumber(arr5))

  def findMinPositiveNumber( arr : Array[Int]) : Int = {

    val sortedArr = arr.sorted
    val min = if(sortedArr.min < 0) 0 else sortedArr.min
    val max = sortedArr.max

    var keepSearching = true
    var minPositive = min + 1

    while(keepSearching){

      if(sortedArr.contains(minPositive)){
        minPositive += 1
      }else{
        keepSearching = false
      }
    }
    minPositive
  }



}