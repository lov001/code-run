package leetcode.searching.binarysearch.problem1346;

import java.util.Arrays;

public class NumberAndItsDoubleUsingBinarySearch {

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int zeroCount = 0;
        for (int number : arr) {
            if (number != 0) {
                if (binarySearch(number * 2, arr)) {
                    return true;
                }
            } else {
                ++zeroCount;
            }
        }
        return zeroCount >= 2;
    }

    public boolean binarySearch(int number, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = ((start + end) / 2);
            if (nums[mid] < number) {
                start = 1 + mid;
            } else if (nums[mid] > number) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
