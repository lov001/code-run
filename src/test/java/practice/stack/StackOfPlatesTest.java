package practice.stack;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackOfPlatesTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      StackOfPlates myStack = new StackOfPlates(3);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
   }

   @Test
   void test_push_expectTopElement_whenStackIsNotEmpty() {
      StackOfPlates myStack = new StackOfPlates(3);
      myStack.push(5);
      myStack.push(2);
      myStack.push(7);
      myStack.push(22);
      myStack.push(30);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(30, myStack.peek());
   }

   @Test
   void test_pop_expectException_whenStackIsEmpty() {
      StackOfPlates myStack = new StackOfPlates(3);
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      StackOfPlates myStack = new StackOfPlates(3);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_StackUsingLinkedList() {
      StackOfPlates myStack = new StackOfPlates(3);
      myStack.push(1);
      myStack.push(2);
      Assertions.assertEquals(2, myStack.peek());
      Assertions.assertEquals(2, myStack.pop());
      Assertions.assertFalse(myStack.isEmpty());
      myStack.push(3);
      myStack.push(4);
      myStack.push(5);
      myStack.push(6);
      myStack.push(7);
      myStack.push(8);
      Assertions.assertEquals(8, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertEquals(6, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(4, myStack.peek());
   }

}
