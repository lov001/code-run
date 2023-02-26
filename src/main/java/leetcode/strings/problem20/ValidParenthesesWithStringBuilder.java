package leetcode.strings.problem20;

public class ValidParenthesesWithStringBuilder {

    public boolean isValid(String inputString) {
        if (inputString.length() % 2 != 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stringBuilder.append(ch);
            } else if (stringBuilder.length() != 0 && (ch == ')' || ch == '}' || ch == ']')) {
                char poppedChar = stringBuilder.charAt(stringBuilder.length() - 1);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                if (!((poppedChar == '(' && ch == ')') || (poppedChar == '{' && ch == '}')
                    || (poppedChar == '[' && ch == ']'))) {
                    return false;
                }
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.length() == 0;
    }
}
