package leetcode.strings.problem290;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, Integer> set = new HashMap<>();
        StringBuilder match1 = new StringBuilder();
        int index = 0;
        for (char ch : pattern.toCharArray()) {
            if (set.get(ch) == null) {
                match1.append(index);
                set.put(ch, index++);
            } else {
                match1.append(set.get(ch));
            }
        }
        index=0;
        HashMap<String, Integer> set2 = new HashMap<>();
        StringBuilder match2 = new StringBuilder();
        for (String word : s.split(" ")) {
            if (set2.get(word) == null) {
                match2.append(index);
                set2.put(word, index++);
            } else {
                match2.append(set2.get(word));
            }
        }
        return match1.toString().equals(match2.toString());
    }
}
