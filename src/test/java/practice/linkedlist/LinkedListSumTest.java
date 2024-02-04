package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListSumTest {


   LinkedListSum classObj = new LinkedListSum();

   @Test
   void test_sumList_expectListSum912_whenList1Is617AndList2Is295() {
      Node l13 = new Node(6, null);
      Node l12 = new Node(1, l13);
      Node l11 = new Node(7, l12);

      Node l23 = new Node(2, null);
      Node l22 = new Node(9, l23);
      Node l21 = new Node(5, l22);

      Node output = classObj.sumList(l11, l21);
      Assertions.assertEquals(2, output.data);
      Assertions.assertEquals(1, output.next.data);
      Assertions.assertEquals(9, output.next.next.data);

      Node outputRecursively = classObj.sumListRecursively(l11, l21, 0);
      Assertions.assertEquals(2, outputRecursively.data);
      Assertions.assertEquals(1, outputRecursively.next.data);
      Assertions.assertEquals(9, outputRecursively.next.next.data);

      Node ll13 = new Node(7, null);
      Node ll12 = new Node(1, ll13);
      Node ll11 = new Node(6, ll12);

      Node ll23 = new Node(5, null);
      Node ll22 = new Node(9, ll23);
      Node ll21 = new Node(2, ll22);

      Node outputRecursivelyReverse = classObj.addListReverse(ll11, ll21);
      Assertions.assertEquals(9, outputRecursivelyReverse.data);
      Assertions.assertEquals(1, outputRecursivelyReverse.next.data);
      Assertions.assertEquals(2, outputRecursivelyReverse.next.next.data);
   }

   @Test
   void test_sumList_expectListSum1465_whenList1Is879AndList2Is586() {
      Node l13 = new Node(8, null);
      Node l12 = new Node(7, l13);
      Node l11 = new Node(9, l12);

      Node l23 = new Node(5, null);
      Node l22 = new Node(8, l23);
      Node l21 = new Node(6, l22);

      Node output = classObj.sumList(l11, l21);
      Assertions.assertEquals(5, output.data);
      Assertions.assertEquals(6, output.next.data);
      Assertions.assertEquals(4, output.next.next.data);
      Assertions.assertEquals(1, output.next.next.next.data);

      Node outputRecursively = classObj.sumListRecursively(l11, l21, 0);
      Assertions.assertEquals(5, outputRecursively.data);
      Assertions.assertEquals(6, outputRecursively.next.data);
      Assertions.assertEquals(4, outputRecursively.next.next.data);
      Assertions.assertEquals(1, outputRecursively.next.next.next.data);

      Node ll13 = new Node(9, null);
      Node ll12 = new Node(7, ll13);
      Node ll11 = new Node(8, ll12);

      Node ll23 = new Node(6, null);
      Node ll22 = new Node(8, ll23);
      Node ll21 = new Node(5, ll22);

      Node outputRecursivelyReverse = classObj.addListReverse(ll11, ll21);
      Assertions.assertEquals(1, outputRecursivelyReverse.data);
      Assertions.assertEquals(4, outputRecursivelyReverse.next.data);
      Assertions.assertEquals(6, outputRecursivelyReverse.next.next.data);
      Assertions.assertEquals(5, outputRecursivelyReverse.next.next.next.data);
   }


   @Test
   void test_sumList_expectListSum7_whenList1Is3AndList2Is4() {
      Node l11 = new Node(3, null);
      Node l21 = new Node(4, null);

      Node output = classObj.sumList(l11, l21);
      Assertions.assertEquals(7, output.data);
      Assertions.assertNull(output.next);

      Node outputRecursively = classObj.sumListRecursively(l11, l21, 0);
      Assertions.assertEquals(7, outputRecursively.data);
      Assertions.assertNull(outputRecursively.next);

      Node outputRecursivelyReverse = classObj.addListReverse(l11, l21);
      Assertions.assertEquals(7, outputRecursivelyReverse.data);
      Assertions.assertNull(outputRecursivelyReverse.next);
   }

   @Test
   void test_sumList_expectListSum640_whenList1Is617AndList2Is23() {
      Node l13 = new Node(6, null);
      Node l12 = new Node(1, l13);
      Node l11 = new Node(7, l12);

      Node l22 = new Node(2, null);
      Node l21 = new Node(3, l22);

      Node output = classObj.sumList(l11, l21);
      Assertions.assertEquals(0, output.data);
      Assertions.assertEquals(4, output.next.data);
      Assertions.assertEquals(6, output.next.next.data);

      Node outputRecursively = classObj.sumListRecursively(l11, l21, 0);
      Assertions.assertEquals(0, outputRecursively.data);
      Assertions.assertEquals(4, outputRecursively.next.data);
      Assertions.assertEquals(6, outputRecursively.next.next.data);

      Node ll13 = new Node(7, null);
      Node ll12 = new Node(1, ll13);
      Node ll11 = new Node(6, ll12);

      Node ll22 = new Node(3, null);
      Node ll21 = new Node(2, ll22);

      Node outputRecursivelyReverse = classObj.addListReverse(ll11, ll21);
      Assertions.assertEquals(6, outputRecursivelyReverse.data);
      Assertions.assertEquals(4, outputRecursivelyReverse.next.data);
      Assertions.assertEquals(0, outputRecursivelyReverse.next.next.data);
   }

   @Test
   void test_sumList_expectListSum640_whenList1Is23AndList2Is617() {
      Node l13 = new Node(6, null);
      Node l12 = new Node(1, l13);
      Node l11 = new Node(7, l12);

      Node l22 = new Node(2, null);
      Node l21 = new Node(3, l22);

      Node output = classObj.sumList(l21, l11);
      Assertions.assertEquals(0, output.data);
      Assertions.assertEquals(4, output.next.data);
      Assertions.assertEquals(6, output.next.next.data);

      Node outputRecursively = classObj.sumListRecursively(l11, l21, 0);
      Assertions.assertEquals(0, outputRecursively.data);
      Assertions.assertEquals(4, outputRecursively.next.data);
      Assertions.assertEquals(6, outputRecursively.next.next.data);

      Node ll13 = new Node(7, null);
      Node ll12 = new Node(1, ll13);
      Node ll11 = new Node(6, ll12);

      Node ll22 = new Node(3, null);
      Node ll21 = new Node(2, ll22);

      Node outputRecursivelyReverse = classObj.addListReverse(ll11, ll21);
      Assertions.assertEquals(6, outputRecursivelyReverse.data);
      Assertions.assertEquals(4, outputRecursivelyReverse.next.data);
      Assertions.assertEquals(0, outputRecursivelyReverse.next.next.data);
   }

}
