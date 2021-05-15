package HackerRank.InterviewPreparationKit.DynamicProgramming

import java.io._
import scala.annotation.tailrec

object Solution {

  // Complete the candies function below.



  def candies(arr: Array[Int], n: Int = 0, t : Int = 0): Int = arr match {
    case a if a.isEmpty => t
    case a if a.length == 1 => t + n +1
    case a => nn(a,n,t)
  }

  def nn(arr: Array[Int], n: Int , t : Int): Int = arr.head match {
    case p if p == arr(1) => candies(arr.drop(1),0,t + n + 1)
    case p if p < arr(1) => candies(arr.drop(1),n+1, t + n + 1)
    case p if p > arr(1) => mm(arr.drop(1),0,t + n + 1)
  }

  def mm(arr: Array[Int], n: Int , t : Int ): Int = arr match {
    case a if a.length == 1 => candies(arr, n, t)
    case a => m(a,n,t)
  }

  def m(arr: Array[Int], n: Int , t : Int ): Int = arr.head match {
    case p if p > arr(1) => mm(arr.drop(1),n+1,t + n + 1)
    case p if p < arr(1) => candies(arr.drop(1),1,t + n + 1)
    case p if p == arr(1) => candies(arr.drop(1),0,t + n + 1)
  }




  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val arr = Array.ofDim[Int](n)

    for (i <- 0 until n) {
      val arrItem = stdin.readLine.trim.toInt
      arr(i) = arrItem}

    val result = candies(arr)
    println(result)
//    printWriter.println(result)

//    printWriter.close()
  }
}
