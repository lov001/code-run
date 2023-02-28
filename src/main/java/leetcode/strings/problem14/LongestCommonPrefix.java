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
        StringBuilder prefix = new StringBuilder();
        for (int i = 0, j = 0; i < prevLongestPrefix.length() && j < currentWord.length();
            i++, j++) {
            if (prevLongestPrefix.charAt(i) == currentWord.charAt(j)) {
                prefix.append(prevLongestPrefix.charAt(i));
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}
