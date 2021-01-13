package com.shredder

import scala.collection.mutable.ListBuffer


/*
    Given a string s consisting of n lowercase letters, you have to delete the minimum number of characters from s,
    so that every letter in s appears a unique number of times. We only care about the occurrences of letters that appear at least once in result.

    Example 1:
    Input: "eeeeffff"
    Output: 1
    Explanation:
    We can delete one occurence of 'e' or one occurence of 'f'. Then one letter will occur four times and the other three times.
    Example 2:
    Input: "aabbffddeaee"
    Output: 6
    Explanation:
    For example, we can delete all occurences of 'e' and 'f' and one occurence of 'd' to obtain the word "aabbda".
    Note that both 'e' and 'f' will occur zero times in the new word, but that's fine, since we only care about the letter that appear at least once.
    Example 3:
    Input: "llll"
    Output: 0
    Explanation:
    There is no need to delete any character.
 */

object Question10 extends App {

  val str = "example"

  println(solution(str))

    def solution(s: String): Int = {

      var totalDeletionCount = 0
      val charCountsList = new ListBuffer[Int]()

      val chars = s.toCharArray
      val uniqueChars = chars.distinct


      for (elem <- uniqueChars) {

        //Finding each character's total count one by one for evaluation
        var currentItemCnt = chars.count(_.equals(elem))

        //Keep reducing the number of chars to a frequency so that its not present on the chatCountList(unique), where we are storing the final counts
        while (currentItemCnt!=0 && charCountsList.contains(currentItemCnt)){
          //If the condition if met, reduce the current char's item count by -1 and count the deletion
          currentItemCnt -= 1
          totalDeletionCount +=1
        }
        //Save the result in the charCountsList
        charCountsList += currentItemCnt
      }
      totalDeletionCount
    }
}



