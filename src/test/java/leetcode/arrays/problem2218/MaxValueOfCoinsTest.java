package leetcode.arrays.problem2218;

import java.util.ArrayList;
import java.util.List;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;

public class MaxValueOfCoinsTest {

    MaxValueOfCoins classObj = new MaxValueOfCoins();

    @Ignore
    void test_maxValueOfCoins_expect_when() {
        List<List<Integer>> piles = new ArrayList<>();
        Assertions.assertEquals(101, classObj.maxValueOfCoins(piles, 2));
    }
}
