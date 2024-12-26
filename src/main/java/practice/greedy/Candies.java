package practice.greedy;

public class Candies {

   public int requiredCandiesOptimised(int[] students) {
      int n = students.length;
      int i = 1;
      int sum = 1;
      while (i < n) {
         if (students[i] == students[i - 1]) {
            sum += 1;
            i++;
            continue;
         }
         int peak = 1;
         while (i < n && students[i] > students[i - 1]) {
            peak++;
            sum += peak;
            i++;
         }
         int down = 1;
         while (i < n && students[i] < students[i - 1]) {
            sum += down;
            down++;
            i++;
         }
         if (down > peak) {
            sum += (down - peak);
         }
      }
      return sum;
   }

   public int requiredCandiesBFOptimised(int[] students) {
      int n = students.length;
      int[] left = new int[n];
      left[0] = 1;
      for (int i = 1; i < n; i++) {
         if (students[i] > students[i - 1]) {
            left[i] = left[i - 1] + 1;
         } else {
            left[i] = 1;
         }
      }
      int current;
      int right = 1;
      int maxCandies = Math.max(1, left[n - 1]);
      for (int i = n - 2; i >= 0; i--) {
         if (students[i] > students[i + 1]) {
            current = right + 1;
            right = current;
         } else {
            current = 1;
         }
         maxCandies += Math.max(left[i], current);
      }
      return maxCandies;
   }

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
         } else {
            left[i] = 1;
         }

         if (students[j] > students[j + 1]) {
            right[j] = right[j + 1] + 1;
         } else {
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
