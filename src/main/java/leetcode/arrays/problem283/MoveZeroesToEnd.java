package leetcode.arrays.problem283;

import utils.SwapNumbersInArray;

public class MoveZeroesToEnd {

    public int[] moveZeroes(int[] nums) {
        int zi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                SwapNumbersInArray.swap(nums, zi, i);
                zi++;
            }
        }
        return nums;
    }
}
