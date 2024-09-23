package practice.dynamicprogrammingandrecursion;

public class UniquePaths {

   public int uniquePaths(int m, int n) {
      if (m == 1 && n == 1) {
         return 1;
      }
      return helper(m - 1, n - 1);
   }

   private int helper(int row, int column) {
      if (row == 0 && column == 0) {
         return 1;
      }
      if (row < 0 || column < 0) {
         return 0;
      }
      int up = helper(row - 1, column);
      int left = helper(row, column - 1);
      return up + left;
   }
}
