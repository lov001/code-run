package leetcode.strings.problem1790;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SingleSwap {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else if (s1.length() == 1) {
            return s1.charAt(0) == s2.charAt(0);
        }
        List<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list.add(s1.charAt(i));
                stack.push(s2.charAt(i));
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else if (count == 2) {
            return list.get(0).equals(stack.pop()) && list.get(1).equals(stack.pop());
        }
        return false;
    }
}
