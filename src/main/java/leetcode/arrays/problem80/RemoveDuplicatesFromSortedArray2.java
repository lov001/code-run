package leetcode.arrays.problem80;

public class RemoveDuplicatesFromSortedArray2 {


   public int removeDuplicates(int[] nums) {
      int maxFrequency = 2, currentFrequency = 1;
      int lastIndex = 1;

      for (int i = 1; i < nums.length; i++) {
         if (nums[i] != nums[i - 1]) {
            nums[lastIndex++] = nums[i];
            currentFrequency = 1;
         } else if (currentFrequency < maxFrequency) {
            currentFrequency++;
            lastIndex++;
         }
         if (currentFrequency == maxFrequency || i == nums.length - 1) {
            nums[lastIndex - 1] = nums[i];
         }
      }
      return lastIndex;
   }

}
