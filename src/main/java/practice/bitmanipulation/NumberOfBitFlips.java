package practice.bitmanipulation;

public class NumberOfBitFlips {

   public int numberOfFlips(int a, int b) {
      int result = a ^ b;
      return countNumberOfSetBits(result);
   }

   private int countNumberOfSetBits(int number) {
      int count = 0;
      while (number != 0) {
         number = number & (number - 1);
         count++;
      }
      return count;
   }
}
