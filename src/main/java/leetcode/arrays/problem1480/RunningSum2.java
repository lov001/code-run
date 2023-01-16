package leetcode.arrays.problem1480;

public class RunningSum2 {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            result[i] = sum + temp;
            sum += temp;
        }
        return result;
    }
}
