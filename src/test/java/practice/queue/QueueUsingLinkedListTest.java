package practice.queue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueUsingLinkedListTest {


   @Test
   void test_add_expectSameElement_whenQueueIsEmpty() {
      QueueUsingLinkedList<Integer> myQueue = new QueueUsingLinkedList<>();
      myQueue.add(5);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(5, myQueue.peek());
   }

   @Test
   void test_add_expectFirstElement_whenQueueIsNotEmpty() {
      QueueUsingLinkedList<Integer> myQueue = new QueueUsingLinkedList<>();
      myQueue.add(5);
      myQueue.add(2);
      myQueue.add(7);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(5, myQueue.peek());
   }

   @Test
   void test_remove_expectException_whenQueueIsEmpty() {
      QueueUsingLinkedList<Integer> myQueue = new QueueUsingLinkedList<>();
      Assertions.assertTrue(myQueue.isEmpty());
      Assertions.assertThrows(NoSuchElementException.class, myQueue::remove);
   }

   @Test
   void test_remove_expectFirstElement_whenQueueHasOnlyOneElement() {
      QueueUsingLinkedList<Integer> myQueue = new QueueUsingLinkedList<>();
      myQueue.add(5);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(5, myQueue.remove());
      Assertions.assertTrue(myQueue.isEmpty());
   }

   @Test
   void test_QueueUsingLinkedList() {
      QueueUsingLinkedList<Integer> myQueue = new QueueUsingLinkedList<>();
      myQueue.add(1);
      myQueue.add(2);
      Assertions.assertEquals(1, myQueue.peek());
      Assertions.assertEquals(1, myQueue.remove());
      Assertions.assertFalse(myQueue.isEmpty());
      myQueue.add(3);
      myQueue.add(4);
      myQueue.add(5);
      Assertions.assertEquals(2, myQueue.peek());
      myQueue.remove();
      myQueue.remove();
      Assertions.assertEquals(4, myQueue.peek());
      myQueue.remove();
      myQueue.remove();
      Assertions.assertTrue(myQueue.isEmpty());
   }

}
