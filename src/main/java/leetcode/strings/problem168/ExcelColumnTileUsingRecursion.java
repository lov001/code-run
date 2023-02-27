package leetcode.strings.problem168;

public class ExcelColumnTileUsingRecursion {

    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ('A' + (n % 26));
    }
}
