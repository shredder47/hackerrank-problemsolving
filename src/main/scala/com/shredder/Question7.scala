package com.shredder

object Question7 {

  /*
      Staircase detail

      This is a staircase of size :

          #
         ##
        ###
       ####
      Its base and height are both equal to n . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

      Write a program that prints a staircase of size n.
   */
  def staircase(n: Int) {

    for (r <- 1 to n) {
      for (c <- n to 1 by -1) {
        if (c > r)
          print(" ")
        else
          print("#")
      }
      println("")
    }
  }

  def main(args: Array[String]) {
    val n = 4
    staircase(n)

  }
}
