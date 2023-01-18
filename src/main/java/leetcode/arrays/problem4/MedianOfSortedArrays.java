package leetcode.arrays.problem4;

public class MedianOfSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combinedLength = nums1.length + nums2.length;
        boolean isOdd = combinedLength % 2 != 0;
        int medianIndexFilter = combinedLength / 2;
        int[] combinedArray = new int[combinedLength];
        int i = 0, j = 0;
        double result;
        while ((i + j) < combinedLength) {
            if (i >= nums1.length || j >= nums2.length) {
                break;
            } else if (nums1[i] < nums2[j]) {
                combinedArray[i + j] = nums1[i];
                i++;
            } else {
                combinedArray[i + j] = nums2[j];
                j++;
            }
        }
        if (i < nums1.length) {
            for (int k = i; k < nums1.length; k++) {
                combinedArray[i+j] = nums1[i++];
            }
        }
        if (j < nums2.length) {
            for (int k = j; k < nums2.length; k++) {
                combinedArray[i+j] = nums2[j++];
            }
        }
        if (isOdd) {
            result = combinedArray[medianIndexFilter];
        } else {
            result =
                (double) (combinedArray[medianIndexFilter - 1] + combinedArray[medianIndexFilter])
                    / 2;
        }
        return result;
    }
}
