package Interview.Apple

import java.util.StringTokenizer


object apple {
  def retrieve(str: String,token: String):Seq[String] ={
    val tokenizer = new StringTokenizer(str,token)
    for ( i <- 0 to tokenizer.countTokens ) yield tokenizer.nextToken()
  }
  def sum(l: List[Int], t: Int)  = m(l,t)
  def m(list: List[Int], t:Int, s : List[List[Int]] = List[List[Int]]()):List[List[Int]] = if(list.isEmpty) s else  list.head match {
      case p if p > t => m(list.drop(1),t,s ++ List(n(list.drop(1),t)).filter(_.sum == t))
      case p if p == t => m(list.drop(1),t,s ++ List(List(p)))
      case _ => m(list.drop(1),t,s ++ List(n(list,t)).filter(_.sum == t))

  }

  def n(list: List[Int], t: Int, s: List[Int] = List[Int]()): List[Int] = if(list.isEmpty) s else s.sum + list.head match {
    case p if p > t => n(list.drop(1),t,s)
    case p if p < t => n(list.drop(1),t,s ++ List(list.head))
    case p if p == t => n(List(),t,s ++ List(list.head))
  }

  def live_max(birth: List[Int], death: List[Int]) = {
    val index = birth.zip(death).zipWithIndex.map(p=> (p._1._2 - p._1._2,p._2)).maxBy(_._1)._2
    (birth(index),death(index))
  }




  def main(args: Array[String]): Unit = {
//      println(sum(List(1,2,5,1,2,2,1,5,1),30))

  }
}
