package practice.queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList<T> {


   private static class QueueNode<T> {


      private final T data;
      private QueueNode<T> next;

      public QueueNode(T data) {
         this.data = data;
      }
   }

   private QueueNode<T> first;
   private QueueNode<T> last;

   public void add(T item) {
      QueueNode<T> obj = new QueueNode<>(item);
      if (last != null) {
         last.next = obj;
      }
      last = obj;
      if (first == null) {
         first = last;
      }
   }

   public T remove() {
      if (first == null) {
         throw new NoSuchElementException();
      }
      T obj = first.data;
      first = first.next;
      if(first == null){
         last = null;
      }
      return obj;
   }

   public T peek() {
      if (first == null) {
         throw new NoSuchElementException();
      }
      return first.data;
   }

   public boolean isEmpty() {
      return first == null;
   }

}
