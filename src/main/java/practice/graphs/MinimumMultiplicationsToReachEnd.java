package practice.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplicationsToReachEnd {

   private static final int MOD_LIMIT = 100000;

   public int minimumMultiplications(int[] arr, int start, int end) {
      int[] steps = new int[MOD_LIMIT];
      Arrays.fill(steps, Integer.MAX_VALUE);
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(start, 0));
      steps[start] = 0;
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         int number = pair.first;
         int stepsTaken = pair.second;
         if (number == end) {
            return stepsTaken;
         }
         for (int num : arr) {
            int multipliedValue = (number * num) % MOD_LIMIT;
            if (stepsTaken + 1 < steps[multipliedValue]) {
               steps[multipliedValue] = stepsTaken + 1;
               queue.add(new Pair(multipliedValue, stepsTaken + 1));
            }
         }
      }
      return -1;
   }
}
