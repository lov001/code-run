package practice.queue;

import java.util.Stack;

public class QueueUsingTwoStacksOptimised<T> {


   private final Stack<T> newest;
   private final Stack<T> oldest;

   public QueueUsingTwoStacksOptimised() {
      newest = new Stack<>();
      oldest = new Stack<>();
   }

   public void add(T item) {
      newest.push(item);
   }

   public void shiftStacks() {
      if (oldest.isEmpty()) {
         while (!newest.isEmpty()) {
            oldest.push(newest.pop());
         }
      }
   }

   public T remove() {
      shiftStacks();
      return oldest.pop();
   }

   public T peek() {
      shiftStacks();
      return oldest.peek();
   }

   public boolean isEmpty() {
      return newest.isEmpty() && oldest.isEmpty();
   }

}
