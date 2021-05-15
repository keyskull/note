package HackerRank.Challenges.Medium.S02

import HackerRank.Challenges.Medium.S02.S02_2.Solution.abbreviation

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object S02_1 {

  object Solution {

    // Complete the abbreviation function below.
    def abbreviation(a: String, b: String): String = {
      var s: mutable.Buffer[Char] = b.toCharArray.toBuffer
      var d: Char = '0'
      a.toCharArray.foreach { p =>
        println(p)
        if (!s.isEmpty && s.head.equals(p.toUpper)) {
          d = p
          s = s.drop(1)
        } else if (p.isUpper && !d.equals(p.toLower)) return "NO"
        println(p)
        println(s.mkString)
      }
      if (s.isEmpty) "YES"
      else "NO"
    }
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    //    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = stdin.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val a = stdin.readLine

      val b = stdin.readLine

      val result = abbreviation(a, b)

      println(result)
    }

    //    printWriter.close()
  }


}
