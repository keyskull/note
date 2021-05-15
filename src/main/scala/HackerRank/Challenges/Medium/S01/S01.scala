package HackerRank.Challenges.Medium.S01

object S01 {

  //  https://www.hackerrank.com/challenges/max-array-sum

  object Solution {

    // Complete the maxSubsetSum function below.
    def maxSubsetSum(arr: Array[Int]): Int = {
      if (arr.length == 0) return 0
      arr(0) = Math.max(0, arr(0))
      if (arr.length == 1) return arr(0)
      arr(1) = Math.max(arr(0), arr(1))
      for (i <- 2 until arr.length) {
        arr(i) = Math.max(arr(i - 1), arr(i) + arr(i - 2))
      }
      arr(arr.length - 1)

    }
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    //    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val res = Solution.maxSubsetSum(arr)

    println(res)

    //    printWriter.close()
  }

}
