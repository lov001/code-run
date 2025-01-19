package practice.arrays;

public class ReversePairs {

   public int teamBruteForce(int[] skill, int n) {
      int count = 0;
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            if (skill[i] > 2 * skill[j]) {
               count++;
            }
         }
      }
      return count;
   }
}
