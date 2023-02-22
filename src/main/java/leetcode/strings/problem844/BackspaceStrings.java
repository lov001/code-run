package leetcode.strings.problem844;

import java.util.Arrays;
import java.util.Stack;

public class BackspaceStrings {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                stack1.push(s.charAt(i));
            } else {
                if (stack1.size() > 0) {
                    stack1.pop();
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                stack2.push(t.charAt(i));
            } else {
                if (stack2.size() > 0) {
                    stack2.pop();
                }
            }
        }
        return Arrays.toString(stack1.toArray()).equals(Arrays.toString(stack2.toArray()));
    }
}
