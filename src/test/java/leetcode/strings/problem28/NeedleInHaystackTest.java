package leetcode.strings.problem28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NeedleInHaystackTest {

    NeedleInHaystack classObj = new NeedleInHaystack();

    @Test
    void test_strStr_expect0_whenStrOccursAt0() {
        String needle = "sad";
        String haystack = "sadbutsad";
        Assertions.assertEquals(0, classObj.strStr(haystack, needle));
    }

    @Test
    void test_strStr_expectMinus1_whenStrDoesNotOccurInHaystack() {
        String needle = "leeto";
        String haystack = "leetcode";
        Assertions.assertEquals(-1, classObj.strStr(haystack, needle));
    }
}
