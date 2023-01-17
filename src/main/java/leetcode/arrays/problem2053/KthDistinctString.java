package leetcode.arrays.problem2053;

import java.util.LinkedHashSet;

public class KthDistinctString {

    public String kthDistinct(String[] arr, int k) {
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        for (String str : arr) {
            if (stringSet.contains(str)) {
                stringSet.remove(str);
            } else {
                stringSet.add(str);
            }
        }
        if (stringSet.size() >= k) {
            int count = 0;
            for (String itr : stringSet) {
                ++count;
                if (count == k) {
                    return itr;
                }
            }
        }
        return "";
    }
}
