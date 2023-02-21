package leetcode.strings.problem1790;

public class SingleSwap {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else if (s1.length() == 1) {
            return s1.charAt(0) == s2.charAt(0);
        }
        int[] differences = new int[2];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count == 2) {
                    return false;
                }
                differences[count++] = i;
            }
        }
        if (count == 0) {
            return true;
        } else if (count == 2) {
            return s1.charAt(differences[0]) == s2.charAt(differences[1]) &&
                s1.charAt(differences[1]) == s2.charAt(differences[0]);
        }
        return false;
    }
}
