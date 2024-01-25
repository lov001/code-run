package practice.arraysandstrings;

public class RotateMatrix90Degree {


   public int[][] rotate(int[][] matrix, int m, int n) {
      int[][] result = new int[m][n];
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            result[j][n - i - 1] = matrix[i][j];
         }
      }
      return result;
   }

}
