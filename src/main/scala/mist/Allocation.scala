package mist

import scala.io.StdIn

object Allocation {

  def main(args: Array[String]): Unit = {
    var a = ""
    while ((a = StdIn.readLine) != "") {
      print(a)
    }
  }

}
