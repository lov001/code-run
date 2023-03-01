package leetcode.strings.problem125;

public class ValidPalindromeByRemovingCharacters {

    public boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0, end = cleanString.length() - 1;
        while (start < end) {
            if (cleanString.charAt(start) != cleanString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
