package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;

public class MaximumSumOfNonAdjacentElements {

   public int maximumNonAdjacentSum(ArrayList<Integer> nums) {
      return recursion(0, nums.size() - 1, nums);
   }

   private int recursion(int sum, int index, ArrayList<Integer> nums) {
      if (index == 0) {
         return nums.get(index);
      }
      if (index < 0) {
         return 0;
      }

      int elementPickedSum = nums.get(index) + recursion(sum + nums.get(index), index - 2, nums);
      int elementNotPickedSum = recursion(sum, index - 1, nums);
      return Math.max(elementPickedSum, elementNotPickedSum);
   }
}
