package HackerRank.Twwiter

object Solution {



  def findLIS(s: Array[Int]): Int = {
    def findSub(ss: Array[Int],sub:Array[Array[Int]]):Array[Array[Int]] = if(ss.isEmpty) sub
    else{
      val subZ:Array[(Array[Int],Int)] = sub.zipWithIndex
      val subSmall =  subZ.filter( p => p._1.last < ss.head )

      if(subSmall.isEmpty)
        findSub(ss.drop(1), sub ++ (subZ.filter( p => p._1.last > ss.head).map(_._1).distinct.map[Array[Int]](_ ++ Array[Int](ss.head)) ++ Array(Array[Int](ss.head)) ))
      else {
        import scala.collection.mutable.ArrayBuffer
        val mSub =  ArrayBuffer[Array[Int]]() ++ sub
        subSmall.foreach{p=>
          mSub(p._2) = (sub(p._2) ++ Array(ss.head))
          if(p._2 > 0 && sub(p._2 - 1).head < ss.head)
            mSub ++= Array(Array(sub(p._2 - 1)).head,Array(ss.head))
        }

        findSub(ss.drop(1), mSub.toArray)
      }
    }

    findSub(s,Array[Array[Int]]()).map(_.length).max
  }


  def main(args: Array[String]) {
    val _s_size = io.StdIn.readInt()
    val _s = new Array[Int](_s_size)
    for (_s_i <- 0 until _s_size) {
      var _s_item:Int = io.StdIn.readInt()


      _s(_s_i) = _s_item
    }

    val res =         findLIS(_s)
    println(res)


  }
}