package leetcode.searching.binarysearch.problem1346;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberAndItsDouble {

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j * 2, map.getOrDefault(j * 2, 0) + 1);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.containsKey(arr[i])) {
                return arr[i] != 0 || map.get(0) != 1;
            }
        }
        return false;
    }
}
