package HackerRank.ProJtEuler.P001

object S1 {


  def main(args: Array[String]): Unit = {
    Solution.main(args)
  }

  //https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem

  object Solution {

    import java.math.{BigDecimal, MathContext, RoundingMode}

    def main(args: Array[String]): Unit = {
      val sc = new java.util.Scanner(System.in);
      val t1 = new BigDecimal(1);
      val t2 = new BigDecimal(2);
      val t3 = new BigDecimal(3);
      val t5 = new BigDecimal(5);
      val t15 = new BigDecimal(15);
      val mc = new MathContext(0, RoundingMode.DOWN);
      for (_ <- 0 until sc.nextInt()) yield {
        val n = sc.nextBigDecimal()
        val sub = n.subtract(t1).toBigInteger
        val s = new BigDecimal(sub.divide(t3.toBigInteger))
        val ii = new BigDecimal(sub.divide(t5.toBigInteger))
        val x = new BigDecimal(sub.divide(t15.toBigInteger))
        val m3 = s.divide(t2, mc).multiply(t3.multiply(s.add(t1)))
        val m5 = ii.divide(t2, mc).multiply(t5.multiply(ii.add(t1)))
        val m15 = x.divide(t2, mc).multiply(t15.multiply(x.add(t1)))
        println(m3.add(m5).subtract(m15).toBigInteger)
      }
    }
  }

}
