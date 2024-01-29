package practice.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroMatrix {


   public void zeroMatrix(int[][] matrix, int m, int n) {
      List<Integer> rows = new ArrayList<>(m);
      List<Integer> columns = new ArrayList<>(n);

      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
               rows.add(i);
               columns.add(j);
            }
         }
      }

      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            if (rows.contains(i) || columns.contains(j)) {
               matrix[i][j] = 0;
            }
         }
      }
   }

}
