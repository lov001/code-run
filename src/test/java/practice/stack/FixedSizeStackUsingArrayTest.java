package practice.stack;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FixedSizeStackUsingArrayTest {


   @Test
   void test_push_expectSameElement_whenStackIsEmpty() {
      FixedSize3StacksUsingArray myStack = new FixedSize3StacksUsingArray(5);
      myStack.push(0, 5);
      Assertions.assertFalse(myStack.isEmpty(0));
      Assertions.assertEquals(5, myStack.peek(0));
   }

   @Test
   void test_push_expectTopElement_whenStackIsNotEmpty() {
      FixedSize3StacksUsingArray myStack = new FixedSize3StacksUsingArray(5);
      myStack.push(0, 5);
      myStack.push(0, 2);
      myStack.push(0, 7);
      Assertions.assertFalse(myStack.isEmpty(0));
      Assertions.assertEquals(7, myStack.peek(0));
   }

   @Test
   void test_pop_expectException_whenStackIsEmpty() {
      FixedSize3StacksUsingArray myStack = new FixedSize3StacksUsingArray(5);
      Assertions.assertTrue(myStack.isEmpty(0));
      Assertions.assertThrows(EmptyStackException.class, () -> myStack.pop(0));
   }

   @Test
   void test_pop_expectTopElement_whenStackHasOnlyOneElement() {
      FixedSize3StacksUsingArray myStack = new FixedSize3StacksUsingArray(5);
      myStack.push(0, 5);
      Assertions.assertFalse(myStack.isEmpty(0));
      Assertions.assertEquals(5, myStack.pop(0));
      Assertions.assertTrue(myStack.isEmpty(0));
   }

   @Test
   void test_FixedSize3StacksUsingArray() {
      FixedSize3StacksUsingArray myStack = new FixedSize3StacksUsingArray(5);
      myStack.push(0, 1);
      myStack.push(0, 2);
      Assertions.assertEquals(2, myStack.peek(0));
      Assertions.assertEquals(2, myStack.pop(0));
      Assertions.assertFalse(myStack.isEmpty(0));
      myStack.push(0, 3);
      myStack.push(0, 4);
      myStack.push(0, 5);
      Assertions.assertEquals(5, myStack.peek(0));
      myStack.pop(0);
      myStack.pop(0);
      Assertions.assertEquals(3, myStack.peek(0));
      myStack.pop(0);
      myStack.pop(0);
      Assertions.assertTrue(myStack.isEmpty(0));
   }

   @Test
   void test_FixedSize3StacksUsingArray_whenAll3StacksUsed() {
      FixedSize3StacksUsingArray myStack = new FixedSize3StacksUsingArray(5);
      myStack.push(0, 1);
      myStack.push(1, 2);
      myStack.push(1, 3);
      myStack.push(2, 4);
      myStack.push(2, 5);
      myStack.push(2, 6);
      Assertions.assertEquals(1, myStack.peek(0));
      Assertions.assertEquals(3, myStack.peek(1));
      Assertions.assertEquals(6, myStack.peek(2));
      Assertions.assertEquals(1, myStack.pop(0));
      Assertions.assertTrue(myStack.isEmpty(0));
      myStack.push(0, 7);
      myStack.push(2, 8);
      myStack.push(2, 9);
      Assertions.assertEquals(7, myStack.peek(0));
      Assertions.assertEquals(9, myStack.peek(2));
      Assertions.assertTrue(myStack.isFull(2));
      myStack.pop(2);
      myStack.pop(2);
      Assertions.assertEquals(6, myStack.peek(2));
      myStack.pop(1);
      myStack.pop(1);
      Assertions.assertTrue(myStack.isEmpty(1));
   }

}
