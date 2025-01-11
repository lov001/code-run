package practice.arrays;

import java.util.ArrayList;

public class ZeroMatrix {

   public ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,
      Integer n, Integer m) {
      int colZero = 1;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) == 0) {
               matrix.get(i).set(0, 0);
               if (j != 0) {
                  matrix.get(0).set(j, 0);
               } else {
                  colZero = 0;
               }

            }
         }
      }
      for (int i = 1; i < n; i++) {
         for (int j = 1; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
               if (matrix.get(0).get(j) == 0 || matrix.get(i).get(0) == 0) {
                  matrix.get(i).set(j, 0);
               }
            }
         }
      }
      if (matrix.get(0).get(0) == 0) {
         for (int j = 0; j < m; j++) {
            matrix.get(0).set(j, 0);
         }
      }
      if (colZero == 0) {
         for (int i = 0; i < n; i++) {
            matrix.get(i).set(0, 0);
         }
      }
      return matrix;
   }

   public ArrayList<ArrayList<Integer>> zeroMatrixBetter(ArrayList<ArrayList<Integer>> matrix,
      Integer n, Integer m) {
      int[] row = new int[n];
      int[] column = new int[m];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) == 0) {
               row[i] = 1;
               column[j] = 1;
            }
         }
      }
      for (int i = 0; i < n; i++) {
         if (row[i] == 1) {
            fillRow(i, matrix, m, 0);
         }
      }
      for (int j = 0; j < m; j++) {
         if (column[j] == 1) {
            fillColumn(j, matrix, n, 0);
         }
      }
      return matrix;
   }

   public ArrayList<ArrayList<Integer>> zeroMatrixBruteForce(ArrayList<ArrayList<Integer>> matrix,
      Integer n, Integer m) {
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) == 0) {
               fillRow(i, matrix, m, -1);
               fillColumn(j, matrix, n, -1);
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

   private void fillRow(int row, ArrayList<ArrayList<Integer>> matrix, Integer m, int value) {
      for (int j = 0; j < m; j++) {
         if (matrix.get(row).get(j) != 0) {
            matrix.get(row).set(j, value);
         }
      }
   }

   private void fillColumn(int column, ArrayList<ArrayList<Integer>> matrix, Integer n, int value) {
      for (int i = 0; i < n; i++) {
         if (matrix.get(i).get(column) != 0) {
            matrix.get(i).set(column, value);
         }
      }
   }
}
