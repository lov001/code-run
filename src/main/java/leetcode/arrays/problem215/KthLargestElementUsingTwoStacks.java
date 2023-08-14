package leetcode.arrays.problem215;

import java.util.Stack;

public class KthLargestElementUsingTwoStacks {


   public int findKthLargest(int[] nums, int k) {
      Stack<Integer> stack = new Stack<>();
      for (int number : nums) {
         if (stack.isEmpty()) {
            stack.push(number);
         } else {
            Stack<Integer> bkup = new Stack<>();
            while (!stack.isEmpty() && stack.peek() > number) {
               bkup.push(stack.pop());
            }
            stack.push(number);
            while (!bkup.isEmpty()) {
               stack.push(bkup.pop());
            }
         }
      }
      while (!stack.isEmpty()) {
         int ans = stack.pop();
         k--;
         if (k == 0) {
            return ans;
         }
      }
      return -1;
   }
}
