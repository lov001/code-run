package practice.linkedlist;

public class LinkedListSum {


   public Node sumList(Node ptr1, Node ptr2) {
      if (ptr1 == null) {
         return ptr2;
      } else if (ptr2 == null) {
         return ptr1;
      }
      Node head = new Node();
      Node ptr = head;
      int carry = 0;
      int sum = ptr1.data + ptr2.data + carry;
      carry = sum > 9 ? 1 : 0;
      if (sum > 9) {
         sum = sum % 10;
      }
      head.data = sum;
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
      while (ptr1 != null && ptr2 != null) {
         sum = ptr1.data + ptr2.data + carry;
         carry = sum > 9 ? 1 : 0;
         if (sum > 9) {
            sum = sum % 10;
         }
         Node node = new Node(sum);
         ptr.next = node;
         ptr = node;
         ptr1 = ptr1.next;
         ptr2 = ptr2.next;
      }
      Node temp = null;
      if (ptr1 != null) {
         temp = ptr1;
      } else if (ptr2 != null) {
         temp = ptr2;
      }
      while (temp != null) {
         sum = temp.data + carry;
         carry = sum > 9 ? 1 : 0;
         if (sum > 9) {
            sum = sum % 10;
         }
         Node node = new Node(sum);
         ptr.next = node;
         ptr = node;
         temp = temp.next;
      }
      if (carry == 1) {
         ptr.next = new Node(carry);
      }
      return head;
   }

}
