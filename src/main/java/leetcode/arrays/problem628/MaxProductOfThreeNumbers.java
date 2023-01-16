package leetcode.arrays.problem628;

public class MaxProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        int prod = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int temp = nums[i] * nums[j] * nums[k];
                    prod = Math.max(prod, temp);
                }
            }
        }
        return prod;
    }
}
