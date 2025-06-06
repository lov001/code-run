package practice.binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class PainterPartitionProblem {

   public int findLargestMinDistanceBinarySearch(ArrayList<Integer> boards, int k) {
      int low = Collections.max(boards);
      int high = boards.stream().mapToInt(Integer::intValue).sum();
      while (low <= high) {
         int mid = low + (high - low) / 2;
         int paintersUsed = possibleToPaint(boards, mid);
         if (paintersUsed <= k) {
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return low;
   }

   public int findLargestMinDistanceBruteForce(ArrayList<Integer> boards, int k) {
      int low = Collections.max(boards);
      int high = boards.stream().mapToInt(Integer::intValue).sum();
      for (int time = low; time <= high; time++) {
         int paintersUsed = possibleToPaint(boards, time);
         if (paintersUsed <= k) {
            return time;
         }
      }
      return low;
   }

   private int possibleToPaint(ArrayList<Integer> boards, int time) {
      int painters = 1;
      int boardsPainted = 0;
      for (Integer board : boards) {
         if (boardsPainted + board <= time) {
            boardsPainted += board;
         } else {
            painters++;
            boardsPainted = board;
         }
      }
      return painters;
   }
}
