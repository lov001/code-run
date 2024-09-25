package practice.dynamicprogrammingandrecursion;

public class TriangleMinimumPathSum {

   public int minimumPathSum(int[][] triangle, int n) {
//      int[][] dp = new
      return helper(0, 0, n, triangle);
   }

   private int helper(int row, int column, int n, int[][] triangle) {
      if (row == n - 1) {
         return triangle[row][column];
      }
      int down = triangle[row][column] + helper(row + 1, column, n, triangle);
      int diagonal = triangle[row][column] + helper(row + 1, column + 1, n, triangle);
      return Math.min(down, diagonal);
   }
}
