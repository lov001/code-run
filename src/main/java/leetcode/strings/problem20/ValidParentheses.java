package leetcode.strings.problem20;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String inputString) {
        Stack<Character> inputStack = new Stack<>();
        for (char ch : inputString.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                inputStack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                char poppedChar = inputStack.pop();
                if (!((poppedChar == '(' && ch == ')') || (poppedChar == '{' && ch == '}')
                    || (poppedChar == '[' && ch == ']'))) {
                    return false;
                }
            }
        }
        return true;
    }
}
