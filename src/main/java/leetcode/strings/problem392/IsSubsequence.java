package leetcode.strings.problem392;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int count = 0;
        if (s.length() == 0 && t.length() == 0) {
            return true;
        } else if (s.length() > t.length()) {
            return false;
        } else if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(count) == t.charAt(i)) {
                count++;
            }
            if (count == s.length()) {
                return true;
            }
        }
        return false;
    }
}
