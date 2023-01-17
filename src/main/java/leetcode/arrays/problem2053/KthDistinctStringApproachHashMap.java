package leetcode.arrays.problem2053;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KthDistinctStringApproachHashMap {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> stringMap = new LinkedHashMap<>();
        for (String str : arr) {
            if (stringMap.get(str) == null) {
                stringMap.put(str, 1);
            } else {
                int strCount = stringMap.get(str);
                stringMap.put(str, strCount + 1);
            }
        }
        if (stringMap.size() >= k) {
            int count = 0;
            for (Entry<String, Integer> itr : stringMap.entrySet()) {
                if (itr.getValue() == 1) {
                    count++;
                }
                if (count == k) {
                    return itr.getKey();
                }
            }
        }
        return "";
    }
}
