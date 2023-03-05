package leetcode.strings.problem925;


public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && typed.charAt(j) == name.charAt(i - 1)) {
                j++;
            } else if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }
            if (i == name.length()) {
                return true;
            }
        }
        return false;
    }
}