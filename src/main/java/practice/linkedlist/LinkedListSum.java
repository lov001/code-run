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
      if (sum > 9) {
         carry = 1;
         sum = sum % 10;
      }
      head.data = sum;
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
      while (ptr1 != null && ptr2 != null) {
         sum = ptr1.data + ptr2.data + carry;
         if (sum > 9) {
            carry = 1;
            sum = sum % 10;
         } else {
            carry = 0;
         }
         Node node = new Node(sum);
         ptr.next = node;
         ptr = node;
         ptr1 = ptr1.next;
         ptr2 = ptr2.next;
      }
      while (ptr1 != null) {
         sum = ptr1.data + carry;
         if (sum > 9) {
            carry = 1;
            sum = sum % 10;
         } else {
            carry = 0;
         }
         Node node = new Node(sum);
         ptr.next = node;
         ptr = node;
         ptr1 = ptr1.next;
      }
      while (ptr2 != null) {
         sum = ptr2.data + carry;
         if (sum > 9) {
            carry = 1;
            sum = sum % 10;
         } else {
            carry = 0;
         }
         Node node = new Node(sum);
         ptr.next = node;
         ptr = node;
         ptr2 = ptr2.next;
      }
      if(carry == 1){
         ptr.next = new Node(carry);
      }

      return head;
   }

}
