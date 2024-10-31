package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LongestIncreasingSubsequence {

   public List<Integer> longestIncreasingSubsequenceOptimised(int[] arr) {
      int n = arr.length;
      int[] dp = new int[n];
      Arrays.fill(dp, 1);
      int[] backtrack = new int[n];
      for (int i = 0; i < n; i++) {
         backtrack[i] = i;
      }
      int maxi = 1;
      int maxIndex = 0;
      for (int index = 0; index < n; index++) {
         for (int previous = 0; previous < index; previous++) {
            if (arr[previous] < arr[index] && (1 + dp[previous] > dp[index])) {
               dp[index] = 1 + dp[previous];
               backtrack[index] = previous;
            }
            if (dp[index] > maxi) {
               maxi = dp[index];
               maxIndex = index;
            }
         }
      }
      List<Integer> output = new ArrayList<>();
      Stack<Integer> stack = new Stack<>();
      while (maxIndex != 0) {
         stack.add(arr[maxIndex]);
         maxIndex = backtrack[maxIndex];
      }
      stack.add(arr[maxIndex]);
      while (!stack.isEmpty()) {
         output.add(stack.pop());
      }
      return output;
   }
}
