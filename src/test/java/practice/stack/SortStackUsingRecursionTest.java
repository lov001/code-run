package practice.stack;

import java.util.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortStackUsingRecursionTest {

   SortStackUsingRecursion classObj = new SortStackUsingRecursion();

   @Test
   void test_sortStack_expectSortedStack_whenInputIsNotSorted() {
      Stack<Integer> stack = new Stack<>();
      stack.push(3);
      stack.push(1);
      stack.push(4);
      stack.push(2);
      stack.push(5);

      classObj.sortStack(stack);
      Assertions.assertEquals(5, stack.pop());
      Assertions.assertEquals(4, stack.pop());
      Assertions.assertEquals(3, stack.pop());
      Assertions.assertEquals(2, stack.pop());
      Assertions.assertEquals(1, stack.pop());
   }
}
