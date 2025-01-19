package practice.arrays;

public class MissingAndRepeatingNumbers {

   public int[] findMissingRepeatingNumbersHashing(int[] a) {
      int[] result = new int[2];
      int n = a.length;
      int[] countMap = new int[n + 1];
      for (int element : a) {
         countMap[element]++;
      }
      int missing = -1;
      int repeated = -1;
      for (int i = 1; i <= n; i++) {
         if (countMap[i] == 2) {
            missing = i;
         } else if (countMap[i] == 0) {
            repeated = i;
         }
         if (missing != -1 && repeated != -1) {
            break;
         }
      }
      result[0] = missing;
      result[1] = repeated;
      return result;
   }

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
