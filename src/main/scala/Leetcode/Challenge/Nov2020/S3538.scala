package Leetcode.Challenge.Nov2020

object S3538 {
  //  Numbers At Most N Given Digit Set
//https://leetcode.com/explore/featured/card/november-leetcoding-challenge/566/week-3-november-15th-november-21st/3538/
  object Solution {
    def atMostNGivenDigitSet(digits: Array[String], n: Int): Int = {
      val l = n.toString.length
      (1 to (if (l > 1) l - 1 else 1)).map(math.pow(digits.length, _)).filter(_ <= n).sum.toInt
    }
  }
}
