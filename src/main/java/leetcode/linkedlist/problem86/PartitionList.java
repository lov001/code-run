package leetcode.linkedlist.problem86;

import leetcode.linkedlist.ListNode;

public class PartitionList {


   public ListNode partition(ListNode head, int x) {
      ListNode smaller = new ListNode(0), greater = new ListNode(0);
      ListNode smallerPtr = smaller;
      ListNode greaterPtr = greater;

      while (head != null) {
         if (head.val < x) {
            smallerPtr.next = head;
            smallerPtr = head;
         } else {
            greaterPtr.next = head;
            greaterPtr = head;
         }
         head = head.next;
      }
      greaterPtr.next = null;
      smallerPtr.next = greater.next;
      return smaller.next;
   }

}
