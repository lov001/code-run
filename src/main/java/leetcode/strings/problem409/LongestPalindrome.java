package leetcode.strings.problem409;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] characterMap = new int[128];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            characterMap[s.charAt(i)]++;
        }
        for (int value : characterMap) {
            result += value / 2 * 2;
            if (result % 2 == 0 && value % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}
