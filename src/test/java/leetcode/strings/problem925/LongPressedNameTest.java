package leetcode.strings.problem925;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongPressedNameTest {

    LongPressedName classObj = new LongPressedName();

    @Test
    void test_isLongPressedName_expectTrue_whenLongPressedName() {
        String input = "alex";
        String typed = "aaleex";
        Assertions.assertTrue(classObj.isLongPressedName(input, typed));
    }

    @Test
    void test_isLongPressedName_expectFalse_whenNotLongPressedName() {
        String input = "saeed";
        String typed = "ssaaedd";
        Assertions.assertFalse(classObj.isLongPressedName(input, typed));
    }

    @Test
    void test_isLongPressedName_expectTrue_whenLongPressedNameIsLeeLee() {
        String input = "leelee";
        String typed = "lleeelee";
        Assertions.assertTrue(classObj.isLongPressedName(input, typed));
    }

    @Test
    void test_isLongPressedName_expectFalse_whenNotLongPressedNameIsAlex() {
        String input = "alex";
        String typed = "aaleexa";
        Assertions.assertFalse(classObj.isLongPressedName(input, typed));
    }

    @Test
    void test_isLongPressedName_expectTrue_whenLongPressedNameIsVtkgn() {
        String input = "vtkgn";
        String typed = "vttkgnn";
        Assertions.assertTrue(classObj.isLongPressedName(input, typed));
    }

    @Test
    void test_isLongPressedName_expectFalse_whenLongPressedNameIsPyplrz() {
        String input = "pyplrz";
        String typed = "ppyypllr";
        Assertions.assertFalse(classObj.isLongPressedName(input, typed));
    }
}
