package leetcode.arrays.problem75;

import utils.SwapNumbersInArray;

public class DutchNationalFlag {

   public void sortColors(int[] nums) {
      int start = 0, mid = 0, end = nums.length - 1;
      while (mid <= end) {
         switch (nums[mid]) {
            case 0 -> {
               SwapNumbersInArray.swap(nums, start, mid);
               start++;
               mid++;
            }
            case 1 -> mid++;
            case 2 -> {
               SwapNumbersInArray.swap(nums, mid, end);
               end--;
            }
            default -> {
            }
         }
      }
   }
}
