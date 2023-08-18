package leetcode.arrays.problem239;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SlidingWindowMaximumUsingPriorityQueue {


   public int[] maxSlidingWindow(int[] nums, int k) {
      Queue<Integer> queue = new LinkedList<>();
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
      List<Integer> result = new ArrayList<>();
      for (int num : nums) {
         priorityQueue.offer(num);
         queue.add(num);
         if (priorityQueue.size() == k) {
            int max = priorityQueue.peek();
            int toRemove = queue.remove();
            priorityQueue.remove(toRemove);
            result.add(max);
         }
      }
      return result.stream().mapToInt(Integer::intValue).toArray();
   }

}
