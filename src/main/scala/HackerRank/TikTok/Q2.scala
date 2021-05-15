//package HackerRank.TikTok
//
//import HackerRank.TikTok.Q2.Result.getPercentile
//
//object Q2 {
//  import java.io._
//  import java.math._
//  import java.security._
//  import java.text._
//  import java.util._
//  import java.util.concurrent._
//  import java.util.function._
//  import java.util.regex._
//  import java.util.stream._
//  import scala.collection.immutable._
//  import scala.collection.mutable._
//  import scala.collection.concurrent._
//  import scala.concurrent._
//  import scala.io._
//  import scala.math._
//  import scala.sys._
//  import scala.util.matching._
//  import scala.reflect._
//
//
//
//  object Result {
//
//    /*
//     * Complete the 'getPercentile' function below.
//     *
//     * The function is expected to return a FLOAT.
//     * The function accepts STRING log as parameter.
//     */
//
//    def getPercentile(log: String) = {
//      // Write your code here
//      val a:Array[Float] = log.split(";").filter(_.contains("1,E="))
//        .flatMap(_.split("1,E="))
//        .map(p => p.toFloatOption.getOrElse()).filter(_!= ()).map(p=> p.asInstanceOf[Float]).sorted
//       a.foreach(print _)
//       "is_safe:1,E=\\d+".r.matches(log)
//    }
//
//  }
//
//
//}
//object Solution {
//
//  def main(args: Array[String]): Unit = {
//    getPercentile("batch 0||is_safe:1,E=101;&&batch 2||is_safe:0,E=100;is_safe:1,E=102;")
//  }
//
//}