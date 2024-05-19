package practice.dynamicprogramming;

public class MagicIndex {

   public int magicIndexBF(int[] array) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == i) {
            return i;
         }
      }
      return -1;
   }
}
