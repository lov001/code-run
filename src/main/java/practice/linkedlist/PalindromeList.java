package practice.linkedlist;

public class PalindromeList {


   public boolean isPalindrome(Node head) {
      if (head == null) {
         return false;
      } else if (head.next == null) {
         return true;
      }
      Node slow = head, fast = head;
      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }
      Node prev = null;
      Node current = slow;
      Node q;
      while (current != null) {
         q = current.next;
         current.next = prev;
         prev = current;
         current = q;
      }
      Node ptr = head;
      while (prev != null && ptr != null) {
         if (prev.data != ptr.data) {
            return false;
         }
         ptr = ptr.next;
         prev = prev.next;
      }
      return true;
   }

}
