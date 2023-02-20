package leetcode.strings.problem1154;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfTheYearTest {

    DayOfTheYear classObj = new DayOfTheYear();

    @Test
    void test_dayOfYear_expect9_whenDateIs09012019() {
        String date = "2019-01-09";
        int output = 9;
        Assertions.assertEquals(output, classObj.dayOfYear(date));
    }

    @Test
    void test_dayOfYear_expect41_whenDateIs10022019() {
        String date = "2019-02-10";
        int output = 41;
        Assertions.assertEquals(output, classObj.dayOfYear(date));
    }
}
