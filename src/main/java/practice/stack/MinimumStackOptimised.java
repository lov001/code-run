package practice.stack;

import java.util.EmptyStackException;

public class MinimumStackOptimised {


   private class DataNode {


      int data;
      int minIndex;

      DataNode() {
         this.data = 0;
         this.minIndex = -1;
      }
   }

   private final DataNode[] array;
   private int TOP = -1;

   public MinimumStackOptimised(int size) {
      array = new DataNode[size];
      for (int i = 0; i < size; i++) {
         array[i] = new DataNode();
      }
   }


   public void push(int item) {
      if (TOP == array.length) {
         throw new ArrayIndexOutOfBoundsException("Stack is full");
      }
      array[++TOP].data = item;
      if (TOP == 0 || item <= array[array[TOP - 1].minIndex].data) {
         array[TOP].minIndex = TOP;
      } else {
         array[TOP].minIndex = array[TOP - 1].minIndex;
      }
   }

   public int pop() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      int obj = array[TOP].data;
      array[TOP].data = -1;
      array[TOP].minIndex = -1;
      TOP--;
      return obj;
   }

   public int peek() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      return array[TOP].data;
   }

   public boolean isEmpty() {
      return TOP == -1;
   }

   public int min() {
      return array[array[TOP].minIndex].data;
   }
}
