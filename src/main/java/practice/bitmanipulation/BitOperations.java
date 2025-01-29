package practice.bitmanipulation;

public class BitOperations {

   public void swap(int x, int y) {
      x = x ^ y;
      y = x ^ y;
      x = x ^ y;
   }

   public boolean checkIthBit(int number, int i) {
      int shiftedNumber = 1 << i;
      return (number & shiftedNumber) != 0;
   }

   public int setIthBit(int number, int i) {
      int shiftedNumber = 1 << i;
      return (number | shiftedNumber);
   }

   public int clearIthBit(int number, int i) {
      int shiftedNumber = ~(1 << i);
      return (number & shiftedNumber);
   }

   public int toggleIthBit(int number, int i) {
      int shiftedNumber = (1 << i);
      return (number ^ shiftedNumber);
   }

   public int removeLastSetBit(int number) {
      return (number & number - 1);
   }

   public boolean checkPowerOf2(int number) {
      return (number & number - 1) == 0;
   }

   public int countNumberOfSetBits(int number) {
      int count = 0;
      while (number > 1) {
         count += number & 1;
         number = number >> 1;
      }
      if (number == 1) {
         count++;
      }
      /* alternate solution
       *    while(number != 0){
       *      number = number & (number - 1);
       *      count++;
       *     }
       */
      return count;
   }
}
