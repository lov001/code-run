package leetcode.problem409;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        int evenCount = 0, oddCount = 0, uniqueOddCount = 0;
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
                oddCount += entry.getValue();
                uniqueOddCount++;
            }
        }
        return oddCount >= 1 ? (characterMap.size() == 1 ? oddCount :
            evenCount + (uniqueOddCount % 2 == 0 ? 1 : uniqueOddCount))
            : (evenCount > 0 ? evenCount : 1);
    }
}
