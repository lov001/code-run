package leetcode.arrays.problem448;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbersWithoutExtraSpace {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int absValue = Math.abs(nums[i]) - 1;
            nums[absValue] = nums[absValue] > 0 ? nums[absValue] * -1 : nums[absValue];
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
