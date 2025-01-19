package practice.arrays;

public class MissingAndRepeatingNumbers {

   public int[] findMissingRepeatingNumbersBruteForce(int[] a) {
      int[] result = new int[2];
      int n = a.length;
      for (int i = 1; i <= n; i++) {
         int count = 0;
         for (int index : a) {
            if (index == i) {
               count++;
            }
         }
         if (count == 2) {
            result[0] = i;
         } else if (count == 0) {
            result[1] = i;
         }
      }
      return result;
   }
}
