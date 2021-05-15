package HackerRank.Challenges.Medium.S02

import HackerRank.Challenges.Medium.S02.S02_2.Solution.abbreviation

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object S02_2 {

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

    // Complete the abbreviation function below.
    def abbreviation(a: String, b: String): String = {
      var s: mutable.Buffer[Char] = b.toCharArray.toBuffer
      var d: Char = s.head
      var z: mutable.Buffer[Char] = mutable.Buffer[Char]()


      def find(p: Char): Boolean = {
        if (!s.isEmpty)
          if (s.head.equals(p)) {
            d = p
            s = s.drop(1)
            true
          }
          else if (z.contains(s.head.toLower)) {
           z = z.drop(z.indexOf(s.head.toLower) + 1)
            d = p
            s = s.drop(1)
            find(p)
          } else false
        else false
      }

      a.toCharArray.foreach { p =>
//                println(p)
        if (p.isLower) z += p
        if (p.isUpper) {
          val dd = d
          if (!find(p)) return "NO"
          if (dd != p) z.clear()
        }
//                println(p)
//                println(s.mkString)
      }
      z.foreach { p =>
        if(p.isUpper) return "NO"
        if (!s.isEmpty)
          if (s.head.equals(p.toUpper))
            s = s.drop(1)
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
