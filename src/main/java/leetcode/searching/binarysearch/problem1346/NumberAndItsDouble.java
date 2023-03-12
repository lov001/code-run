package leetcode.searching.binarysearch.problem1346;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberAndItsDouble {

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] * 2, map.getOrDefault(arr[i] * 2, 0) + 1);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.containsKey(arr[i])) {
                return arr[i] == 0 && map.get(0) == 1 ? false : true;
            }
        }
        return false;
    }
}
