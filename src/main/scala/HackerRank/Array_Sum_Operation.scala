//package HackerRank

import java.io._

import scala.collection.mutable._
import scala.io._
import scala.math.pow
import scala.util.control.Breaks.{break, breakable}



//object Result {

  /*
   * Complete the 'performOperations' function below.
   *
   * The function is expected to return a LONG_INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER N
   *  2. INTEGER_ARRAY op
   */

//  def performOperations(N: Int, op: Array[Int]): Array[Long] = {
//    // Write your code here
//    if(N < 1 || op.length <1 || op.length > 5* pow(10,5) ) throw new Exception
//
//    val array:ArrayBuffer[Int] = ArrayBuffer() ++ (1 to N)
//    op.map(p =>
//      if(array.exists(_==p)) {
//        val a = array(0)
//        array.update(0, array(array.length-1))
//        array.update(array.length -1, a)
//        array.sum
//      }
//      else {
//        array.update(array.length-1,p)
//        array.sum
//      }).map(p=>p.toLong)
//  }
//}
//
//
//object Solution {
//  def main(args: Array[String]): Array[Long] = {
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//    val a = StdIn.readLine
//    var N = 0
//    var M = 0
//    val array = ArrayBuffer[Int]()
//    try {
//      N = a.trim.toInt
//      M = StdIn.readLine.trim.toInt
//    } catch{
//      case e: Exception =>
//        array ++= a.split("\\D+").map(_.trim.toInt)
//        N = array(0)
//        M = array(1)
//    }
//
//    if(N < 1 || M > pow(10,5) + 1) {printWriter.close();throw new Exception}
//
//
//
//    val b:Array[Int] = if(array.length > 2)
//      array.drop(2).map(_.toInt).toArray else Array()
//
//    val op = b ++ (0 until (M - b.length)).map { x =>
//      try{ StdIn.readLine.split("\\D+").map(_.trim.toInt)}
//      catch{case exception: Exception => Array[Int]()}
//    }.flatten.toArray
//
//    if(op.length != M) {printWriter.close();throw new Exception}
//
//    val result = Result.performOperations(N, op)
//
//    printWriter.println(result.mkString("\n"))
//    println(result.mkString("\n"))
//    printWriter.close()
//    result
//  }
//}



//
//object Hackathon.Solution {
//  def main(args: Array[String]) {
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//    StdIn.readChar()
//
//    val a = StdIn.readLine
//    var N = 0
//    var M = 0
//    try {
//      N = a.trim.toInt
//      M = StdIn.readLine.trim.toInt
//    } catch{
//      case e: Exception =>
//        val array = a.split("\\ +|\\t+|\\n+|\\r+").map(_.trim.toInt)
//        N = array(0)
//        M = array(1)
//    }finally {
//      if(N < 1 || M > pow(10,5) + 1) {printWriter.close();return}
//      val head = StdIn.readLine().split("\\ +|\\t+|\\n+|\\r+").map(_.trim.toInt)
//      val op = if(head.length > 1) head else head ++ (1 to M - 1).map(p =>try {
//        val data = StdIn.readLine().trim.toInt
//        if(data < 0 || data > 5 * pow(10,5) + 1) throw new Exception
//        data
//      } catch{ case exception: Exception => break}).toArray
//
//      val result = Hackathon.Result.performOperations(N, op)
//      printWriter.println(result.mkString("\n"))
//      printWriter.close()
//    }
//  }
//
//}
