package practice.dynamicprogrammingandrecursion;

import java.util.List;

public class EightQueen {

   private static final int GRID_SIZE = 8;

   public void placeQueens(int row, Integer[] columns, List<Integer[]> results) {
      if (row == GRID_SIZE) {
         results.add(columns.clone());
      } else {
         for (int col = 0; col < GRID_SIZE; col++) {
            if (checkValidPlacement(columns, row, col)) {
               columns[row] = col;
               placeQueens(row + 1, columns, results);
            }
         }
      }
   }

   private boolean checkValidPlacement(Integer[] columns, int row1, int col1) {
      for (int row2 = 0; row2 < row1; row2++) {
         int column2 = columns[row2];
         if (col1 == column2) {
            return false;
         }
         int columnDistance = Math.abs(column2 - col1);
         int rowDistance = row1 - row2;
         if (rowDistance == columnDistance) {
            return false;
         }
      }
      return true;
   }
}
