package leetcode.arrays.problem443;

public class StringCompression {

    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        str.append(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (str.charAt(str.length() - 1) == chars[i]) {
                count++;
            } else {
                str.append(chars[str.length() - 1]);
                if (count > 1) {
                    str.append(count);
                }
                count = 0;
            }
        }
        return str.length();
    }
}
