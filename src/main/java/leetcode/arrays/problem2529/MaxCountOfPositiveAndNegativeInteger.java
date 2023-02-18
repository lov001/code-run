package leetcode.arrays.problem2529;

public class MaxCountOfPositiveAndNegativeInteger {

    public int maximumCount(int[] nums) {
        int positiveCount = 0, negativeCount = 0;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (end < 0) {
                break;
            }
            if (nums[start] == 0) {
                start++;
                continue;
            } else if (nums[end] == 0) {
                end--;
                continue;
            }
            if (nums[start] < 0) {
                negativeCount++;
                start++;
            }
            if (nums[end] > 0) {
                positiveCount++;
                end--;
            }
        }
        return Math.max(positiveCount, negativeCount);
    }
}
