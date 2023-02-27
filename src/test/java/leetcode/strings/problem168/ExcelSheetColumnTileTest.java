package leetcode.strings.problem168;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnTileTest {

    ExcelSheetColumnTile classObj = new ExcelSheetColumnTile();
    ExcelColumnTileUsingRecursion classObj2 = new ExcelColumnTileUsingRecursion();

    @Test
    void test_convertToTitle_expectA_whenInputIs1() {
        int columnNumber = 1;
        Assertions.assertEquals("A", classObj.convertToTitle(columnNumber));
        Assertions.assertEquals("A", classObj2.convertToTitle(columnNumber));
    }

    @Test
    void test_convertToTitle_expectAB_whenInputIs28() {
        int columnNumber = 28;
        Assertions.assertEquals("AB", classObj.convertToTitle(columnNumber));
        Assertions.assertEquals("AB", classObj2.convertToTitle(columnNumber));
    }

    @Test
    void test_convertToTitle_expectZY_whenInputIs701() {
        int columnNumber = 701;
        Assertions.assertEquals("ZY", classObj.convertToTitle(columnNumber));
        Assertions.assertEquals("ZY", classObj2.convertToTitle(columnNumber));
    }
}
