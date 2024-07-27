package practice.graphs;

public class FloydWarshalAlgorithm {

   public void shortest_distance(int[][] matrix) {
      int n = matrix.length;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (matrix[i][j] == -1) {
               matrix[i][j] = (int) 1e9;
            }
            if (i == j) {
               matrix[i][j] = 0;
            }
         }
      }
      for (int via = 0; via < n; via++) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               int distance = matrix[i][via] + matrix[via][j];
               if (distance < matrix[i][j]) {
                  matrix[i][j] = distance;
               }
            }
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (matrix[i][j] == (int) 1e9) {
               matrix[i][j] = -1;
            }
         }
      }
   }
}
