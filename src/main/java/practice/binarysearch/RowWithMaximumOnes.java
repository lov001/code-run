package practice.binarysearch;

import java.util.ArrayList;

public class RowWithMaximumOnes {


   public int rowMaxOnesOptimised(ArrayList<ArrayList<Integer>> mat, int n, int m) {
      int row = -1;
      int maxOneCount = 0;
      for (int i = 0; i < n; i++) {
         int oneIndex = -1;
         for (int j = 0; j < m; j++) {
            if (mat.get(i).get(j) == 1) {
               oneIndex = j;
               break;
            }
         }
         int onesCount = m - oneIndex;
         if (oneIndex != -1 && onesCount > maxOneCount) {
            maxOneCount = onesCount;
            row = i;
         }
      }
      return row;
   }

   public int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
      int row = -1;
      int maxOneCount = 0;
      for (int i = 0; i < n; i++) {
         int oneCount = 0;
         for (int j = 0; j < m; j++) {
            if (mat.get(i).get(j) == 1) {
               oneCount++;
            }
         }
         if (oneCount > 0 && oneCount > maxOneCount) {
            maxOneCount = oneCount;
            row = i;
         }
      }
      return row;
   }
}
