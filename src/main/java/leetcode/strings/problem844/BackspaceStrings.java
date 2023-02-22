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
                stack1.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                stack2.push(t.charAt(i));
            } else {
                stack2.pop();
            }
        }
        System.out.println("Stack 1 : " + Arrays.toString(stack1.toArray()));
        System.out.println("Stack 2 : " + Arrays.toString(stack2.toArray()));
        return Arrays.toString(stack1.toArray()).equals(Arrays.toString(stack2.toArray()));
    }
}
