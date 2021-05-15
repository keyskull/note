import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

import scala.collection.immutable._
import scala.collection.immutable.Map
import scala.collection.mutable.ArrayBuffer
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'maxSum' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER N
   *  2. 2D_INTEGER_ARRAY edges
   */

  def maxSum(N: Int, edges: Array[Array[Int]]): Long = {
    // Write your code here
    val e: ArrayBuffer[(Int, Int)] = ArrayBuffer() ++ edges.map(_.sorted).map(p=> (p.min -> p.max))

    val weight = Array[Int](N)
    weight(_) = 0
    println(weight.mkString)


    for(i <- N until 2) {



      val d = e.filter(p=> p._2 == i && weight(i - 1)  < 1)

      def countRoot(root: (Int,Int)): Int ={

        e.filter(root._1 == _._2).map(countRoot).foreach{
          case p if p == 1 =>
          case _ => 0
        }

0
      }

      d.map(countRoot)



    }
0

  }

}

object Solution {
  def main(args: Array[String]) {
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val N = firstMultipleInput(0).toInt

    val M = firstMultipleInput(1).toInt

    val edges = Array.ofDim[Int](M, 2)

    for (i <- 0 until M) {
      edges(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = Result.maxSum(N, edges)

    println(result)

//    printWriter.println(result)

//    printWriter.close()
  }
}
