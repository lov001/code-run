package practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSum {

   public int longestSubArrayWithSumKWithTwoPointer(int[] a, long k) {
      int maxLength = 0;
      int n = a.length;
      long sum = 0;
      int i = 0;
      int j = 0;
      while (j < n) {
         sum += a[j];
         if (sum > k) {
            sum -= a[i];
            i++;
         }
         if (sum == k) {
            maxLength = Math.max(maxLength, j - i + 1);
         }
         j++;
      }
      return maxLength;
   }

   public int longestSubArrayWithSumKWithPrefixSum(int[] a, long k) {
      int maxLength = 0;
      int n = a.length;
      Map<Long, Integer> prefixSumMap = new HashMap<>();
      long sum = 0;
      for (int i = 0; i < n; i++) {
         sum += a[i];
         if (sum == k) {
            maxLength = Math.max(maxLength, i + 1);
         }
         long difference = sum - k;
         if (prefixSumMap.get(difference) != null) {
            maxLength = Math.max(maxLength, i - prefixSumMap.get(difference));
         }
         prefixSumMap.putIfAbsent(sum, i);
      }
      return maxLength;
   }

   public int longestSubArrayWithSumKBruteForce(int[] a, long k) {
      int maxLength = 0;
      int n = a.length;
      for (int i = 0; i < n; i++) {
         long sum = 0;
         for (int j = i; j < n; j++) {
            sum += a[j];
            if (sum == k) {
               maxLength = Math.max(maxLength, j - i + 1);
            } else if (sum > k) {
               break;
            }
         }
      }
      return maxLength;
   }
}
