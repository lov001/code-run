package leetcode.problem205;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicStringTest {

    IsomorphicString classObj = new IsomorphicString();

    @Test
    void test_isIsomorphic_expectTrue_whenInputIsIsomorphic() {
        String s = "egg";
        String t = "add";
        Assertions.assertTrue(classObj.isIsomorphic(s, t));
    }

    @Test
    void test_isIsomorphic_expectFalse_whenInputIsNotIsomorphic() {
        String s = "foo";
        String t = "bar";
        Assertions.assertFalse(classObj.isIsomorphic(s, t));
    }

    @Test
    void test_isIsomorphic_expectTrue_whenTwoStringsAreIsomorphic() {
        String s = "paper";
        String t = "title";
        Assertions.assertTrue(classObj.isIsomorphic(s, t));
    }

    @Test
    void test_isIsomorphic_expectFalse_whenRandomInput() {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        Assertions.assertFalse(classObj.isIsomorphic(s, t));
    }
}
