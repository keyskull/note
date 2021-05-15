package mist

import scala.io.StdIn

object MatrixLayerRotation {
  // Complete the matrixRotation function below.
  def matrixRotation(matrix: Array[Array[Int]], r: Int) {
    //    matrix.map(i => for(i <- 0 to (i.length/2).toInt)  )
    //    val m =
    //    if( r - 1 != 0) matrixRotation(m, r - 1) else m
  }

  def main(args: Array[String]): Unit = {
    val mnr = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val m = mnr(0).toInt

    val n = mnr(1).toInt

    val r = mnr(2).toInt

    val matrix = Array.ofDim[Int](m, n)

    for (i <- 0 until m) {
      matrix(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    matrixRotation(matrix, r)
  }
}
