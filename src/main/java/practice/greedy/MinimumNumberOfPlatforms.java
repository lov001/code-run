package practice.greedy;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {

   public int calculateMinPlatforms(int[] at, int[] dt, int n) {
      int maxCount = 0;
      int count = 0;
      Arrays.sort(at);
      Arrays.sort(dt);
      int i = 0;
      int j = 0;
      for (int k = 0; k < (n + n); k++) {
         if (i < n && j < n) {
            if (at[i] <= dt[j]) {
               count++;
               i++;
            } else {
               count--;
               j++;
            }
         } else {
            break;
         }
         maxCount = Math.max(maxCount, count);
      }
      return maxCount;
   }
}
