package HackerRank.ProJtEuler.P002

object S2 {

  def main(args: Array[String]): Unit = {
    Solution.main(args)
  }

  //    val cache = scala.collection.mutable.Map.empty[Int, Long]
  //      cache.getOrElseUpdate(n, ((math.pow(gold,n) - math.pow(-gold,-n)) / math.sqrt(5)).toLong)

  object Solution {
    // implement the big log function.
    val sqrt5 = math.sqrt(5)
    val gold = (1 + sqrt5) / 2
    val n_gold = (1 - sqrt5) / 2

    def log_gold(n: Double) = (math.log((n * sqrt5 + math.sqrt(5 * math.pow(n, 2) + 4)) / 2) / math.log(gold)).toLong

    def fib(n: Double) = ((math.pow(gold, n) - math.pow(n_gold, n)) / sqrt5).toLong

    def main(args: Array[String]): Unit = {
      val sc = new java.util.Scanner(System.in);
      for (_ <- 1 to sc.nextInt()) yield {
        val n = sc.nextDouble()
        val data_1 = log_gold(n)
        println((fib(data_1 - (data_1 % 3) + 2) - 1) / 2)
      }
    }
  }


  def _fibM[K, V](f: K => V): K => V = {
    val cache = scala.collection.mutable.Map.empty[K, V]
    k => cache.getOrElseUpdate(k, f(k))
  }

  val fibM: Int => BigInt = _fibM(n => n match {
    case 0 => 0
    case 1 => 1
    case _ => fibM(n - 2) + fibM(n - 1)
  })
}
