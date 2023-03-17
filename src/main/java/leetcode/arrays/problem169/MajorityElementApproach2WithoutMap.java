package leetcode.arrays.problem169;

import java.util.Arrays;

public class MajorityElementApproach2WithoutMap {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                max++;
            } else if (max > nums.length / 2) {
                return nums[i - 1];
            } else {
                max = 1;
            }
        }
        return nums[max - 1];
    }
}
