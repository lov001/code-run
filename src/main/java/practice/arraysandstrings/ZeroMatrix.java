package practice.arraysandstrings;

public class ZeroMatrix {


   public void zeroMatrix(int[][] matrix, int m, int n) {
      boolean[] rows = new boolean[m];
      boolean[] columns = new boolean[n];

      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
               rows[i] = true;
               columns[j] = true;
            }
         }
      }

      for(int i=0; i<m; i++){
         if(rows[i]){
            nullifyRow(matrix, i);
         }
      }
      for(int j=0; j<n; j++){
         if(columns[j]){
            nullifyColumn(matrix, j);
         }
      }
   }

   private void nullifyColumn(int[][] matrix, int column) {
      for(int i=0; i<matrix.length; i++){
         matrix[i][column] = 0;
      }
   }

   private void nullifyRow(int[][] matrix, int row) {
      for(int j=0; j<matrix[0].length; j++){
         matrix[row][j] = 0;
      }
   }

}
