package leetcode.strings.problem1614;

public class MaxDepthOfParentheses {

    public int maxDepth(String s) {
        int maxCount = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        return maxCount;
    }
}
