package practice.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersectionUsingHashing {


   public Node intersectionWithHashSet(Node listA, Node listB) {
      Set<Node> listSet = new HashSet<>();
      while (listA != null) {
         listSet.add(listA);
         listA = listA.next;
      }
      while (listB != null) {
         if (listSet.contains(listB)) {
            return listB;
         }
         listB = listB.next;
      }
      return null;
   }

   public Node intersectionWithTwoPointers(Node listA, Node listB) {
      Node ptr1 = listA;
      Node ptr2 = listB;
      if (ptr1 == null || ptr2 == null) {
         return null;
      }
      while (ptr1 != ptr2) {
         ptr1 = ptr1.next;
         ptr2 = ptr2.next;
         if (ptr1 == ptr2) {
            return ptr1;
         }
         if (ptr1 == null) {
            ptr1 = listB;
         }
         if (ptr2 == null) {
            ptr2 = listA;
         }
      }
      return ptr1;
   }

   public Node intersectionWithDifferenceOfLength(Node listA, Node listB) {
      if (listA == null || listB == null) {
         return null;
      }
      int lenA = findListLength(listA);
      int lenB = findListLength(listB);
      if (lenA - lenB > 0) {
         listA = moveListForwardBy(listA, Math.abs(lenA - lenB));
      } else if (lenB - lenA > 0) {
         listB = moveListForwardBy(listB, Math.abs(lenA - lenB));
      }
      while (listA != listB) {
         listA = listA.next;
         listB = listB.next;
         if (listA == listB) {
            return listA;
         }
      }
      return null;
   }

   private int findListLength(Node ptr) {
      int count = 0;
      while (ptr != null) {
         count++;
         ptr = ptr.next;
      }
      return count;
   }

   private Node moveListForwardBy(Node ptr, int offset) {
      for (int i = 0; i < offset; i++) {
         ptr = ptr.next;
      }
      return ptr;
   }

}
