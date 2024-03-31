package practice.linkedlist;

public class LastKthElement {


   public int lastKthElement(Node head, int k) {
      if (head == null) {
         return -1;
      }
      if (head.next == null && k == 1) {
         return head.data;
      }
      Node fast = head;
      for (int i = 0; i < k; i++) {
         fast = fast.next;
         if (fast == null) {
            return -1;
         }
      }
      Node slow = head;
      while (fast != null) {
         slow = slow.next;
         fast = fast.next;
      }
      return slow.data;
   }

   private static class Index {


      public int index = 0;
   }

   public Node lastKthElementUsingRecursion(Node head, int k) {
      Index index = new Index();
      return lastKth(head, k, index);
   }

   private Node lastKth(Node ptr, int k, Index idx) {
      if (ptr == null) {
         return null;
      }
      Node node = lastKth(ptr.next, k, idx);
      idx.index = idx.index + 1;
      if (idx.index == k) {
         return ptr;
      }
      return node;
   }
}
