package mist

object WordHist {


  def wordHist(sentence:String,hist:Map[String,Int]) = {
    val word:String = sentence.takeWhile((('A' to 'z') ++ Seq('-') ++ Seq('_')).contains(_))
     word
  }


}
