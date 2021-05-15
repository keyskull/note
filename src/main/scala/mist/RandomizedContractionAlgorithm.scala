package mist

import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.util.Random

object RandomizedContractionAlgorithm {

  def apply(edges: Array[(Int, Int)]): Array[(Int, Int)] = {

    val newarray = new ArrayBuffer() ++= edges

    while (newarray.flatten(p => Array(p._1) ++ Array(p._2)).distinct.length > 2) {
      val index = new Random().nextInt(newarray.length - 1)
      val vertex = newarray(index)
      newarray.zipWithIndex.foreach { case (p, i) =>
        if (p._1 == vertex._2) newarray.update(i, if (vertex._1 < p._2) (vertex._1, p._2) else (p._2, vertex._1))
        if (p._2 == vertex._2) newarray.update(i, if (vertex._1 < p._2) (vertex._1, p._1) else (p._1, vertex._1))
      }
      newarray --= newarray.filter(p => p._1 == p._2)
    }
    newarray.toArray
  }

  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("./kargerMinCut.txt")
    val edges_raw = file.getLines().map { x =>
      val array = x.split("\t").map(_.toInt)
      val splited = array.splitAt(1)
      splited._2.map(d => if (splited._1.head < d) (splited._1.head, d) else (d, splited._1.head))
    }.toArray
    val edges = edges_raw.flatten.distinct

    println((1 to 100).map(p => apply(edges).length).min)

  }
}
