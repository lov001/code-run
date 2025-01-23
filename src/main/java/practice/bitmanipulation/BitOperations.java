package practice.bitmanipulation;

public class BitOperations {

   public void swap(int x, int y) {
      x = x^y;
      y = x^y;
      x = x^y;
   }
}
