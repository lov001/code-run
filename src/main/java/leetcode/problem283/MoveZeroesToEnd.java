package leetcode.problem283;

public class MoveZeroesToEnd {

    public int[] moveZeroes(int[] nums) {
        int zi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums.length > 1) {
                int x = nums[zi];
                nums[zi] = nums[i];
                nums[i] = x;
                zi++;
            }
        }
        return nums;
    }
}
