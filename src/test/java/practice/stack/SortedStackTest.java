package practice.stack;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedStackTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      SortedStack myStack = new SortedStack();
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
   }

   @Test
   void test_push_expectTopElement_whenStackIsNotEmpty() {
      SortedStack myStack = new SortedStack();
      myStack.push(5);
      myStack.push(1);
      myStack.push(3);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(1, myStack.peek());
   }

   @Test
   void test_pop_expectException_whenStackIsEmpty() {
      SortedStack myStack = new SortedStack();
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      SortedStack myStack = new SortedStack();
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_StackUsingLinkedList_whenElementsAreInsertedInAscendingOrder() {
      SortedStack myStack = new SortedStack();
      myStack.push(1);
      myStack.push(2);
      Assertions.assertEquals(1, myStack.peek());
      Assertions.assertEquals(1, myStack.pop());
      Assertions.assertFalse(myStack.isEmpty());
      myStack.push(3);
      myStack.push(4);
      myStack.push(5);
      Assertions.assertEquals(2, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertEquals(4, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_StackUsingLinkedList_whenElementsAreInsertedInRandomOrder() {
      SortedStack myStack = new SortedStack();
      myStack.push(5);
      myStack.push(7);
      myStack.push(2);
      myStack.push(3);
      myStack.push(1);
      myStack.push(9);
      myStack.push(8);
      Assertions.assertEquals(1, myStack.peek());
      Assertions.assertEquals(1, myStack.pop());
      myStack.push(3);
      myStack.push(4);
      myStack.push(5);
      Assertions.assertEquals(2, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertEquals(3, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
   }

}
