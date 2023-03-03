package leetcode.strings.problem28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NeedleInHaystackTest {

    NeedleInHaystack classObj = new NeedleInHaystack();
    NeedleInHaystackUsingIndexOf classObj2 = new NeedleInHaystackUsingIndexOf();

    @Test
    void test_strStr_expect0_whenStrOccursAt0() {
        String needle = "sad";
        String haystack = "sadbutsad";
        Assertions.assertEquals(0, classObj.strStr(haystack, needle));
        Assertions.assertEquals(0, classObj2.strStr(haystack, needle));
    }

    @Test
    void test_strStr_expectMinus1_whenStrDoesNotOccurInHaystack() {
        String needle = "leeto";
        String haystack = "leetcode";
        Assertions.assertEquals(-1, classObj.strStr(haystack, needle));
        Assertions.assertEquals(-1, classObj2.strStr(haystack, needle));
    }

    @Test
    void test_strStr_expectMinus4_whenStrOccurInHaystackAt4() {
        String needle = "issip";
        String haystack = "mississippi";
        Assertions.assertEquals(4, classObj.strStr(haystack, needle));
        Assertions.assertEquals(4, classObj2.strStr(haystack, needle));
    }

    @Test
    void test_strStr_expectMinus2_whenStrOccurInHaystackAt2() {
        String needle = "ll";
        String haystack = "hello";
        Assertions.assertEquals(2, classObj.strStr(haystack, needle));
        Assertions.assertEquals(2, classObj2.strStr(haystack, needle));
    }

    @Test
    void test_strStr_expectMinus0_whenStrOccurInHaystackAt0() {
        String needle = "a";
        String haystack = "aaa";
        Assertions.assertEquals(0, classObj.strStr(haystack, needle));
        Assertions.assertEquals(0, classObj2.strStr(haystack, needle));
    }
}
