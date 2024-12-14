package practice.binarysearch;

import java.util.ArrayList;

public class SearchIn2DMatrixII {

   public boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr) {
      int n = arr.size();
      int m = arr.get(0).size();
      int row = 0;
      int col = m - 1;
      while (row < n && col >= 0) {
         int element = arr.get(row).get(col);
         if (element == x) {
            return true;
         } else if (element < x) {
            row++;
         } else {
            col--;
         }
      }
      return false;
   }
}
