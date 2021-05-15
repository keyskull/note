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
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Queries_with_Cups {

  /*
   * Complete the 'countCups' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY balls
   *  3. 2D_INTEGER_ARRAY swaps
   *  4. 2D_INTEGER_ARRAY queries
   */

  def countCups(n: Int, balls: Array[Int], swaps: Array[Array[Int]], queries: Array[Array[Int]]): Array[Int] = {
    // Write your code here
    Array()
  }



  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val s = firstMultipleInput(2).toInt

    val q = firstMultipleInput(3).toInt

    val balls = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val swaps = Array.ofDim[Int](s, 2)

    for (i <- 0 until s) {
      swaps(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val query = Array.ofDim[Int](q, 2)

    for (i <- 0 until q) {
      query(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = Queries_with_Cups.countCups(n, balls, swaps, query)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }

}