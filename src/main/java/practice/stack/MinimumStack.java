package practice.stack;

import java.util.EmptyStackException;

public class MinimumStack {


   private final int[] data;
   private int TOP = -1;
   private int MIN_INDEX = -1;

   public MinimumStack(int size) {
      data = new int[size];
   }


   public void push(int item) {
      if (TOP == data.length) {
         throw new ArrayIndexOutOfBoundsException("Stack is full");
      }
      data[++TOP] = item;
      if (TOP == 0 || item <= data[MIN_INDEX]) {
         MIN_INDEX = TOP;
      }
   }

   public int pop() {
      if (TOP == -1) {
         throw new EmptyStackException();
      }
      int obj = data[TOP];
      if (TOP == MIN_INDEX && TOP != 0) {
         updateMinIndex();
      }
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

   public int min() {
      return data[MIN_INDEX];
   }

   private void updateMinIndex() {
      int temp = TOP - 1;
      int minValue = data[temp];
      while (temp > -1) {
         if (data[temp] != -1 && data[temp] < minValue) {
            minValue = data[temp];
            MIN_INDEX = temp;
         }
         temp--;
      }
   }
}
