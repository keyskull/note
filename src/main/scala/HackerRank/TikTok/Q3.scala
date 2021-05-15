package HackerRank.TikTok

import HackerRank.TikTok.Q3.Result.maxCreators

import scala.collection.mutable.ArrayBuffer


object Q3 {


  object Result {

    /*
     * Complete the 'maxCreators' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY startTime
     *  2. INTEGER_ARRAY duration
     */
    // Write your code here

    def maxCreators(startTime: Array[Int], duration: Array[Int]): Int = {
      val ss = startTime.zipWithIndex.groupBy(_._1).toArray.sortBy(_._1)
      val v = ss.map(p => p._1 -> p._2.map(pp => pp._1 + duration(pp._2)))
      println(v.map(p => p._1 -> p._2.mkString(",")).toString())
      val array = v.map(_._2)

      println(array.map("(" + _.mkString(",") + ")").toString())

      case class Vertex(point: Int, path: List[Vertex], longest: Int)

      val vertexes = array.zip(array.drop(1)).map(p => p._1.map(pp => Vertex(point = pp, path = p._2.filter(s => pp <= s).map(v => Vertex(point = v, path = List(), 1)).toList, 2)))

      def buildGraph(vertexes: Array[Array[Vertex]]): Array[Array[Vertex]] = {
        if (vertexes.length > 1)
          buildGraph(vertexes.zip(vertexes.drop(1)).map(p => p._1.map(pp => Vertex(pp.point, p._2.filter(ppp => pp.point <= ppp.point).toList, p._2.head.longest + 1))))
        else vertexes
      }

      val result = buildGraph(vertexes.toArray)

      result.head.head.longest
    }


  }

  def main(args: Array[String]): Unit = {
    println(maxCreators(Array(5, 1, 1, 4, 2, 3), Array(5, 10, 3, 2, 4, 6)))
  }
}


