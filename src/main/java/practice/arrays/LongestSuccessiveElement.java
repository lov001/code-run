package practice.arrays;

public class LongestSuccessiveElement {

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
