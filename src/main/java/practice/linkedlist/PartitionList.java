package practice.linkedlist;

public class PartitionList {


   public Node partition(Node head, int partition) {
      Node smaller = new Node(0), greater = new Node(0);
      Node smallerPtr = smaller;
      Node greaterPtr = greater;

      while (head != null) {
         if (head.data < partition) {
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
