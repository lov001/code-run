package practice.arrays;

import java.util.Arrays;

public class LongestSuccessiveElement {


   public int longestSuccessiveElementsUsingSorting(int[] a) {
      int longest = 1;
      int smallest = Integer.MIN_VALUE;
      int count = 0;
      Arrays.sort(a);
      for (int element : a) {
         if ((element - 1) == smallest) {
            count++;
            smallest = element;
         } else if (element != smallest) {
            count = 1;
            smallest = element;
         }
         longest = Math.max(longest, count);
      }
      return longest;
   }

   public int longestSuccessiveElementsBruteForce(int[] a) {
      int longest = 1;
      for (int j : a) {
         int count = 1;
         int element = j + 1;
         while (findElement(a, element)) {
            count++;
            element = element + 1;
         }
         longest = Math.max(longest, count);
      }
      return longest;
   }

   private boolean findElement(int[] a, int element) {
      for (int j : a) {
         if (j == element) {
            return true;
         }
      }
      return false;
   }
}
