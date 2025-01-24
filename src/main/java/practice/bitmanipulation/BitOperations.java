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
}
