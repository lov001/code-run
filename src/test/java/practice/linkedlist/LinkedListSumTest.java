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

      Node l33 = new Node(9, null);
      Node l32 = new Node(1, l33);
      Node l31 = new Node(2, l32);

      Node output = classObj.sumList(l11, l21);
      Assertions.assertEquals(l31, output);
      Assertions.assertEquals(l32, output.next);
      Assertions.assertEquals(l33, output.next.next);
   }

}
