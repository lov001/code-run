package practice.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

   public int minimumReschedules(int n, int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
      int lastFreeTime = intervals[0][1];
      int nonOverlappingIntervals = 1;
      for (int i = 1; i < n; i++) {
         if (intervals[i][0] >= lastFreeTime) {
            lastFreeTime = intervals[i][1];
            nonOverlappingIntervals++;
         }
      }
      return n - nonOverlappingIntervals;
   }
}
