package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

   public List<List<Integer>> mergeOverlappingIntervalsOptimal(int[][] arr) {
      Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
      List<List<Integer>> result = new ArrayList<>();
      for (int[] interval : arr) {
         int minStartTime = interval[0];
         int maxEndTime = interval[1];
         if (result.isEmpty() || interval[0] > result.get(result.size() - 1).get(1)) {
            List<Integer> sublist = new ArrayList<>();
            sublist.add(minStartTime);
            sublist.add(maxEndTime);
            result.add(sublist);
         } else {
            int size = result.size();
            List<Integer> lastEntry = result.get(size - 1);
            lastEntry.set(1, Math.max(lastEntry.get(1), interval[1]));
         }
      }
      return result;
   }


   // TC: nlog(n) + 2n
   public List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
      Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
      List<List<Integer>> result = new ArrayList<>();
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         int minStartTime = arr[i][0];
         int maxEndTime = arr[i][1];
         if (!result.isEmpty() && maxEndTime <= result.get(result.size() - 1).get(1)) {
            continue;
         }
         for (int j = i + 1; j < n; j++) {
            if (arr[j][0] <= maxEndTime) {
               maxEndTime = Math.max(maxEndTime, arr[j][1]);
            } else {
               break;
            }
         }
         List<Integer> sublist = new ArrayList<>();
         sublist.add(minStartTime);
         sublist.add(maxEndTime);
         result.add(sublist);
      }
      return result;
   }
}
