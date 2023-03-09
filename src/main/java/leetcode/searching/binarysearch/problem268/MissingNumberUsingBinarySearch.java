package leetcode.searching.binarysearch.problem268;

import java.util.Arrays;

public class MissingNumberUsingBinarySearch {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int beg = 0, end = nums.length - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] > mid) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return beg;
    }
}
