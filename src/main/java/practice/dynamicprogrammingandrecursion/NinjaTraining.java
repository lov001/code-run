package practice.dynamicprogrammingandrecursion;

public class NinjaTraining {

   public int ninjaTraining(int n, int[][] points) {
      int[][] dp = new int[n][4];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < 4; j++) {
            dp[i][j] = -1;
         }
      }
      return helper(n - 1, 3, points, dp);
   }

   private int helper(int index, int last, int[][] points, int[][] dp) {
      if (index == 0) {
         int max = 0;
         for (int i = 0; i < 3; i++) {
            if (i != last) {
               max = Math.max(max, points[0][i]);
            }
         }
         dp[index][last] = max;
         return max;
      }
      if (dp[index][last] != -1) {
         return dp[index][last];
      }
      int max = 0;
      for (int i = 0; i < 3; i++) {
         if (i != last) {
            int currentMax = points[index][i] + helper(index - 1, i, points, dp);
            max = Math.max(max, currentMax);
         }
      }
      dp[index][last] = max;
      return dp[index][last];
   }
}
