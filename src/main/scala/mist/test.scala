package mist

object test {

  def expr = {
    val x = {
      print("x"); 1
    }
    lazy val y = {
      print("y"); 2
    }

    def z = {
      print("z"); 3
    }

    z + y + x + z + y + x
  }

  def main(args: Array[String]): Unit = {
    //    expr
    var x, y, z = (1, 2, 3)
    println(y)
  }

}
