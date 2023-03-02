package leetcode.arrays.problem443;

public class StringCompression {

    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        int i = 1;
        for (; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                str.append(chars[i - 1]);
                if (count > 1) {
                    str.append(count);
                }
                count = 1;
            }
        }
        str.append(chars[i - 1]);
        if (count > 1) {
            str.append(count);
        }
        int carry = 0;
        int index = 0;
        chars = new char[str.length()];
        for (char ch : str.toString().toCharArray()) {
            if (carry != 0) {
                chars[index++] = (char) (ch / 10);
                carry = ch % 10;
            } else if (Character.isLetter(ch)) {
                chars[index++] = ch;
            } else {
                int num = ch - '0';
                if (num > 9) {
                    chars[index++] = (char) (num / 10);
                    carry = num % 10;
                } else {
                    chars[index++] = ch;
                }
            }
        }
        return str.length();
    }
}
