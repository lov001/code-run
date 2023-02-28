package leetcode.strings.problem58;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0) {
            if (Character.isWhitespace(s.charAt(end))) {
                end--;
            } else {
                break;
            }
        }
        int start;
        for (start = end; start >= 0; start--) {
            if (Character.isWhitespace(s.charAt(start))) {
                break;
            }
        }
        return start == -1 ? s.substring(0, end).length() + 1 : s.substring(start, end).length();
    }
}
