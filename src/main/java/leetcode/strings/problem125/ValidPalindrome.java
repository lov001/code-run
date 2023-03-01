package leetcode.strings.problem125;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (s.charAt(start) < 65 || (s.charAt(start) > 90 && s.charAt(start) < 97)
                || s.charAt(start) > 122) {
                start++;
            }
            while (s.charAt(end) < 65 || (s.charAt(end) > 90 && s.charAt(end) < 97)
                || s.charAt(end) > 122) {
                end--;
            }
            if (!(String.valueOf(s.charAt(start))
                .equalsIgnoreCase(String.valueOf(s.charAt(end))))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
