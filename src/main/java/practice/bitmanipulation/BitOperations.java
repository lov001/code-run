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
}
