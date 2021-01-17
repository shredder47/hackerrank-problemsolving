package com.shredder

object Question12 extends App {

  //https://www.hackerrank.com/challenges/kangaroo/problem


  println(kangaroo(1, 5, 7, 1))
  println(kangaroo(0, 2, 5, 3))

  // Complete the kangaroo function below.
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {

    if(v1>v2 && (x2-x1) % (v2-v1) ==0 ) "YES" else "NO"

  }




}
