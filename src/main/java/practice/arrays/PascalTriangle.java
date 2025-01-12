package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

   public int[][] pascalTriangle(int N) {
      // TC: O(N*N), SC: O(1 )
      int[][] result = new int[N][N];
      for (int i = 1; i <= N; i++) {
         List<Integer> row = findRowInPascalTriangle(i);
         result[i - 1] = row.stream().mapToInt(Integer::intValue).toArray();
      }
      return result;
   }

   public List<Integer> findRowInPascalTriangle(int N) {
      // TC: O(N), SC: O(1)
      int ans = 1;
      List<Integer> result = new ArrayList<>();
      result.add(ans);
      for (int i = 1; i < N; i++) {
         ans = ans * (N - i);
         ans = ans / i;
         result.add(ans);
      }
      return result;
   }

   public long findElementInPascalTriangle(int R, int C) {
      // TC: O(R), SC: O(1)
      return findResult(R - 1, C - 1);
   }

   private long findResult(int rows, int columns) {
      int res = 1;
      for (int i = 0; i < columns; i++) {
         res = res * (rows - i);
         res = res / (i + 1);
      }
      return res;
   }
}
