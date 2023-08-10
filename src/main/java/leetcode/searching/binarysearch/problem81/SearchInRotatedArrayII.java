package leetcode.searching.binarysearch.problem81;

public class SearchInRotatedArrayII {


   public boolean search(int[] nums, int target) {
      int left = 0, right = nums.length - 1;
      int mid;
      while (left <= right) {
         mid = left + (right - left) / 2;
         if(nums[mid] == target){
            return true;
         }
         if ((nums[mid] == nums[left]) && (nums[right] == nums[mid])) {
            left++;
            right--;
         } else if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && (target < nums[mid])) {
               right = mid - 1;
            } else {
               left = mid + 1;
            }
         } else {
            if (nums[right] >= target && (target > nums[mid])) {
               left = mid + 1;
            } else {
               right = mid - 1;
            }
         }
      }
      return false;
   }
}
