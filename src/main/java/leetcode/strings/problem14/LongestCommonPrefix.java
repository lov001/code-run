package leetcode.strings.problem14;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            longestCommonPrefix = commonPrefix(longestCommonPrefix, strs[i]);
            if (longestCommonPrefix.length() == 0) {
                return "";
            }
        }
        return longestCommonPrefix;
    }

    private String commonPrefix(String prevLongestPrefix, String currentWord) {
        int i;
        for (i = 0; i < prevLongestPrefix.length(); i++) {
            if (i >= currentWord.length() || !(prevLongestPrefix.charAt(i) == currentWord.charAt(
                i))) {
                break;
            }
        }
        return prevLongestPrefix.substring(0, i);
    }
}
