package practice.slidingwindow;

public class BinarySubArraysWithSum {

   public int numSubArraysWithSum(int[] nums, int goal) {
      int count = 0;
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         int sum = 0;
         for (int j = i; j < n; j++) {
            sum += nums[j];
            if (sum == goal) {
               count++;
            } else if (sum > goal) {
               break;
            }
         }
      }
      return count;
   }
}
