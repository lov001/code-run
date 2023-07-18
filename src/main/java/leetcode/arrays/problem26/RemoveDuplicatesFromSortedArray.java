package leetcode.arrays.problem26;

public class RemoveDuplicatesFromSortedArray {


   public int removeDuplicates(int[] nums) {
      int lastSeen = Integer.MAX_VALUE;
      int lastIndex = 0;

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != lastSeen) {
            lastSeen = nums[i];
            nums[lastIndex++] = lastSeen;
         }
      }
      return lastIndex;
   }

}
