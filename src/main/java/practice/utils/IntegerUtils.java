package practice.utils;

public class IntegerUtils {

   public static int findMax(int[] array) {
      int max = Integer.MIN_VALUE;
      for (int j : array) {
         max = Math.max(max, j);
      }
      return max;
   }

   public static int findMin(int[] array) {
      int min = Integer.MAX_VALUE;
      for (int j : array) {
         min = Math.min(min, j);
      }
      return min;
   }

   public static int findSum(int[] array) {
      int sum = 0;
      for (int j : array) {
         sum += j;
      }
      return sum;
   }
}
