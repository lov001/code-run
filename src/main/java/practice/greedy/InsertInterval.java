package practice.greedy;

import java.util.ArrayList;

public class InsertInterval {

   public ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals,
      ArrayList<Integer> newInterval) {
      ArrayList<ArrayList<Integer>> resultIntervals = new ArrayList<>();
      int i = 0;
      int n = intervals.size();
      while (i < n && intervals.get(i).get(1) < newInterval.get(0)) {
         resultIntervals.add(intervals.get(i));
         i++;
      }
      while (i < n && intervals.get(i).get(0) <= newInterval.get(1)) {
         newInterval.set(0, Math.min(intervals.get(i).get(0), newInterval.get(0)));
         newInterval.set(1, Math.max(intervals.get(i).get(1), newInterval.get(1)));
         i++;
      }
      resultIntervals.add(newInterval);
      while (i < n) {
         resultIntervals.add(intervals.get(i));
         i++;
      }
      return resultIntervals;
   }
}
