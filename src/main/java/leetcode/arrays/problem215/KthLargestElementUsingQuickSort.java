package leetcode.arrays.problem215;

public class KthLargestElementUsingQuickSort {


   public int findKthLargest(int[] nums, int k) {
      quickSort(nums, 0, nums.length - 1);
      return nums[nums.length - k];
   }

   public void quickSort(int[] nums, int low, int high) {
      if (low < high) {
         int pivot = partition(nums, low, high);
         quickSort(nums, 0, pivot - 1);
         quickSort(nums, pivot + 1, high);
      }
   }

   private int partition(int[] nums, int low, int high) {
      int pivot = nums[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
         if (nums[j] < pivot) {
            i++;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
         }
      }
      int temp = nums[i + 1];
      nums[i + 1] = nums[high];
      nums[high] = temp;
      return (i + 1);
   }
}
