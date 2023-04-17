package leetcode.strings.problem316;

import java.util.Stack;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            freq[c - 'a']--;
            if (visited[c - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && c < stack.peek() && freq[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
