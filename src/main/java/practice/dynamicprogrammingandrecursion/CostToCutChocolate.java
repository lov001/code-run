package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CostToCutChocolate {

   public int cost(int n, int c, int[] cuts) {
      int[] updatedCuts = new int[cuts.length + 2];
      updatedCuts[0] = 0;
      updatedCuts[updatedCuts.length - 1] = n;
      System.arraycopy(cuts, 0, updatedCuts, 1, cuts.length);
      Arrays.sort(updatedCuts);
      return helper(1, c, updatedCuts);
   }

   private int helper(int i, int j, int[] cuts) {
      if (i > j) {
         return 0;
      }
      int min = Integer.MAX_VALUE;
      for (int index = i; index <= j; index++) {
         int cost =
            cuts[j + 1] - cuts[i - 1] + helper(i, index - 1, cuts) + helper(index + 1, j, cuts);
         min = Math.min(min, cost);
      }
      return min;
   }
}
