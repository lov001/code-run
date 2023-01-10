package leetcode.problem392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    IsSubsequence classObj = new IsSubsequence();

    @Test
    void test_isIsomorphic_expectTrue_whenInputIsIsomorphic() {
        String s = "abc";
        String t = "ahbgdc";
        Assertions.assertTrue(classObj.isSubsequence(s, t));
    }

    @Test
    void test_isIsomorphic_expectFalse_whenInputIsNotIsomorphic() {
        String s = "axc";
        String t = "ahbgdc";
        Assertions.assertFalse(classObj.isSubsequence(s, t));
    }

    @Test
    void test_isIsomorphic_expectTrue_whenTwoStringsAreIsomorphic() {
        String s = "ace";
        String t = "abcde";
        Assertions.assertTrue(classObj.isSubsequence(s, t));
    }

    @Test
    void test_isIsomorphic_expectFalse_whenRandomInput() {
        String s = "aec";
        String t = "abcde";
        Assertions.assertFalse(classObj.isSubsequence(s, t));
    }

    @Test
    void test_isIsomorphic_expectFalse_whenRandomInput1() {
        String s = "";
        String t = "ahbgdc";
        Assertions.assertTrue(classObj.isSubsequence(s, t));
    }
}
