package com.shredder

object Question8 extends App {


  /*

Problem description: Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
*/
  println(firstUnique("loveleetcode"))
  println(firstUnique("leetcode"))
  println(firstUnique("iiijjkllmmnop"))

  def firstUnique(s: String): Int = {
    var map = new collection.mutable.HashMap[Char, Int]()
    val array = s.toCharArray

    array.zipWithIndex.foreach { case (c, i) =>
      if (map.contains(c)) {
        map.put(c, -1)  //If there are duplicates , overwrite the value with -1 [Override happens as map cannot contain same key,so the latest value is inserted]
      } else {
        map.put(c, i) // If No duplicate insert the char with index position to the MAP
      }
    }

    //Finding the min index posi except -1
    var min = Int.MaxValue
    for (elem <- map.values) {
      if (elem != -1) {
        if (elem < min)
          min = elem
      }
    }
    if (min == Int.MaxValue) -1 else min  // if min value remained unchanged from MaxValue, that means all are duplicates , so return -1 as per the requirement

  }
}



