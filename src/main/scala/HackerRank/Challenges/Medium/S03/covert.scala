//package HackerRank.Challenges.Medium.S03
//
//
//
//object covert {
//  def covertToSec(f: Float): Int = {
//    val i = f.toInt
//    val l = (f-i).toString.length - 2
//    i * 3600 + ((f-i) * l * 60).toInt
//  }
//
//  def removeDuplicateWords(s: String):String ={
//    var list = Array[String]()
//    var word:String = ""
//      for(i <- s.toCharArray)
//        if(i == ' ') {
//          if(list.exists(_ != word)) list = list.appended(word)
//          word = ""
//        } else word += i
//    list.mkString
//  }
//
//  def removeDupWordsRecurve(source: String, result:String):String = {
//    if (source.isEmpty) return result
//    var word:String = ""
//    var data = source.toCharArray
//    while (data.head !=' ' && !data.isEmpty ){
//      word += data.head
//      data = data.drop(1)
//    }
//    var word2:String = ""
//    var list = Array[String]()
//    for(i <- result.toCharArray)
//      if(i == ' ') {
//        list = list.appended(word2)
//        word2 = ""
//      } else word2 += i
//    if(list.exists(_ == word)) removeDupWordsRecurve(data.mkString,result)
//    else removeDupWordsRecurve(data.mkString, result + " " + word)
//  }
//
//  def findSmallestArray(s:String):String ={
//    val data = s.split("\\),")
//    val head = data.head.toCharArray.drop(1).mkString + ")"
//    val tail = data.last.toCharArray.dropRight(1).mkString
//    val data2 = data.drop(1).dropRight(1).map(r => r + ")")
//    data2.appended(head).appended(tail).minBy(_.length)
//  }
//
//  def cusRegex(s:String) ={
//    "(?<![aeiouAEIOU]).".r.findAllIn(s).mkString(",")
//  }
//
//  def main(args: Array[String]): Unit = {
////    print(findSmallestArray("((1,2,3),(2,4,5),(2,5,67,12,2))"))
//   print(cusRegex("RegExr was created by gskinner.com, and is proudly hosted by Media Temple.\n\nEdit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode).\n\nThe side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns).\n\nExplore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English."))
//  }
//
//}
