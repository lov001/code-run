package leetcode.arrays.problem2218;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxValueOfCoinsTest {

    MaxValueOfCoins classObj = new MaxValueOfCoins();

    @Test
    void test_maxValueOfCoins_expect_when() {
        List<List<Integer>> piles = new ArrayList<>();
        Assertions.assertEquals(101, classObj.maxValueOfCoins(piles, 2));
    }
}
