package leetcode.searching.binarysearch.problem349;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysUsingTwoHashSet {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        int index = 0;
        for (int number : nums1) {
            set.add(number);
        }
        for (int number : nums2) {
            if (set.contains(number)) {
                intersection.add(number);
            }
        }
        int[] result = new int[intersection.size()];
        for (Integer num : intersection) {
            result[index++] = num;
        }
        return result;
    }
}
