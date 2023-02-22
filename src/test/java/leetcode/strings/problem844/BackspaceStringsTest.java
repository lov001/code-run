package leetcode.strings.problem844;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BackspaceStringsTest {

    BackspaceStrings classObj = new BackspaceStrings();
    BackspaceStringsApproach2 classObj2 = new BackspaceStringsApproach2();

    @Test
    void test_backspaceCompare_expectTrue_whenStringBecomeAC() {
        String str1 = "ab#c";
        String str2 = "ad#c";
        Assertions.assertTrue(classObj.backspaceCompare(str1, str2));
        Assertions.assertTrue(classObj2.backspaceCompare(str1, str2));
    }

    @Test
    void test_backspaceCompare_expectTrue_whenStringBecomeEmpty() {
        String str1 = "ab##";
        String str2 = "c#d#";
        Assertions.assertTrue(classObj.backspaceCompare(str1, str2));
        Assertions.assertTrue(classObj2.backspaceCompare(str1, str2));
    }

    @Test
    void test_backspaceCompare_expectFalse_when() {
        String str1 = "a#c";
        String str2 = "b";
        Assertions.assertFalse(classObj.backspaceCompare(str1, str2));
        Assertions.assertFalse(classObj2.backspaceCompare(str1, str2));
    }

    @Test
    void test_backspaceCompare_expectTrue_when() {
        String str1 = "a##c";
        String str2 = "#a#c";
        Assertions.assertTrue(classObj.backspaceCompare(str1, str2));
        Assertions.assertTrue(classObj2.backspaceCompare(str1, str2));
    }
}
