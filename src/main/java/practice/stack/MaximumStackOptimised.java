package practice.stack;

import java.util.Stack;

public class MaximumStackOptimised {

   private final Stack<Integer> stack;
   private final Stack<Integer> maxStack;

   public MaximumStackOptimised() {
      this.stack = new Stack<>();
      this.maxStack = new Stack<>();
   }

   public boolean isEmpty() {
      return stack.isEmpty();
   }

   public void push(int element) {
      stack.push(element);
      if (maxStack.isEmpty() || element > maxStack.peek()) {
         maxStack.push(element);
         return;
      }
      maxStack.push(maxStack.peek());
   }

   public int pop() {
      maxStack.pop();
      return stack.pop();
   }

   public int peek() {
      return stack.peek();
   }

   public int peekMax() {
      return maxStack.peek();
   }

   public int popMax() {
      int max = maxStack.pop();
      Stack<Integer> tempStack = new Stack<>();
      while (stack.peek() != max) {
         tempStack.push(stack.pop());
      }
      stack.pop();
      while (!tempStack.isEmpty()) {
         stack.push(tempStack.pop());
      }
      return max;
   }
}
