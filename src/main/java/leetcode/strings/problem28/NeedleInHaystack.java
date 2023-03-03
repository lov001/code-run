package leetcode.strings.problem28;

public class NeedleInHaystack {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int hayStackLength = haystack.length();
        int needleLength = needle.length();
        if (hayStackLength < needleLength) {
            return -1;
        }
        for (int i = 0; i <= hayStackLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
}
