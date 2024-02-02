package practice.linkedlist;

public class DeleteMiddleNode {


   public void deleteMiddle(Node head) {
      if (head == null || head.next == null) {
         return;
      }
      Node slow = head;
      Node fast = head.next.next;
      while (fast != null) {
         fast = fast.next;
         if (fast == null) {
            Node ptr = head;
            while (ptr.next != slow) {
               ptr = ptr.next;
            }
            ptr.next = slow.next;
         }
         slow = slow.next;
      }
   }

}
