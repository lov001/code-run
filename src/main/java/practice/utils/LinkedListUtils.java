package practice.utils;

import practice.linkedlist.Node;

public class LinkedListUtils {

   public static int length(Node l) {
      int length = 0;
      while (l != null) {
         length++;
         l = l.next;
      }
      return length;
   }

}
