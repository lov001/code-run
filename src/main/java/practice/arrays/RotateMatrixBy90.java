package practice.arrays;

import practice.utils.SwapNumbersInArray;

public class RotateMatrixBy90 {

   public void rotateMatrix(int[][] mat) {
      int n = mat.length;
      for (int i = 0; i < n - 1; i++) {
         for (int j = i + 1; j < n; j++) {
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
         }
      }
      for (int[] ints : mat) {
         sort(ints);
      }
   }

   public void rotateMatrixBruteForce(int[][] mat) {
      int n = mat.length;
      int m = mat[0].length;
      int[][] ans = new int[n][m];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            ans[j][n - 1 - i] = mat[i][j];
         }
      }
      for (int i = 0; i < n; i++) {
         System.arraycopy(ans[i], 0, mat[i], 0, m);
      }
   }

   private void sort(int[] row) {
      int start = 0;
      int end = row.length - 1;
      while (start < end) {
         int temp = row[start];
         row[start] = row[end];
         row[end] = temp;
         start++;
         end--;
      }
   }
}
