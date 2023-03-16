package leetcode.math.problem202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    HappyNumber classObj = new HappyNumber();
    HappyNumberUsingCycleDetectionAlgorithm classObj2 =
        new HappyNumberUsingCycleDetectionAlgorithm();

    @Test
    void test_isHappy_expectTrue_whenNumberIs19() {
        Assertions.assertTrue(classObj.isHappy(19));
        Assertions.assertTrue(classObj2.isHappy(19));
    }

    @Test
    void test_isHappy_expectFalse_whenNumberIs2() {
        Assertions.assertFalse(classObj.isHappy(2));
        Assertions.assertFalse(classObj2.isHappy(2));
    }

    @Test
    void test_isHappy_expectTrue_whenNumberIs1111111() {
        Assertions.assertTrue(classObj.isHappy(1111111));
        Assertions.assertTrue(classObj2.isHappy(1111111));
    }
}
