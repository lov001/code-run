package practice.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {


   public void removeDuplicates(Node head) {
      if (head == null || head.next == null) {
         return;
      }
      Set<Integer> set = new HashSet<>();
      Node ptr = head;
      while (ptr.next != null) {
         set.add(ptr.data);
         if (set.contains(ptr.next.data)) {
            ptr.next = ptr.next.next;
         } else {
            ptr = ptr.next;
         }
      }
   }

   public void removeDuplicatesWithoutExtraSpace(Node head) {
      if (head == null || head.next == null) {
         return;
      }
      Node current = head;

      while (current != null) {
         Node runner = current;
         while(runner.next != null){
            if (current.data == runner.next.data) {
               runner.next = runner.next.next;
            } else{
               runner = runner.next;
            }
         }
         current = current.next;
      }
   }

}
