package practice.stack;

import java.util.EmptyStackException;

public class StacksUsingSingleArray<T> {


   private T[] data;
   private static int TOP = -1;


   public void push(T item) {
      data[++TOP] = item;
   }

   public T pop() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      T obj = data[TOP];
      data[TOP--] = null;
      return obj;
   }

   public T peek() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      return data[TOP];
   }

   public boolean isEmpty() {
      return TOP == -1;
   }
}
