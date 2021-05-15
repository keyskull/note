package HackerRank.Challenges.Medium.S02

import HackerRank.Challenges.Medium.S02.S02_3.Solution.abbreviation

import scala.collection.mutable

object S02_3 {

  object Solution {

    // Complete the abbreviation function below.
    def abbreviation(a: String, b: String): String = {
      var s: mutable.Buffer[Char] = a.toCharArray.toBuffer
      var bb: mutable.Buffer[Char] = b.toCharArray.toBuffer
      b.toCharArray.foreach { matchChar =>
        println(matchChar)
        var sTake = s
        var index = s.indexWhere(_ == matchChar)
        if (index != -1) sTake = s.take(index + 1)
        val firstUpper = sTake.indexWhere(_.isUpper)
        val index2 = s.indexWhere(_ == matchChar.toLower)
        if (index == -1) index = if (index2 <= firstUpper) index2 else if (firstUpper == -1) index2 else firstUpper
        else if (!sTake.take(firstUpper + 1).exists(p => p == matchChar.toLower || p == matchChar)) return "NO"
        if (index == -1) return "NO"


        val recognizingIndex = bb.indexWhere(_ != bb.head)
        if (recognizingIndex != -1) {
          val recognizedChar = bb(recognizingIndex)
          val recognizedIndex = s.indexWhere(p => p == recognizedChar || p == recognizedChar.toLower)

          if (recognizedIndex != -1 &&
            sTake.count(p => p == recognizedChar || p == recognizedChar.toLower) >=
              bb.take(recognizedIndex).count(_== recognizedChar )) {
            val finalIndex = sTake.take(recognizedIndex + 1).indexWhere(p => p == matchChar || p == matchChar.toLower)
            if (finalIndex != -1)
              index = finalIndex
          }
        }


        s = s.drop(index + 1)
        bb = bb.drop(1)

        println(s.mkString + "+++++++++++++")
        println(bb.mkString + "|||||||")
      }
      if (s.exists(_.isUpper)) return "NO"
      "YES"
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
