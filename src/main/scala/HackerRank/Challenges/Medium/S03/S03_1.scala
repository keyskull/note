//package HackerRank.Challenges.Medium.S03
//
//
//import scala.collection.mutable.ArrayBuffer
//
//object S03_1 {
//
//  import java.io._
//
//
//  object Solution {
//
//    // Complete the candies function below.
//    def candies(n: Int, arr: Array[Int]): Long = {
//
//      val dp : ArrayBuffer[ArrayBuffer[Boolean]] = ArrayBuffer[ArrayBuffer[Boolean]]() ++ (0 to n + 1).map(arr.map[Boolean](_ => false) ++ false )
//      dp(0)(0) = true
//      dp.foreach( i => i.foreach{ p=>
//        if(i == 0){
//
//        }
//
//
//      })
//
//    }
//  }
//
//  def main(args: Array[String]) {
//    val stdin = scala.io.StdIn
//
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//    val n = stdin.readLine.trim.toInt
//
//    val arr = Array.ofDim[Int](n)
//
//    for (i <- 0 until n) {
//      val arrItem = stdin.readLine.trim.toInt
//      arr(i) = arrItem
//    }
//
//    val result = Solution.candies(n, arr)
//
//    printWriter.println(result)
//
//    printWriter.close()
//  }
//
//}
