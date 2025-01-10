package practice.arrays;

import java.util.ArrayList;

public class ZeroMatrix {

   public ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,
      Integer n, Integer m) {
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) == 0) {
               fillRow(i, matrix, m);
               fillColumn(j, matrix, n);
            }
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) == -1) {
               matrix.get(i).set(j, 0);
            }
         }
      }
      return matrix;
   }

   private void fillRow(int row, ArrayList<ArrayList<Integer>> matrix, Integer m) {
      for (int j = 0; j < m; j++) {
         if (matrix.get(row).get(j) != 0) {
            matrix.get(row).set(j, -1);
         }
      }
   }

   private void fillColumn(int column, ArrayList<ArrayList<Integer>> matrix, Integer n) {
      for (int i = 0; i < n; i++) {
         if (matrix.get(i).get(column) != 0) {
            matrix.get(i).set(column, -1);
         }
      }
   }
}
