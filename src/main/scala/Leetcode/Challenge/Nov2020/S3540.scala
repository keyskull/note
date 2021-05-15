package Leetcode.Challenge.Nov2020

//  Unique Morse Code Words
// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/567/week-4-november-22nd-november-28th/3540/
object S3540 {

  object Solution {
    def uniqueMorseRepresentations(words: Array[String]): Int = {
      val m = Map[Char, String](
        'a' -> ".-",
        'b' -> "-...",
        'c' -> "-.-.",
        'd' -> "-..",
        'e' -> ".",
        'f' -> "..-.",
        'g' -> "--.",
        'h' -> "....",
        'i' -> "..",
        'j' -> ".---",
        'k' -> "-.-",
        'l' -> ".-..",
        'm' -> "--",
        'n' -> "-.",
        'o' -> "---",
        'p' -> ".--.",
        'q' -> "--.-",
        'r' -> ".-.",
        's' -> "...",
        't' -> "-",
        'u' -> "..-",
        'v' -> "...-",
        'w' -> ".--",
        'x' -> "-..-",
        'y' -> "-.--",
        'z' -> "--..")
      words.map(_.toCharArray.map(m(_)).mkString).distinct.length
    }
  }

}
