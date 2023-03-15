package leetcode.strings.problem205;

import leetcode.strings.problem205.IsomorphicStringByTransformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicStringByTransformationTest {

    IsomorphicStringByTransformation classObj = new IsomorphicStringByTransformation();

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
