package practice.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersectionUsingHashing {


   public Node intersection(Node listA, Node listB) {
      Set<Node> listSet = new HashSet<>();
      while (listA != null) {
         listSet.add(listA);
         listA = listA.next;
      }
      while (listB != null) {
         if(listSet.contains(listB)){
            return listB;
         }
         listB = listB.next;
      }
      return null;
   }

}
