package practice.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class StackOfPlates {


   List<Stack<Integer>> stacks;
   int currentStack;
   int maxCapacity;

   public StackOfPlates(int capacity) {
      stacks = new ArrayList<>();
      maxCapacity = capacity;
      currentStack = -1;
   }

   public void push(int item) {
      if (currentStack == -1) {
         stacks.add(new Stack<>());
         currentStack++;
      }
      if (stacks.get(currentStack).size() == maxCapacity) {
         currentStack++;
         stacks.add(new Stack<>());
      }
      stacks.get(currentStack).push(item);
   }

   public int pop() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      int item = stacks.get(currentStack).pop();
      if (isEmpty()) {
         stacks.remove(currentStack);
         currentStack--;
      }
      return item;
   }

   public int peek() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      return stacks.get(currentStack).peek();
   }

   public boolean isEmpty() {
      return currentStack == -1 || stacks.get(currentStack).isEmpty();
   }

}
