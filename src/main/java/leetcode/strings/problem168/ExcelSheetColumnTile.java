package leetcode.strings.problem168;

public class ExcelSheetColumnTile {

    public String convertToTitle(int columnNumber) {
        if (columnNumber <= 26) {
            char ch = (char) (columnNumber + 64);
            return String.valueOf(ch);
        }
        StringBuilder string = new StringBuilder();
        while (columnNumber != 0) {
            int remainder = columnNumber % 26;
            string.append((char) ((remainder == 0 ? 26 : remainder) + 64));
            columnNumber = --columnNumber / 26;
        }
        return string.reverse().toString();
    }
}
