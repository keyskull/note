package mist

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object QuickSort {
  var count = 0

  def median_of_three(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    if (array.length <= 1) return array
    val median: Int = (array.length - 1) / 2
    val pivotArray: Array[Int] = Array(array(0), array(median), array(array.length - 1))
    val pivot: Int = if (pivotArray(0) != pivotArray.max && pivotArray(0) != pivotArray.min) 0 else if (pivotArray(2) != pivotArray.max && pivotArray(2) != pivotArray.min) array.length - 1 else median
    val d = array(pivot)
    array(pivot) = array(0)
    array(0) = d
    var i = 1
    for (j <- i to array.length - 1) {
      count = count + 1
      if (array(j) < array(0)) {
        val a = array(j)
        array(j) = array(i)
        array(i) = a
        i = i + 1
      }
    }
    val c = array(i - 1)
    array(i - 1) = d
    array(0) = c
    val split_arrays = array.splitAt(i - 1)
    val r1 = median_of_three(split_arrays._1)
    split_arrays._2.remove(0)
    val r2 = median_of_three(split_arrays._2)
    r1 ++ ArrayBuffer(d) ++ r2


  }


  def final_element(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    if (array.length <= 1) return array
    val pivot = 0
    val d11 = array(array.length - 1)
    array(array.length - 1) = array(0)
    array(0) = d11
    var i = pivot + 1
    for (j <- i to array.length - 1) {
      count = count + 1
      if (array(j) < array(pivot)) {
        val a = array(j)
        array(j) = array(i)
        array(i) = a
        i = i + 1
      }
    }
    val c = array(i - 1)
    val d = array(pivot)
    array(i - 1) = d11
    array(pivot) = c
    val split_arrays = array.splitAt(i - 1)
    val r1 = final_element(split_arrays._1)
    split_arrays._2.remove(0)
    val r2 = final_element(split_arrays._2)
    r1 ++ ArrayBuffer(d11) ++ r2
  }

  def first_element(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    if (array.length <= 1) return array
    val pivot = 0
    var i = pivot + 1
    for (j <- i to array.length - 1) {
      count = count + 1
      if (array(j) < array(pivot)) {
        val a = array(j)
        array(j) = array(i)
        array(i) = a
        i = i + 1
      }
    }
    val c = array(i - 1)
    val d = array(pivot)
    array(i - 1) = d
    array(pivot) = c
    val split_arrays = array.splitAt(i - 1)
    val r1 = first_element(split_arrays._1)
    split_arrays._2.remove(0)
    val r2 = first_element(split_arrays._2)
    r1 ++ ArrayBuffer(d) ++ r2
  }


  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("./QuickSort.txt")
    val data: ArrayBuffer[Int] = new ArrayBuffer[Int]() ++= file.getLines().toArray.map(x => x.toInt)
    // data.map(println(_))

    median_of_three(data).map(println(_))
    println("run:" + count)
    val a: Int = 4 / 2
    println(a)
  }
}
