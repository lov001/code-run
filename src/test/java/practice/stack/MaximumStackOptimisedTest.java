package practice.stack;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumStackOptimisedTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      MaximumStackOptimised myStack = new MaximumStackOptimised();
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
      Assertions.assertEquals(5, myStack.peekMax());
   }

   @Test
   void test_push_expect7_whenStackHas3Elements() {
      MaximumStackOptimised myStack = new MaximumStackOptimised();
      myStack.push(5);
      myStack.push(2);
      myStack.push(7);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(7, myStack.peekMax());
   }

   @Test
   void test_pop_expectMinus1_whenStackIsEmpty() {
      MaximumStackOptimised myStack = new MaximumStackOptimised();
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      MaximumStackOptimised myStack = new MaximumStackOptimised();
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_MaximumStackOptimised() {
      MaximumStackOptimised myStack = new MaximumStackOptimised();
      myStack.push(8);
      myStack.push(5);
      Assertions.assertEquals(5, myStack.peek());
      Assertions.assertEquals(8, myStack.peekMax());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(8, myStack.popMax());
      myStack.push(7);
      myStack.push(12);
      myStack.push(2);
      Assertions.assertEquals(2, myStack.peek());
      Assertions.assertEquals(12, myStack.peekMax());
      Assertions.assertEquals(12, myStack.popMax());
      myStack.pop();
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(7, myStack.peekMax());
      myStack.pop();
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_MaximumStackOptimised2() {
      MaximumStackOptimised myStack = new MaximumStackOptimised();
      myStack.push(5);
      myStack.push(1);
      myStack.push(5);
      Assertions.assertEquals(5, myStack.peek());
      Assertions.assertEquals(5, myStack.popMax());
      Assertions.assertEquals(1, myStack.peek());
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peekMax());
      Assertions.assertEquals(1, myStack.pop());
      Assertions.assertEquals(5, myStack.peek());
   }
}
