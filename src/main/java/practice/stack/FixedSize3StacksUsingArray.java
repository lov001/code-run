package practice.stack;

import java.util.EmptyStackException;

public class FixedSize3StacksUsingArray {


   private final int stackCapacity;
   private final int[] values;
   private final int[] sizes;

   public FixedSize3StacksUsingArray(int stackSize) {
      stackCapacity = stackSize;
      int numberOfStacks = 3;
      values = new int[stackCapacity * numberOfStacks];
      sizes = new int[numberOfStacks];
   }

   public void push(int stackNumber, int value) {
      if (isFull(stackNumber)) {
         throw new ArrayIndexOutOfBoundsException("Stack Is full");
      }
      sizes[stackNumber]++;
      values[getStackTopIndex(stackNumber)] = value;
   }

   public int pop(int stackNumber) throws EmptyStackException {
      if (isEmpty(stackNumber)) {
         throw new EmptyStackException();
      }
      int topIndex = getStackTopIndex(stackNumber);
      int data = values[topIndex];
      values[topIndex] = 0;
      sizes[stackNumber]--;
      return data;
   }

   public int peek(int stackNumber) {
      if (isEmpty(stackNumber)) {
         throw new EmptyStackException();
      }
      return values[getStackTopIndex(stackNumber)];
   }

   public boolean isFull(int stackNumber) {
      return sizes[stackNumber] == stackCapacity;
   }

   public boolean isEmpty(int stackNumber) {
      return sizes[stackNumber] == 0;
   }

   private int getStackTopIndex(int stackNumber) {
      int offset = stackNumber * stackCapacity;
      int index = sizes[stackNumber];
      return offset + index - 1;
   }

}
