package HackerRank.Twwiter

package HackerRank.Twwiter

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
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._



object Result {

  /*
   * Complete the 'getLargestString' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. STRING s
   *  2. INTEGER k
   */




  def getLargestString(s: String, k: Int): String = {
    import scala.collection.mutable.ArrayBuffer
    import scala.util.control._
    val loop = Breaks
    def r(ss:Array[Char], sub: Array[Char]):Array[Char] = if(ss.isEmpty) sub
    else {
      val letter = ss.head
      if(sub.isEmpty) r(ss.drop(1),sub ++ Array(letter))
      else{
        val mSub = ArrayBuffer[Char]() ++ sub
        val mSub2 = ArrayBuffer[Char]()
        loop.breakable{
          for (e <- mSub.zipWithIndex) {
            if(e._1 < letter){
              if(mSub.take(e._2).reverse.takeWhile(_ == letter).length < k){
                mSub.insert(e._2,letter)
                loop.break
              }else if(mSub.drop(e._2+1).takeWhile(_ == letter).length < k){
                mSub.insert(e._2 + 1,letter)
                loop.break
              }else{
                if(mSub.drop(e._2+1).length == 0)
                  if(mSub(e._2) != letter){
                    mSub.insert(e._2 + 1,letter)
                    loop.break
                  }else {
                    mSub2 ++= Array(letter)
                  }
              }
            }else if(mSub.drop(e._2+1).length == 0 && mSub(e._2) != letter){
              mSub.insert(e._2 + 1,letter)
              loop.break
            }
          }
        }
        if(!mSub2.isEmpty && mSub.last != mSub2.head){
          mSub.insert(mSub.length,mSub2.head)
          mSub2.remove(0)
        }
        r(ss.drop(1),mSub.toArray)
      }
    }
    r(s.toCharArray,Array[Char]()).mkString
  }



  def main(args: Array[String]) {
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val k = StdIn.readLine.trim.toInt

    val result = Result.getLargestString(s, k)

    println(result)

  }
}
