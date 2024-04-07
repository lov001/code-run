package practice.stack;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumStackTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      MinimumStack myStack = new MinimumStack(20);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
      Assertions.assertEquals(5, myStack.min());
   }

   @Test
   void test_push_expect2_whenStackHas3Elements() {
      MinimumStack myStack = new MinimumStack(20);
      myStack.push(5);
      myStack.push(2);
      myStack.push(7);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(2, myStack.min());
   }

   @Test
   void test_pop_expectException_whenStackIsEmpty() {
      MinimumStack myStack = new MinimumStack(20);
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      MinimumStack myStack = new MinimumStack(20);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void test_MinimumStack() {
      MinimumStack myStack = new MinimumStack(20);
      myStack.push(5);
      myStack.push(8);
      Assertions.assertEquals(8, myStack.peek());
      Assertions.assertEquals(5, myStack.min());
      Assertions.assertEquals(8, myStack.pop());
      Assertions.assertFalse(myStack.isEmpty());
      myStack.push(7);
      myStack.push(2);
      myStack.push(12);
      Assertions.assertEquals(12, myStack.peek());
      Assertions.assertEquals(2, myStack.min());
      myStack.pop();
      myStack.pop();
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(5, myStack.min());
      myStack.pop();
      myStack.pop();
      Assertions.assertTrue(myStack.isEmpty());
   }


   @Test
   void testMinimumStackOptimised_push_expectSameElement_whenStackIsEmpty() {
      MinimumStackOptimised myStack = new MinimumStackOptimised(20);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.peek());
      Assertions.assertEquals(5, myStack.min());
   }

   @Test
   void testMinimumStackOptimised_push_expect2_whenStackHas3Elements() {
      MinimumStackOptimised myStack = new MinimumStackOptimised(20);
      myStack.push(5);
      myStack.push(2);
      myStack.push(7);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(2, myStack.min());
   }

   @Test
   void testMinimumStackOptimised_pop_expectException_whenStackIsEmpty() {
      MinimumStackOptimised myStack = new MinimumStackOptimised(20);
      Assertions.assertTrue(myStack.isEmpty());
      Assertions.assertThrows(EmptyStackException.class, myStack::pop);
   }

   @Test
   void testMinimumStackOptimised_pop_expectTopElement_whenStackHasOnlyOneElement() {
      MinimumStackOptimised myStack = new MinimumStackOptimised(20);
      myStack.push(5);
      Assertions.assertFalse(myStack.isEmpty());
      Assertions.assertEquals(5, myStack.pop());
      Assertions.assertTrue(myStack.isEmpty());
   }

   @Test
   void testMinimumStackOptimised_MinimumStack() {
      MinimumStackOptimised myStack = new MinimumStackOptimised(20);
      myStack.push(5);
      myStack.push(8);
      Assertions.assertEquals(8, myStack.peek());
      Assertions.assertEquals(5, myStack.min());
      Assertions.assertEquals(8, myStack.pop());
      Assertions.assertFalse(myStack.isEmpty());
      myStack.push(7);
      myStack.push(2);
      myStack.push(12);
      Assertions.assertEquals(12, myStack.peek());
      Assertions.assertEquals(2, myStack.min());
      myStack.pop();
      myStack.pop();
      Assertions.assertEquals(7, myStack.peek());
      Assertions.assertEquals(5, myStack.min());
      myStack.pop();
      myStack.pop();
      Assertions.assertTrue(myStack.isEmpty());
   }

}
