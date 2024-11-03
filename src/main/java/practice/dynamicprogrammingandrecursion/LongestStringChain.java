package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringChain {

   public int longestStrChain(String[] arr) {
      int n = arr.length;
      Arrays.sort(arr, Comparator.comparingInt(String::length));
      int[] dp = new int[n];
      Arrays.fill(dp, 1);
      int maxLength = 1;
      for (int i = 0; i < n; i++) {
         for (int prevIndex = 0; prevIndex < i; prevIndex++) {
            if (isNextChainWord(arr[i], arr[prevIndex]) && (dp[prevIndex] + 1) > dp[i]) {
               dp[i] = dp[prevIndex] + 1;
            }
         }
         if (dp[i] > maxLength) {
            maxLength = dp[i];
         }
      }

      return maxLength;
   }

   private boolean isNextChainWord(String s1, String s2) {
      int currentLength = s1.length();
      int previousLength = s2.length();
      if (currentLength != previousLength + 1) {
         return false;
      }
      int first = 0;
      int second = 0;
      while (first < currentLength) {
         if (second < previousLength && s1.charAt(first) == s2.charAt(second)) {
            first++;
            second++;
         } else {
            first++;
         }

      }
      return first == currentLength && second == previousLength;
   }
}
