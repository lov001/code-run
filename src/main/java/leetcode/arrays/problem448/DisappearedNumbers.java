package leetcode.arrays.problem448;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        int length = nums.length;
        int[] initial = new int[length];
        for (int num : nums) {
            initial[num - 1] = num;
        }
        for (int i = 0; i < length; i++) {
            if (initial[i] == 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
