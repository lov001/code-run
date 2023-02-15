package leetcode.arrays.problem1679;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                count++;
                nums[i++] = 0;
                nums[j--] = 0;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
}
