package leetcode.arrays.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {

    ThreeSum classObj = new ThreeSum();

    @Test
    void test_threeSum_expect_when() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1, -1, 2));
        output.add(Arrays.asList(-1, 0, 1));
        Assertions.assertEquals(output, classObj.threeSum(input));
    }

    @Test
    void test_threeSum_expect_when1() {
        int[] input = {-0, 1, 1};
        Assertions.assertEquals(Collections.emptyList(), classObj.threeSum(input));
    }

    @Test
    void test_threeSum_expect_when2() {
        int[] input = {0, 0, 0};
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(0, 0, 0));
        Assertions.assertEquals(output, classObj.threeSum(input));
    }
}
