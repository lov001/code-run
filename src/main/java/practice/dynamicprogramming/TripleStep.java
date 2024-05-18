package practice.dynamicprogramming;

import java.util.Arrays;

public class TripleStep {

   public int countWaysBruteForce(int noOfSteps) {
      if (noOfSteps < 0) {
         return 0;
      } else if (noOfSteps == 0) {
         return 1;
      } else {
         return countWaysBruteForce(noOfSteps - 1)
            + countWaysBruteForce(noOfSteps - 2)
            + countWaysBruteForce(noOfSteps - 3);
      }
   }

   public int countWaysOptimal(int noOfWays) {
      int[] memo = new int[noOfWays + 1];
      Arrays.fill(memo, -1);
      return countWays(noOfWays, memo);
   }

   private int countWays(int noOfWays, int[] memo) {
      if (noOfWays < 0) {
         return 0;
      } else if (noOfWays == 0) {
         return 1;
      } else if (memo[noOfWays] > -1) {
         return memo[noOfWays];
      } else {
         memo[noOfWays] = countWays(noOfWays - 1, memo) + countWays(noOfWays - 2, memo)
            + countWays(noOfWays - 3, memo);
         return memo[noOfWays];
      }
   }
}
