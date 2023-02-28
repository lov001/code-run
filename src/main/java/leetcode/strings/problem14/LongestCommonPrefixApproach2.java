package leetcode.strings.problem14;

import java.util.Arrays;

public class LongestCommonPrefixApproach2 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int i = 0;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        while (i < first.length()) {
            if (i < last.length() && first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return first.substring(0, i);
    }
}
