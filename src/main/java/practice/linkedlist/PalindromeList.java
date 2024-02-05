package practice.linkedlist;

import java.util.Stack;
import practice.utils.LinkedListUtils;

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

   public boolean isPalindromeUsingStack(Node head) {
      if (head == null) {
         return false;
      } else if (head.next == null) {
         return true;
      } else if (head.next.next == null) {
         return head.data == head.next.data;
      }
      Node slow = head, fast = head;
      Stack<Integer> stack = new Stack<>();
      int length = LinkedListUtils.length(head);
      while (fast != null && fast.next != null) {
         stack.push(slow.data);
         slow = slow.next;
         fast = fast.next.next;
      }
      boolean flag = true;
      for (int i = 0; i < length / 2; i++) {
         if (flag && length % 2 == 0) {
            int val1 = stack.pop();
            int val2 = slow.data;
            flag = false;
            if (val1 != val2) {
               return false;
            }
         } else if (flag) {
            stack.pop();
         } else {
            int val1 = slow.data;
            int val2 = stack.pop();
            if (val1 != val2) {
               return false;
            }
         }
         slow = slow.next;
      }

      return true;
   }

}
