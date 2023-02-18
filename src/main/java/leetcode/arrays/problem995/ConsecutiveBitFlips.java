package leetcode.arrays.problem995;

public class ConsecutiveBitFlips {

    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flipped = new int[n];
        int flipCount = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipCount -= flipped[i - k];
            }
            if ((nums[i] + flipCount) % 2 == 0) {
                if (i + k > n) {
                    return -1;
                }
                flipped[i] = 1;
                flipCount++;
                result++;
            }
        }
        return result;
    }
}
