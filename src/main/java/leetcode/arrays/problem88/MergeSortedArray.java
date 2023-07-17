package leetcode.arrays.problem88;

public class MergeSortedArray {

   public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = 0, j = 0;
      while (i < m && j < n) {
         if (nums1[i] >= nums2[j]) {
            shiftArrayRight(nums1, i);
            nums1[i++] = nums2[j++];
         } else {
            i++;
         }
      }
      if (j < n) {
         while (j < n && i == m && (i != j || j == 0)) {
            nums1[i + j] = nums2[j++];
         }
         while (j < n) {
            if (nums1[i] >= nums2[j]) {
               shiftArrayRight(nums1, i);
               nums1[i++] = nums2[j++];
            } else if (nums2[j] > nums1[i] && i != j) {
               nums1[i] = nums2[j];
            } else {
               i++;
            }
         }
      }
   }

   private void shiftArrayRight(int[] array, int m) {
      for (int i = array.length - 1; i > m; i--) {
         array[i] = array[i - 1];
      }
   }
}
