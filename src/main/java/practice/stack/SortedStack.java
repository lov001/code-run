package practice.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SortedStack {


   Stack<Integer> stack;

   public SortedStack() {
      stack = new Stack<>();
   }

   public void push(int item) {
      stack.push(item);
      sort();
   }

   public int pop() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      return stack.pop();
   }

   public int peek() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      return stack.peek();
   }

   public boolean isEmpty() {
      return stack.isEmpty();
   }

   public void sort() {
      Stack<Integer> r = new Stack<>();
      while (!stack.isEmpty()) {
         int tmp = stack.pop();
         while (!r.isEmpty() && r.peek() > tmp) {
            stack.push(r.pop());
         }
         r.push(tmp);
      }

      while (!r.isEmpty()) {
         stack.push(r.pop());
      }
   }

}
