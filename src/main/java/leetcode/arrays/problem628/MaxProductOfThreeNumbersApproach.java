package leetcode.arrays.problem628;

import java.util.Arrays;

public class MaxProductOfThreeNumbersApproach {

    public int maximumProduct(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[length - 1],
            nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }
}
