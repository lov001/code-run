package practice.dynamicprogrammingandrecursion;


public class BooleanEvaluation {

   private static final int MOD7 = 1000000007;

   public long evaluateExp(String exp) {
      int n = exp.length();
      Long[][][] dp = new Long[n][n][2];
      return (int) helper(0, n - 1, 1, exp, dp);
   }

   private long helper(int i, int j, int isTrue, String exp, Long[][][] dp) {
      if (i > j) {
         return 0;
      }
      if (i == j) {
         if (isTrue == 1) {
            return exp.charAt(i) == 'T' ? 1 : 0;
         } else {
            return exp.charAt(i) == 'F' ? 1 : 0;
         }
      }
      if (dp[i][j][isTrue] != null) {
         return dp[i][j][isTrue];
      }
      long count = 0;
      for (int index = i + 1; index <= j - 1; index += 2) {
         long leftTrue = helper(i, index - 1, 1, exp, dp);
         long leftFalse = helper(i, index - 1, 0, exp, dp);
         long rightTrue = helper(index + 1, j, 1, exp, dp);
         long rightFalse = helper(index + 1, j, 0, exp, dp);
         if (exp.charAt(index) == '&') {
            if (isTrue == 1) {
               count = (count + (leftTrue * rightTrue) % MOD7) % MOD7;
            } else {
               count = (count + (leftFalse * rightTrue) % MOD7 + (leftFalse * rightFalse) % MOD7
                  + (leftTrue * rightFalse) % MOD7) % MOD7;
            }
         } else if (exp.charAt(index) == '|') {
            if (isTrue == 1) {
               count = (count + (leftTrue * rightTrue) % MOD7 + (leftTrue * rightFalse) % MOD7
                  + (leftFalse * rightTrue) % MOD7) % MOD7;
            } else {
               count = (count + (leftFalse * rightFalse) % MOD7) % MOD7;
            }
         } else {
            if (isTrue == 1) {
               count =
                  (count + (leftTrue * rightFalse) % MOD7 + (leftFalse * rightTrue) % MOD7) % MOD7;
            } else {
               count =
                  (count + (leftTrue * rightTrue) % MOD7 + (leftFalse * rightFalse) % MOD7) % MOD7;
            }
         }
      }
      dp[i][j][isTrue] = count;
      return count;
   }
}
