package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteMiddleNodeTest {


   DeleteMiddleNode classObj = new DeleteMiddleNode();

   @Test
   void test_deleteMiddle_expectSameLinkedList_whenNoDuplicates() {
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
   void test_deleteMiddle_expectLinkedListWithNoDuplicate_whenDuplicatesExists() {
      Node fifth = new Node(5, null);
      Node fourth = new Node(5, fifth);
      Node copy = new Node(4, fourth);
      Node third = new Node(2, copy);
      Node second = new Node(2, third);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(2, first.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.next.data);
   }

   @Test
   void test_removeDuplicatesWithoutExtraSpace_expectSameLinkedList_whenNoDuplicates() {
      Node fifth = new Node(5, null);
      Node fourth = new Node(4, fifth);
      Node third = new Node(3, fourth);
      Node second = new Node(2, third);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(3, first.next.next.data);
      Assertions.assertEquals(4, first.next.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.next.data);
   }

   @Test
   void test_removeDuplicatesWithoutExtraSpace_expectLinkedListWithNoDuplicate_whenDuplicatesExists() {
      Node fifth = new Node(5, null);
      Node fourth = new Node(5, fifth);
      Node copy = new Node(4, fourth);
      Node third = new Node(2, copy);
      Node second = new Node(2, third);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(4, first.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.data);
   }

   @Test
   void test_deleteMiddle_expectLinkedListWithNoDuplicate_whenDuplicatesExists2() {
      Node fifth = new Node(2, null);
      Node fourth = new Node(5, fifth);
      Node copy = new Node(4, fourth);
      Node third = new Node(2, copy);
      Node second = new Node(2, third);
      Node first = new Node(1, second);
      classObj.deleteMiddle(first);

      Assertions.assertEquals(1, first.data);
      Assertions.assertEquals(2, first.next.data);
      Assertions.assertEquals(4, first.next.next.data);
      Assertions.assertEquals(5, first.next.next.next.data);
      Assertions.assertNull(first.next.next.next.next);
   }

}
