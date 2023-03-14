package leetcode.searching.binarysearch.problem349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = 0, n2 = 0, index = 0;
        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] == nums2[n2]) {
                set.add(nums1[n1]);
                n1++;
                n2++;
            } else if (nums1[n1] > nums2[n2]) {
                n2++;
            } else {
                n1++;
            }
        }
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[index++] = num;
        }
        return result;
    }
}
