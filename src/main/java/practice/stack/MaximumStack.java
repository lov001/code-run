package practice.stack;

import java.util.Stack;

public class MaximumStack {

   private int max;
   private final Stack<Integer> stack;

   public MaximumStack() {
      max = Integer.MIN_VALUE;
      this.stack = new Stack<>();
   }

   public boolean isEmpty(){
      return stack.isEmpty();
   }

   public void push(int element) {
      max = Math.max(max, element);
      this.stack.push(element);
   }

   public int pop() {
      if (stack.isEmpty()) {
         return -1;
      }
      int top = stack.pop();
      max = Math.max(max, top);
      return top;
   }

   public int peek() {
      if (stack.isEmpty()) {
         return -1;
      }
      return stack.peek();
   }

   public int peekMax() {
      if (stack.isEmpty()) {
         return -1;
      }
      return max;
   }

   public int popMax() {
      if (stack.isEmpty()) {
         return -1;
      }
      int topMax = findMax();
      stack.removeElement(topMax);
      max = findMax();
      return topMax;
   }

   private int findMax() {
      if(stack.isEmpty()){
         return Integer.MIN_VALUE;
      }
      Stack<Integer> copyStack = new Stack<>();
      int tempMax = Integer.MIN_VALUE;
      while (!stack.isEmpty()) {
         int topElement = stack.pop();
         tempMax = Math.max(tempMax, topElement);
         copyStack.push(topElement);
      }
      while (!copyStack.isEmpty()) {
         int topElement = copyStack.pop();
         stack.push(topElement);
      }
      return tempMax;
   }
}
