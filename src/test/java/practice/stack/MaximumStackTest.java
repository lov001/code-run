package practice.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumStackTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      MaximumStack myStack = new MaximumStack();
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
      Assertions.assertEquals(5, myStack.peekMax());
   }

   @Test
   void test_push_expect7_whenStackHas3Elements() {
      MaximumStack myStack = new MaximumStack();
      myStack.push(5);
      myStack.push(2);
      myStack.push(7);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(7, myStack.peekMax());
   }

   @Test
   void test_pop_expectMinus1_whenStackIsEmpty() {
      MaximumStack myStack = new MaximumStack();
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertEquals(-1, myStack.pop());
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      MaximumStack myStack = new MaximumStack();
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_MaximumStack() {
      MaximumStack myStack = new MaximumStack();
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
   void test_MaximumStack2() {
      MaximumStack myStack = new MaximumStack();
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


//   @Test
//   void testMaximumStackOptimised_push_expectSameElement_whenStackIsEmpty() {
//      MaximumStackOptimised myStack = new MaximumStackOptimised(20);
//      myStack.push(5);
//      Assertions.assertFalse(myStack.isEmpty());
//      Assertions.assertEquals(5, myStack.peek());
//      Assertions.assertEquals(5, myStack.peekMax());
//   }
//
//   @Test
//   void testMaximumStackOptimised_push_expect2_whenStackHas3Elements() {
//      MaximumStackOptimised myStack = new MaximumStackOptimised(20);
//      myStack.push(5);
//      myStack.push(2);
//      myStack.push(7);
//      Assertions.assertFalse(myStack.isEmpty());
//      Assertions.assertEquals(7, myStack.peek());
//      Assertions.assertEquals(2, myStack.peekMax());
//   }
//
//   @Test
//   void testMaximumStackOptimised_pop_expectException_whenStackIsEmpty() {
//      MaximumStackOptimised myStack = new MaximumStackOptimised(20);
//      Assertions.assertTrue(myStack.isEmpty());
//      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
//   }
//
//   @Test
//   void testMaximumStackOptimised_pop_expectTopElement_whenStackHasOnlyOneElement() {
//      MaximumStackOptimised myStack = new MaximumStackOptimised(20);
//      myStack.push(5);
//      Assertions.assertFalse(myStack.isEmpty());
//      Assertions.assertEquals(5, myStack.pop());
//      Assertions.assertTrue(myStack.isEmpty());
//   }
//
//   @Test
//   void testMaximumStackOptimised_MaximumStack() {
//      MaximumStackOptimised myStack = new MaximumStackOptimised(20);
//      myStack.push(5);
//      myStack.push(8);
//      Assertions.assertEquals(8, myStack.peek());
//      Assertions.assertEquals(5, myStack.peekMax());
//      Assertions.assertEquals(8, myStack.pop());
//      Assertions.assertFalse(myStack.isEmpty());
//      myStack.push(7);
//      myStack.push(2);
//      myStack.push(12);
//      Assertions.assertEquals(12, myStack.peek());
//      Assertions.assertEquals(2, myStack.peekMax());
//      myStack.pop();
//      myStack.pop();
//      Assertions.assertEquals(7, myStack.peek());
//      Assertions.assertEquals(5, myStack.peekMax());
//      myStack.pop();
//      myStack.pop();
//      Assertions.assertTrue(myStack.isEmpty());
//   }

}
