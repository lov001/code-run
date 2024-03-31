package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteMiddleNodeTest {


   DeleteMiddleNode classObj = new DeleteMiddleNode();

   @Test
   void test_deleteMiddle_expect3ToBeRemoved_whenNoOfElementsIs5() {
      Node fifth = new Node(5, null);
      Node fourth = new Node(4, fifth);
      Node third = new Node(3, fourth);
      Node second = new Node(2, third);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(4, first.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.data);
      Assertions.assertNull(first.next.next.next.next);
   }

   @Test
   void test_deleteMiddle_expect4ToBeRemoved_whenNoOfElementsIs6() {
      Node fifth = new Node(6, null);
      Node fourth = new Node(5, fifth);
      Node copy = new Node(4, fourth);
      Node third = new Node(3, copy);
      Node second = new Node(2, third);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(3, first.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.data);
      Assertions.assertEquals(6, first.next.next.next.next.data);
   }

   @Test
   void test_deleteMiddle_expectNothingToBeRemoved_whenOnlyHeadNode() {
      Node first = new Node(1, null);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertNull(first.next);
   }

   @Test
   void test_deleteMiddle_expectNothingToBeRemoved_whenNoOfElementsIs2() {
      Node second = new Node(2, null);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertNull(first.next.next);
   }

   @Test
   void test_deleteMiddleWhenOnlyThatNodeIsGiven_expect4ToBeRemoved_whenNoOfElementsIs6() {
      Node fifth = new Node(6, null);
      Node fourth = new Node(5, fifth);
      Node copy = new Node(4, fourth);
      Node third = new Node(3, copy);
      Node second = new Node(2, third);
      Node first = new Node(1, second);

      Assertions.assertTrue(classObj.deleteMiddleWhenOnlyThatNodeIsGiven(copy));
      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(3, first.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.data);
      Assertions.assertEquals(6, first.next.next.next.next.data);
   }

}
