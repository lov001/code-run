package leetcode.strings.problem1154;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfTheYearTest {

    DayOfTheYear classObj = new DayOfTheYear();
    DayOfTheYearWithoutPredefinedFunction classObj2 = new DayOfTheYearWithoutPredefinedFunction();

    @Test
    void test_dayOfYear_expect9_whenDateIs09012019() {
        String date = "2019-01-09";
        int output = 9;
        Assertions.assertEquals(output, classObj.dayOfYear(date));
        Assertions.assertEquals(output, classObj2.dayOfYear(date));
    }

    @Test
    void test_dayOfYear_expect41_whenDateIs10022019() {
        String date = "2019-02-10";
        int output = 41;
        Assertions.assertEquals(output, classObj.dayOfYear(date));
        Assertions.assertEquals(output, classObj2.dayOfYear(date));
    }

    @Test
    void test_dayOfYear_expect41_whenDateIs10102008() {
        String date = "2008-10-10";
        int output = 284;
        Assertions.assertEquals(output, classObj.dayOfYear(date));
        Assertions.assertEquals(output, classObj2.dayOfYear(date));
    }

    @Test
    void test_dayOfYear_expect40_whenDateIs09022016() {
        String date = "2016-02-09";
        int output = 40;
        Assertions.assertEquals(output, classObj.dayOfYear(date));
        Assertions.assertEquals(output, classObj2.dayOfYear(date));
    }
}
