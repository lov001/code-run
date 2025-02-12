package revision;

import java.util.HashSet;
import java.util.Set;
import leetcode.linkedlist.ListNode;

public class IntersectionOfTwoLinkedList {

   public int findIntersectionDifferenceOfLength(ListNode firstHead, ListNode secondHead) {
      ListNode ptr1 = firstHead;
      ListNode ptr2 = secondHead;
      if (ptr1 == null || ptr2 == null) {
         return -1;
      }
      int length1 = findListLength(ptr1);
      int length2 = findListLength(ptr2);

      if (length1 - length2 > 0) {
         ptr1 = moveListForwardBy(ptr1, Math.abs(length1 - length2));
      }
      if (length2 - length1 > 0) {
         ptr2 = moveListForwardBy(ptr2, Math.abs(length1 - length2));
      }
      while (ptr1 != ptr2) {
         ptr1 = ptr1.next;
         ptr2 = ptr2.next;
         if (ptr1 == ptr2) {
            return ptr1.val;
         }
      }
      return ptr1.val;
   }

   public int findIntersectionTwoPointers(ListNode firstHead, ListNode secondHead) {
      ListNode ptr1 = firstHead;
      ListNode ptr2 = secondHead;
      if (ptr1 == null || ptr2 == null) {
         return -1;
      }
      while (ptr1 != ptr2) {
         ptr1 = ptr1.next;
         ptr2 = ptr2.next;
         if (ptr1 == ptr2) {
            return ptr1.val;
         }
         if (ptr1 == null) {
            ptr1 = secondHead;
         }
         if (ptr2 == null) {
            ptr2 = firstHead;
         }
      }
      return -1;
   }

   public int findIntersectionBruteForce(ListNode firstHead, ListNode secondHead) {
      Set<ListNode> nodeSet = new HashSet<>();
      ListNode ptr = firstHead;
      while (ptr != null) {
         nodeSet.add(ptr);
         ptr = ptr.next;
      }
      while (secondHead != null) {
         if (nodeSet.contains(secondHead)) {
            return secondHead.val;
         }
         secondHead = secondHead.next;
      }
      return -1;
   }

   private int findListLength(ListNode ptr) {
      int count = 0;
      while (ptr != null) {
         count++;
         ptr = ptr.next;
      }
      return count;
   }

   private ListNode moveListForwardBy(ListNode ptr, int offset) {
      for (int i = 0; i < offset; i++) {
         ptr = ptr.next;
      }
      return ptr;
   }
}
