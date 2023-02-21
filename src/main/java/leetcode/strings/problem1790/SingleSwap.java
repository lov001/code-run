package leetcode.strings.problem1790;

public class SingleSwap {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else if (s1.length() == 1) {
            return s1.charAt(0) == s2.charAt(0);
        }
        return false;
    }
}
