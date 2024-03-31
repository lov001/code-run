package practice.stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList<T> {


   private static class StackNode<T> {


      private final T data;
      private StackNode<T> next;

      public StackNode(T data) {
         this.data = data;
      }
   }

   private StackNode<T> top;

   public void push(T item) {
      StackNode<T> obj = new StackNode<>(item);
      if (top == null) {
         top = obj;
         return;
      }
      obj.next = top;
      top = obj;
   }

   public T pop() {
      if (top == null) {
         throw new EmptyStackException();
      }
      T obj = top.data;
      top = top.next;
      return obj;
   }

   public T peek() {
      if (top == null) {
         throw new EmptyStackException();
      }
      return top.data;
   }

   public boolean isEmpty() {
      return top == null;
   }

}
