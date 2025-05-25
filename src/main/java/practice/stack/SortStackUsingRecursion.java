package practice.stack;

import java.util.Stack;

public class SortStackUsingRecursion {

   public void sortStack(Stack<Integer> stack) {
      if (!stack.isEmpty()) {
         int top = stack.pop();
         sortStack(stack);
         insertInSortedOrder(top, stack);
      }
   }

   private void insertInSortedOrder(int element, Stack<Integer> stack) {
      if (stack.isEmpty() || element > stack.peek()) {
         stack.push(element);
         return;
      }
      int top = stack.pop();
      insertInSortedOrder(element, stack);
      stack.push(top);
   }
}
