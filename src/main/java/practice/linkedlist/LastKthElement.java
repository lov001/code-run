package practice.linkedlist;

public class LastKthElement {


   public int lastKthElement(Node head, int k) {
      if (head == null) {
         return -1;
      }
      if (head.next == null && k == 1) {
         return head.data;
      }
      Node fast = head;
      for (int i = 0; i < k; i++) {
         fast = fast.next;
         if (fast == null) {
            return -1;
         }
      }
      Node slow = head;
      while (fast != null) {
         slow = slow.next;
         fast = fast.next;
      }
      return slow.data;
   }

}
