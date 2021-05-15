package HackerRank.InterviewPreparationKit.DynamicProgramming

object DecibinaryNumbers {

  import java.io._
  import java.math._
  import java.security._
  import java.text._
  import java.util._
  import java.util.concurrent._
  import java.util.function._
  import java.util.regex._
  import java.util.stream._

  object Solution {

    // Complete the decibinaryNumbers function below.
    def decibinaryNumbers(x: Long): Long = {


    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn

      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val q = stdin.readLine.trim.toInt

      for (qItr <- 1 to q) {
        val x = stdin.readLine.trim.toLong

        val result = decibinaryNumbers(x)

        printWriter.println(result)
      }

      printWriter.close()
    }
  }


}
