package practice.binarysearch;

import java.util.ArrayList;

public class SearchIn2DMatrix {

   public boolean searchMatrixBinarySearchOptimisedWith1DArray(ArrayList<ArrayList<Integer>> mat,
      int target) {
      int n = mat.size();
      int m = mat.get(0).size();
      int low = 0;
      int high = n * m - 1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         int row = mid / m;
         int col = mid % m;
         if (mat.get(row).get(col) == target) {
            return true;
         } else if (mat.get(row).get(col) > target) {
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return false;
   }

   public boolean searchMatrixBinarySearchOptimised(ArrayList<ArrayList<Integer>> mat, int target) {
      int m = mat.get(0).size();
      for (ArrayList<Integer> integers : mat) {
         int low = 0;
         int high = m - 1;
         if (integers.get(0) <= target && integers.get(high) >= target) {
            while (low <= high) {
               int mid = low + (high - low) / 2;
               if (integers.get(mid) == target) {
                  return true;
               } else if (integers.get(mid) > target) {
                  high = mid - 1;
               } else {
                  low = mid + 1;
               }
            }
         }
      }
      return false;
   }

   public boolean searchMatrixBinarySearch(ArrayList<ArrayList<Integer>> mat, int target) {
      int m = mat.get(0).size();
      for (ArrayList<Integer> integers : mat) {
         int low = 0;
         int high = m - 1;
         while (low <= high) {
            int mid = low + (high - low) / 2;
            if (integers.get(mid) == target) {
               return true;
            } else if (integers.get(mid) > target) {
               high = mid - 1;
            } else {
               low = mid + 1;
            }
         }
      }
      return false;
   }

   public boolean searchMatrixBruteForce(ArrayList<ArrayList<Integer>> mat, int target) {
      int m = mat.get(0).size();
      for (ArrayList<Integer> integers : mat) {
         for (int j = 0; j < m; j++) {
            if (integers.get(j) == target) {
               return true;
            }
         }
      }
      return false;
   }
}
