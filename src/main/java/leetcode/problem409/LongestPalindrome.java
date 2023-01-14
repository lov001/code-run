package leetcode.problem409;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (characterMap.get(s.charAt(i)) == null) {
                characterMap.put(s.charAt(i), 1);
            } else {
                int count = characterMap.get(s.charAt(i));
                characterMap.put(s.charAt(i), count + 1);
            }

        }

        for (Entry<Character, Integer> entry : characterMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                evenCount += entry.getValue();
            } else {
                oddCount++;
            }
        }
        return oddCount > 1 ? evenCount + 1 : 1;
    }
}
