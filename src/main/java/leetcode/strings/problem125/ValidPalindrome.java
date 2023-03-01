package leetcode.strings.problem125;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while ((start < end) && !Character.isLetter(s.charAt(start))) {
                start++;
            }
            while ((start < end) && !Character.isLetter(s.charAt(end))) {
                end--;
            }
            if (!(String.valueOf(s.charAt(start))
                .equalsIgnoreCase(String.valueOf(s.charAt(end))))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
