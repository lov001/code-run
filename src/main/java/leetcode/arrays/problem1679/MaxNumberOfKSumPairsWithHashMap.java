package leetcode.arrays.problem1679;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairsWithHashMap {

    public int maxNumOfKSumPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int res = k - num;
            if (map.containsKey(res)) {
                count++;
                if (map.get(res) == 1) {
                    map.remove(res);
                } else {
                    map.put(res, map.get(res) - 1);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}
