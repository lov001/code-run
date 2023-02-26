package leetcode.strings.problem20;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String inputString) {
        if (inputString.length() % 2 != 0) {
            return false;
        }
        Stack<Character> inputStack = new Stack<>();
        for (char ch : inputString.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                inputStack.push(ch);
            } else if (!inputStack.isEmpty() && (ch == ')' || ch == '}' || ch == ']')) {
                char poppedChar = inputStack.pop();
                if (!((poppedChar == '(' && ch == ')') || (poppedChar == '{' && ch == '}')
                    || (poppedChar == '[' && ch == ']'))) {
                    return false;
                }
            } else {
                inputStack.push(ch);
            }
        }
        return inputStack.isEmpty();
    }
}
