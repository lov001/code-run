package leetcode.arrays.problem1122;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RelativeArraySort {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        int index = 0;
        for (int number : arr1) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }
        for (int key : arr2) {
            Arrays.fill(arr1, index, index + countMap.get(key), key);
            index += countMap.get(key);
            countMap.remove(key);
        }
        int[] remainingArray = new int[arr1.length];
        int preIndex = index;
        for (Entry<Integer, Integer> map : countMap.entrySet()) {
            Arrays.fill(remainingArray, index, index + map.getValue(),
                map.getKey() != 0 ? map.getKey() : -1);
            index += map.getValue();
        }
        Arrays.sort(remainingArray);
        for (int element : remainingArray) {
            if (element != 0 && preIndex < arr1.length) {
                arr1[preIndex++] = element == -1 ? 0 : element;
            }
        }
        return arr1;
    }
}
