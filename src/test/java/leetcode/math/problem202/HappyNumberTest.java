package leetcode.math.problem202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    HappyNumber classObj = new HappyNumber();

    @Test
    void test_isHappy_expectTrue_whenNumberIs19() {
        Assertions.assertTrue(classObj.isHappy(19));
    }

    @Test
    void test_isHappy_expectFalse_whenNumberIs2() {
        Assertions.assertFalse(classObj.isHappy(2));
    }

    @Test
    void test_isHappy_expectTrue_whenNumberIs1111111() {
        Assertions.assertTrue(classObj.isHappy(1111111));
    }
}
