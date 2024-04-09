package practice.stack;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackUsingArrayTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      StacksUsingSingleArray myStack = new StacksUsingSingleArray(5);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
   }

   @Test
   void test_push_expectTopElement_whenStackIsNotEmpty() {
      StacksUsingSingleArray myStack = new StacksUsingSingleArray(5);
      myStack.push(5);
      myStack.push(2);
      myStack.push(7);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(7, myStack.peek());
   }

   @Test
   void test_pop_expectException_whenStackIsEmpty() {
      StacksUsingSingleArray myStack = new StacksUsingSingleArray(5);
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      StacksUsingSingleArray myStack = new StacksUsingSingleArray(5);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_StackUsingLinkedList() {
      StacksUsingSingleArray myStack = new StacksUsingSingleArray(5);
      myStack.push(1);
      myStack.push(2);
      Assertions.assertEquals(2, myStack.peek());
      Assertions.assertEquals(2, myStack.pop());
      Assertions.assertFalse(myStack.isEmpty());
      myStack.push(3);
      myStack.push(4);
      myStack.push(5);
      Assertions.assertEquals(5, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertEquals(3, myStack.peek());
      myStack.pop();
      myStack.pop();
      Assertions.assertTrue(myStack.isEmpty());
   }

}
