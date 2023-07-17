package leetcode.arrays.problem88;

public class MergeSortedArrayApproach2 {


   public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = 0, j = 0;
      int[] outputArray = new int[m + n];
      while (i < m && j < n) {
         if (nums1[i] > nums2[j]) {
            outputArray[i + j] = nums2[j++];
         } else if (nums1[i] < nums2[j]) {
            outputArray[i + j] = nums1[i++];
         } else {
            outputArray[i + j] = nums1[i];
            i++;
         }
      }
      if (i < m) {
         while (i < m && j == n) {
            outputArray[i + j] = nums1[i++];
         }
         while (i < m) {
            if (nums1[i] > nums2[j]) {
               outputArray[i + j] = nums2[j++];
            } else if (nums1[i] < nums2[j]) {
               outputArray[i + j] = nums1[i++];
            } else {
               outputArray[i + j] = nums1[i];
               i++;
            }
         }
      }
      if (j < n) {
         while (j < n && i == m) {
            outputArray[i + j] = nums2[j++];
         }
         while (j < n && i < m) {
            if (nums1[i] > nums2[j]) {
               outputArray[i + j] = nums2[j++];
            } else if (nums1[i] < nums2[j]) {
               outputArray[i + j] = nums1[i++];
            } else {
               outputArray[i + j] = nums1[i];
               i++;
            }
         }
      }
      int k = 0;
      for (int value : outputArray) {
         nums1[k++] = value;
      }
   }
}
