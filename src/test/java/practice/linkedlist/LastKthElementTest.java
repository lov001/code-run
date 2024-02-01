package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastKthElementTest {


   LastKthElement classObj = new LastKthElement();

   @Test
   void test_lastKthElement_expect4_whenKIs3() {
      Node fifth = new Node(5, null);
      Node fourth = new Node(5, fifth);
      Node copy = new Node(4, fourth);
      Node third = new Node(2, copy);
      Node second = new Node(2, third);
      Node first = new Node(1, second);

      Assertions.assertEquals(4, classObj.lastKthElement(first, 3));
   }

   @Test
   void test_lastKthElement_expect10_whenKIs2() {
      Node fourth = new Node(50, null);
      Node copy = new Node(10, fourth);
      Node third = new Node(1, copy);
      Node second = new Node(9, third);
      Node first = new Node(3, second);

      Assertions.assertEquals(10, classObj.lastKthElement(first, 2));
   }

   @Test
   void test_lastKthElement_expectMinus1_whenKIsGreaterThanLinkedListSize() {
      Node fourth = new Node(50, null);
      Node copy = new Node(10, fourth);
      Node third = new Node(1, copy);
      Node second = new Node(9, third);
      Node first = new Node(3, second);

      Assertions.assertEquals(-1, classObj.lastKthElement(first, 12));
   }

   @Test
   void test_lastKthElement_expect3_whenOnlyHeadNode() {
      Node first = new Node(3, null);

      Assertions.assertEquals(3, classObj.lastKthElement(first, 1));
   }

}
