package practice.queue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueUsingTwoStacksOptimisedTest {


   @Test
   void test_add_expectSameElement_whenQueueIsEmpty() {
      QueueUsingTwoStacksOptimised<Integer> myQueue = new QueueUsingTwoStacksOptimised<>();
      myQueue.add(5);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(5, myQueue.peek());
   }

   @Test
   void test_add_expectFirstElement_whenQueueIsNotEmpty() {
      QueueUsingTwoStacksOptimised<Integer> myQueue = new QueueUsingTwoStacksOptimised<>();
      myQueue.add(5);
      myQueue.add(2);
      myQueue.add(7);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(5, myQueue.peek());
   }

   @Test
   void test_remove_expectException_whenQueueIsEmpty() {
      QueueUsingTwoStacksOptimised<Integer> myQueue = new QueueUsingTwoStacksOptimised<>();
      Assertions.assertTrue(myQueue.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myQueue::remove);
   }

   @Test
   void test_remove_expectFirstElement_whenQueueHasOnlyOneElement() {
      QueueUsingTwoStacksOptimised<Integer> myQueue = new QueueUsingTwoStacksOptimised<>();
      myQueue.add(5);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(5, myQueue.remove());
      Assertions.assertTrue(myQueue.isEmpty());
   }

   @Test
   void test_QueueUsingTwoStacksOptimised() {
      QueueUsingTwoStacksOptimised<Integer> myQueue = new QueueUsingTwoStacksOptimised<>();
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
