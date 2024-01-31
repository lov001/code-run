package practice.arraysandstrings;

public class RotateMatrix90Degree {


   public int[][] rotateWithExtraSpace(int[][] matrix, int m, int n) {
      int[][] result = new int[m][n];
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            result[j][n - i - 1] = matrix[i][j];
         }
      }
      return result;
   }

   public void rotateInPlace(int matrix[][], int n) {
      for (int i = 0; i < n / 2; i++) {
         for (int j = i; j < n - i - 1; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][n - 1 - i];
            matrix[j][n - 1 - i] = matrix[n - 1 - i][n - 1 - j];
            matrix[n - 1 - i][n - 1 - j] = matrix[n - 1 - j][i];
            matrix[n - 1 - j][i] = temp;

            // clockwise rotation
//            int temp = a[i][j];
//            a[i][j] = a[N - 1 - j][i];
//            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
//            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
//            a[j][N - 1 - i] = temp;
         }
      }
   }

   public void rotateInPlaceUsingTranspose(int matrix[][], int n) {
      for (int i = 0; i < n; i++) {
         reverseRow(matrix, n, i);
      }
      for (int i = 0; i < n; i++) {
         for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }
   }

   public void reverseRow(int matrix[][], int n, int i) {
      int start = 0, end = n - 1;
      while (start < end) {
         int temp = matrix[i][start];
         matrix[i][start] = matrix[i][end];
         matrix[i][end] = temp;

         start++;
         end--;
      }
   }
}
