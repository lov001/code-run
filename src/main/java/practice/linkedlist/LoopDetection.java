package practice.linkedlist;

public class LoopDetection {


   public Node circularList(Node head) {
      if (head == null || head.next == null) {
         return null;
      }
      Node slow = head, fast = head;
      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
         if (fast == slow) {
            Node ptr = head;
            while (ptr != slow) {
               ptr = ptr.next;
               slow = slow.next;
            }
            return slow;
         }
      }
      return null;
   }

}
