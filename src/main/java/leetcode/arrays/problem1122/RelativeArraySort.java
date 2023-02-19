package leetcode.arrays.problem1122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RelativeArraySort {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        int index = 0;
        for (int number : arr1) {
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number) + 1);
            } else {
                countMap.put(number, 1);
            }
        }
        for (int key : arr2) {
            Arrays.fill(arr1, index, index + countMap.get(key), key);
            index += countMap.get(key);
            countMap.remove(key);
        }
        List<Integer> sortedList = new ArrayList<>(countMap.keySet());
        Collections.sort(sortedList);
        for (int element : sortedList) {
            arr1[index++] = element;
        }
        return arr1;
    }
}
