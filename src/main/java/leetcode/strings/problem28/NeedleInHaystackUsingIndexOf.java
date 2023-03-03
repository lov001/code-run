package leetcode.strings.problem28;

public class NeedleInHaystackUsingIndexOf {

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
