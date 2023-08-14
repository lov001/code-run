package leetcode.arrays.problem215;


import java.util.PriorityQueue;

public class KthLargestElement {


   public int findKthLargest(int[] nums, int k) {

      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k + 1);

      for (int number : nums) {
         priorityQueue.offer(number);
         if (priorityQueue.size() > k) {
            priorityQueue.poll();
         }
      }

      return priorityQueue.poll();
   }
}
