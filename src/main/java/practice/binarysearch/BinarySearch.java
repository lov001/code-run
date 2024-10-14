package practice.binarysearch;

public class BinarySearch {

   public int searchIterative(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (nums[mid] == target) {
            return mid;
         } else if (target > nums[mid]) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return -1;
   }

   public int searchRecursive(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;
      return search(low, high, target, nums);
   }

   private int search(int low, int high, int target, int[] nums) {
      if (high < low) {
         return -1;
      }
      int mid = low + (high - low) / 2;
      if (target == nums[mid]) {
         return mid;
      } else if (target > nums[mid]) {
         return search(mid + 1, high, target, nums);
      } else {
         return search(low, mid - 1, target, nums);
      }
   }
}
