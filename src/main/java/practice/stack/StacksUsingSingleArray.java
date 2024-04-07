package practice.stack;

import java.util.EmptyStackException;

public class StacksUsingSingleArray {


   private final int[] data;
   private int TOP = -1;

   public StacksUsingSingleArray(int size){
      data = new int[size];
   }

   public void push(int item) {
      data[++TOP] = item;
   }

   public int pop() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      int obj = data[TOP];
      data[TOP--] = -1;
      return obj;
   }

   public int peek() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      return data[TOP];
   }

   public boolean isEmpty() {
      return TOP == -1;
   }
}
