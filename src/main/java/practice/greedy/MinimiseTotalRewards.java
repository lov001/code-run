package practice.greedy;

import java.util.Arrays;

public class MinimiseTotalRewards {


   public int minRewards(int[] ratings) {
      int n = ratings.length;
      int[] rewards = new int[n];
      Arrays.fill(rewards, 1);

      for (int i = 1; i < n; i++) {
         if (ratings[i] > ratings[i - 1]) {
            rewards[i] = rewards[i - 1] + 1;
         }
      }

      int minRewards = rewards[n - 1];
      for (int i = n - 2; i >= 0; i--) {
         if (ratings[i] > ratings[i + 1]) {
            rewards[i] = Math.max(rewards[i], rewards[i + 1] + 1);
         }
         minRewards += rewards[i];
      }
      return minRewards;
   }
}
