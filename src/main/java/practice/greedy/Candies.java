package practice.greedy;

public class Candies {

   public int requiredCandies(int[] students) {
      int n = students.length;
      int[] left = new int[n];
      int[] right = new int[n];
      int i = 1;
      int j = n - 2;
      left[0] = 1;
      right[n - 1] = 1;
      while (i < n) {
         if (students[i] > students[i - 1]) {
            left[i] = left[i - 1] + 1;
         } else if (students[i] <= students[i - 1]) {
            left[i] = 1;
         }

         if (students[j] > students[j + 1]) {
            right[j] = right[j + 1] + 1;
         } else if (students[j] <= students[j + 1]) {
            right[j] = 1;
         }
         i++;
         j--;
      }
      int maxCandies = 0;
      for (int k = 0; k < n; k++) {
         maxCandies += Math.max(left[k], right[k]);
      }
      return maxCandies;
   }
}
