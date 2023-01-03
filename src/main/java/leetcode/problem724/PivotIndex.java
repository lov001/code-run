package leetcode.problem724;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int result = -1;
        int leftIndex = 0;
        int j = nums.length - 1;
        int leftSum = nums[0];
        int rightSum = nums[j];
        for (int i = 1; i < nums.length; i++) {
            if (leftSum == rightSum) {
                return leftIndex + 1;
            } else if (leftSum < rightSum) {
                leftSum += nums[++leftIndex];
            } else {
                rightSum += nums[--j];
            }
        }
        return result;
    }
}
