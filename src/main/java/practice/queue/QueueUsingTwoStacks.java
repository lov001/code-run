package practice.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingTwoStacks<T> {


   private final Stack<T> first;
   private final Stack<T> second;

   public QueueUsingTwoStacks() {
      first = new Stack<>();
      second = new Stack<>();
   }

   public void add(T item) {
      if (first.isEmpty() && !second.isEmpty()) {
         while (!second.isEmpty()) {
            first.push(second.pop());
         }
      }
      first.push(item);
   }

   public T remove() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      while (!first.isEmpty()) {
         second.push(first.pop());
      }
      return second.pop();
   }

   public T peek() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      while (!first.isEmpty()) {
         second.push(first.pop());
      }
      return second.peek();
   }

   public boolean isEmpty() {
      return first.isEmpty() && second.isEmpty();
   }

}
