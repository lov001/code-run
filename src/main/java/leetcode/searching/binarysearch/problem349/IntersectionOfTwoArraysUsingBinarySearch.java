package leetcode.searching.binarysearch.problem349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysUsingBinarySearch {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        int index = 0;
        for (int number : nums1) {
            if (binarySearch(nums2, number)) {
                set.add(number);
            }
        }
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[index++] = num;
        }
        return result;
    }

    private boolean binarySearch(int[] array, int number) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == number) {
                return true;
            } else if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
