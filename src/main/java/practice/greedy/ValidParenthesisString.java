package practice.greedy;

public class ValidParenthesisString {

   public boolean checkValidStringUsingRecursion(String s) {
      boolean[][] dp = new boolean[s.length()][s.length()];
      return solve(0, 0, s, dp);
   }

   private boolean solve(int index, int count, String s, boolean[][] dp) {
      if (count < 0) {
         return false;
      }
      if (index == s.length()) {
         return count == 0;
      }
      if (dp[index][count]) {
         return dp[index][count];
      }
      char ch = s.charAt(index);
      if (ch == '(') {
         return dp[index][count] = solve(index + 1, count + 1, s, dp);
      }
      if (ch == ')') {
         return dp[index][count] = solve(index + 1, count - 1, s, dp);
      }
      return dp[index][count] = solve(index + 1, count + 1, s, dp)
         || solve(index + 1, count - 1, s, dp) || solve(index + 1, count, s, dp);
   }
}
