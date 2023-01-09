package leetcode.problem205;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringByTransformation {

    private String transform(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!indexMap.containsKey(ch)) {
                indexMap.put(ch, i);
            }
            builder.append(indexMap.get(ch));
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return transform(s).equals(transform(t));
    }
}
