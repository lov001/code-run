package leetcode.strings.problem409;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeSetBasedApproach {

    public int longestPalindrome(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (characterSet.contains(ch)) {
                characterSet.remove(ch);
            } else {
                characterSet.add(ch);
            }
        }
        if (characterSet.size() <= 1) {
            return s.length();
        }
        return s.length() - characterSet.size() + 1;
    }
}
