package practice.dynamicprogrammingandrecursion;

public class MinimumNumberOfInsertionsAndDeletions {

   public int canYouMake(String s1, String s2) {
      int longestCommonSubsequence = lcsSpaceOptimisation(s1, s2);
      int n = s1.length();
      int m = s2.length();
      return n + m - (2 * longestCommonSubsequence);
   }

   public int lcsSpaceOptimisation(String s, String t) {
      int n = s.length();
      int m = t.length();
      int[] previous = new int[m + 1];
      for (int j = 0; j <= m; j++) {
         previous[j] = 0;
      }
      for (int index1 = 1; index1 <= n; index1++) {
         int[] current = new int[m + 1];
         for (int index2 = 1; index2 <= m; index2++) {
            if (s.charAt(index1 - 1) == t.charAt(index2 - 1)) {
               current[index2] = 1 + previous[index2 - 1];
            } else {
               current[index2] = Math.max(current[index2 - 1], previous[index2]);
            }
         }
         previous = current;
      }
      return previous[m];
   }
}
