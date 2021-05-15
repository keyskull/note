package HackerRank.Challenges.Easy

class S02 {
  //https://www.hackerrank.com/challenges/sock-merchant
  import java.io._

  object Solution {

    // Complete the sockMerchant function below.
    def sockMerchant(n: Int, ar: Array[Int]): Int =ar.distinct.map(a => ar.count(i => i == a)).filter(n => n > 1).map(n=> Math.floor(n / 2)).sum.toInt




    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val n = stdin.readLine.trim.toInt

      val ar = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = sockMerchant(n, ar)

      printWriter.println(result)

      printWriter.close()
    }
  }

}
