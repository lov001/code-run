package leetcode.arrays.problem11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater classObj = new ContainerWithMostWater();

    @Test
    void test_maxArea_expect49_whenGivenInput() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assertions.assertEquals(49, classObj.maxArea(input));
    }

    @Test
    void test_maxArea_expect1_whenInputContainsTwoOnes() {
        int[] input = {1, 1};
        Assertions.assertEquals(1, classObj.maxArea(input));
    }
}
