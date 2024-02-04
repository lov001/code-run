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

   public Node sumListRecursively(Node l1, Node l2, int carry) {
      if (l1 == null && l2 == null && carry == 0) {
         return null;
      }
      Node node = new Node();
      int value = carry;
      if (l1 != null) {
         value += l1.data;
      }
      if (l2 != null) {
         value += l2.data;
      }
      node.data = value % 10;
      if (l1 != null || l2 != null) {
         node.next = sumListRecursively(
             l1 == null ? null : l1.next,
             l2 == null ? null : l2.next,
             value > 9 ? 1 : 0);
      }
      return node;
   }

   class PartialSum {


      public Node sum = null;
      public int carry = 0;
   }

   public Node addListReverse(Node l1, Node l2) {
      int length1 = length(l1);
      int length2 = length(l2);
      if (length1 < length2) {
         l1 = padList(l1, length2 - length1);
      } else if (length1 > length2) {
         l2 = padList(l2, length1 - length2);
      }
      PartialSum sum = addListsHelper(l1, l2);
      if (sum.carry == 0) {
         return sum.sum;
      } else {
         return insertBefore(sum.sum, sum.carry);
      }
   }

   private int length(Node l) {
      int length = 0;
      while (l != null) {
         length++;
         l = l.next;
      }
      return length;
   }

   private Node padList(Node ptr, int padLength) {
      Node head = ptr;
      for (int i = 0; i < padLength; i++) {
         head = insertBefore(head, 0);
      }
      return head;
   }

   private Node insertBefore(Node list, int data) {
      Node node = new Node(data);
      if (list != null) {
         node.next = list;
      }
      return node;
   }

   private PartialSum addListsHelper(Node l1, Node l2) {
      if (l1 == null && l2 == null) {
         return new PartialSum();
      }
      PartialSum sum = addListsHelper(l1.next, l2.next);
      int value = sum.carry + l1.data + l2.data;
      sum.sum = insertBefore(sum.sum, value % 10);
      sum.carry = value / 10;
      return sum;
   }
}
