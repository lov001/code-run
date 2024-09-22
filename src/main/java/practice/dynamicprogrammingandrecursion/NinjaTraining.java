package practice.dynamicprogrammingandrecursion;

public class NinjaTraining {

   public int ninjaTrainingTabulation(int n, int[][] points) {
      int[][] dp = new int[n][4];
      dp[0][0] = Math.max(points[0][1], points[0][2]);
      dp[0][1] = Math.max(points[0][0], points[0][2]);
      dp[0][2] = Math.max(points[0][0], points[0][1]);
      dp[0][3] = Math.max(Math.max(points[0][0], points[0][1]), points[0][2]);
      for (int day = 1; day < n; day++) {
         for (int last = 0; last < 4; last++) {
            dp[day][last] = 0;
            for (int task = 0; task < 3; task++) {
               if (task != last) {
                  int point = points[day][task] + dp[day - 1][task];
                  dp[day][last] = Math.max(dp[day][last], point);
               }
            }
         }
      }

      return dp[n - 1][3];
   }

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
