package leetcode.strings.problem657;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotReturnToOriginTest {

    RobotReturnToOrigin classObj = new RobotReturnToOrigin();

    @Test
    void test_judgeCircle_expectTrue_whenRobotReturnToOrigin() {
        String input = "UD";
        Assertions.assertTrue(classObj.judgeCircle(input));
    }

    @Test
    void test_judgeCircle_expectFalse_whenRobotDoesNotReturnToOrigin() {
        String input = "LL";
        Assertions.assertFalse(classObj.judgeCircle(input));
    }
}
