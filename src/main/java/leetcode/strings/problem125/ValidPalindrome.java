package leetcode.strings.problem125;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end) {
            while ((start < end) && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while ((start < end) && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
