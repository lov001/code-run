package practice.bitmanipulation;

public class SingleNumber {

   public int occursOnce(int[] a) {
      int xor = 0;
      for (int number : a) {
         xor = xor ^ number;
      }
      return xor;
   }
}
