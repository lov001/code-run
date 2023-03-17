package leetcode.arrays.problem169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums) {
            int newValue = map.getOrDefault(number, 0) + 1;
            map.put(number, newValue);
            if (newValue > nums.length / 2) {
                return number;
            }
        }
        return 0;
    }
}
