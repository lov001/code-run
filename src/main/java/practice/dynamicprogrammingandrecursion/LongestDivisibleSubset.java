package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestDivisibleSubset {

   public List<Integer> divisibleSet(int[] arr) {
      int n = arr.length;
      Arrays.sort(arr);
      int[] dp = new int[n];
      int[] hash = new int[n];
      Arrays.fill(dp, 1);
      for (int index = 0; index < n; index++) {
         hash[index] = index;
         for (int prev = 0; prev < index; prev++) {
            if (isDivisible(arr[index], arr[prev]) && (1 + dp[prev] > dp[index])) {
               dp[index] = 1 + dp[prev];
               hash[index] = prev;
            }
         }
      }
      int ans = -1;
      int lastIndex = -1;

      for (int i = 0; i < n; i++) {
         if (dp[i] > ans) {
            ans = dp[i];
            lastIndex = i;
         }
      }
      List<Integer> temp = new ArrayList<>();
      temp.add(arr[lastIndex]);

      while (hash[lastIndex] != lastIndex) {
         lastIndex = hash[lastIndex];
         temp.add(arr[lastIndex]);
      }
      Collections.reverse(temp);
      return temp;
   }

   private boolean isDivisible(int first, int second) {
      return first % second == 0 || second % first == 0;
   }
}
