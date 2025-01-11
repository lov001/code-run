package practice.arrays;

public class RotateMatrixBy90 {

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
}
