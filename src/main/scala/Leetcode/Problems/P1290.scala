package Leetcode.Problems

object P1290 {

//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
  object Solution {

    class ListNode(_x: Int = 0, _next: ListNode = null) {
      var next: ListNode = _next
      var x: Int = _x
    }

    def getDecimalValue(head: ListNode): Int = {
      def D(h: ListNode): (Int, Int) = {
        if (h.next != null) {
          val d = D(h.next)
          (d._1 + 1, d._2 + scala.math.pow(2, d._1).toInt * h.x)
        } else (1, h.x)
      }

      D(head)._2
    }

    def main(args: Array[String]): Unit = {

      println(getDecimalValue(new ListNode(1,
        new ListNode(0,
          new ListNode(0,
            new ListNode(1,
              new ListNode(0,
                new ListNode(0,
                  new ListNode(1,
                    new ListNode(1,
                      new ListNode(1,
                        new ListNode(0,
                          new ListNode(0,
                            new ListNode(0,
                              new ListNode(0,
                                new ListNode(0,
                                  new ListNode(0)))))))))))))))))
    }

  }

}
