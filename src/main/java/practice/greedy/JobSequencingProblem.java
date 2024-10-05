package practice.greedy;

import java.util.Arrays;

public class JobSequencingProblem {

   public int[] JobScheduling(Job[] arr, int n) {
      Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
      int maxDeadline = 0;
      for (int i = 0; i < n; i++) {
         maxDeadline = Math.max(maxDeadline, arr[i].deadline);
      }
      int[] jobOrder = new int[maxDeadline + 1];
      Arrays.fill(jobOrder, -1);
      int[] output = new int[2];

      for (int i = 0; i < n; i++) {
         for (int j = arr[i].deadline; j > 0; j--) {
            if (jobOrder[j] == -1) {
               jobOrder[j] = arr[i].id;
               output[0] += 1;
               output[1] += arr[i].profit;
               break;
            }
         }
      }
      return output;
   }

   public int[] JobScheduling(int[][] arr, int n) {
      Arrays.sort(arr, (a, b) -> Integer.compare(b[2], a[2]));
      int maxDeadline = 0;
      for (int i = 0; i < n; i++) {
         maxDeadline = Math.max(maxDeadline, arr[i][1]);
      }
      int[] jobOrder = new int[maxDeadline + 1];
      Arrays.fill(jobOrder, -1);
      int[] output = new int[2];

      for (int i = 0; i < n; i++) {
         for (int j = arr[i][1]; j > 0; j--) {
            if (jobOrder[j] == -1) {
               jobOrder[j] = arr[i][0];
               output[0] += 1;
               output[1] += arr[i][2];
               break;
            }
         }
      }
      return output;
   }

   public static class Job {

      int id, profit, deadline;

      Job(int x, int y, int z) {
         this.id = x;
         this.deadline = y;
         this.profit = z;
      }
   }
}
