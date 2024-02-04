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
   }

   @Test
   void test_sumList_expectListSum7_whenList1Is3AndList2Is4() {
      Node l11 = new Node(3, null);
      Node l21 = new Node(4, null);

      Node output = classObj.sumList(l11, l21);
      Assertions.assertEquals(7, output.data);
      Assertions.assertNull(output.next);
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
   }

}
