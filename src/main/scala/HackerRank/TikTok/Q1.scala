package HackerRank.TikTok

object Q1 {
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
  import scala.sys._
  import scala.util.matching._
  import scala.reflect._



  object Result {

    /*
     * Complete the 'plus_one' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY m as parameter.
     */

    def plus_one(m: Array[Int]): String = {
      // Write your code here
      if(m.isEmpty) "1"
      else new BigDecimal(m.mkString).add(new BigDecimal(1)).toString
    }

  }


}
