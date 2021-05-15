package HackerRank.InterviewPreparationKit.DynamicProgramming


import java.io._
import scala.annotation.tailrec

object Candies {

  // Complete the candies function below.

  @scala.annotation.tailrec
  def candies(arr: Array[Int], n: Int = 0, t: Int = 0, i: Int = 0): Int = if (arr.length == 1) t + n + 1 else
    if (i == 0) arr.head match {
      case p if p == arr(1) => candies(arr.drop(1), 0, t + n + 1)
      case p if p < arr(1) => candies(arr.drop(1), n + 1, t + n + 1)
      case p if p - 1 == arr(1) => candies(arr, 0, t, 1)
      case p if p > arr(1) => candies(arr.drop(1), 0, t + n + 1, 1)
    } else arr.head match {
      case p if p > arr(1) => candies(arr.drop(1), n + 1, t + n + 1, 1)
      case p if p < arr(1) => candies(arr.drop(1), 1, t + n + 1)
      case p if p == arr(1) => candies(arr.drop(1), 0, t + n + 1)
    }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    //    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val arr = Array.ofDim[Int](n)

    for (i <- 0 until n) {
      val arrItem = stdin.readLine.trim.toInt
      arr(i) = arrItem
    }

    val result = candies(arr)
    println(result)
    //    printWriter.println(result)

    //    printWriter.close()
  }
}
