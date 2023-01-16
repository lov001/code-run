package leetcode.arrays.problem628;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProductOfThreeNumbersTest {

    MaxProductOfThreeNumbers classObj = new MaxProductOfThreeNumbers();
    MaxProductOfThreeNumbersBySortingArray classObj2 = new MaxProductOfThreeNumbersBySortingArray();
    MaxProductOfThreeNumbersByMinMaxValues classObj3 = new MaxProductOfThreeNumbersByMinMaxValues();

    @Test
    void test_maximumProduct_expect6_whenOnly3NumbersInInput() {
        int[] input = {1, 2, 3};
        Assertions.assertEquals(6, classObj.maximumProduct(input));
        Assertions.assertEquals(6, classObj2.maximumProduct(input));
        Assertions.assertEquals(6, classObj3.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expect24_whenOnly4NumbersInInput() {
        int[] input = {1, 2, 3, 4};
        Assertions.assertEquals(24, classObj.maximumProduct(input));
        Assertions.assertEquals(24, classObj2.maximumProduct(input));
        Assertions.assertEquals(24, classObj3.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expectMinus6_whenOnly3NegativeNumbersInInput() {
        int[] input = {-1, -2, -3};
        Assertions.assertEquals(-6, classObj.maximumProduct(input));
        Assertions.assertEquals(-6, classObj2.maximumProduct(input));
        Assertions.assertEquals(-6, classObj3.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expectMinus6_whenAllNegativeNumbersInInput() {
        int[] input = {-1, -2, -3, -4};
        Assertions.assertEquals(-6, classObj.maximumProduct(input));
        Assertions.assertEquals(-6, classObj2.maximumProduct(input));
        Assertions.assertEquals(-6, classObj3.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expectMinus39200_whenLeftMostTwoNumbersAreNegativeAndLastIsPositive() {
        int[] input = {-100, -98, -1, 2, 3, 4};
        Assertions.assertEquals(39200, classObj.maximumProduct(input));
        Assertions.assertEquals(39200, classObj2.maximumProduct(input));
        Assertions.assertEquals(39200, classObj3.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expect972256230_whenRandomInput() {
        int[] input = {-710, -107, -851, 657, -14, -859, 278, -182, -749, 718, -640, 127, -930,
            -462, 694, 969, 143, 309, 904, -651, 160, 451, -159, -316, 844, -60, 611, -169, -73,
            721, -902, 338, -20, -890, -819, -644, 107, 404, 150, -219, 459, -324, -385, -118, -307,
            993, 202, -147, 62, -94, -976, -329, 689, 870, 532, -686, 371, -850, -186, 87, 878, 989,
            -822, -350, -948, -412, 161, -88, -509, 836, -207, -60, 771, 516, -287, -366, -512, 509,
            904, -459, 683, -563, -766, -837, -333, 93, 893, 303, 908, 532, -206, 990, 280, 826,
            -13, 115, -732, 525, -939, -787};
        Assertions.assertEquals(972256230, classObj.maximumProduct(input));
        Assertions.assertEquals(972256230, classObj2.maximumProduct(input));
        Assertions.assertEquals(972256230, classObj3.maximumProduct(input));
    }
}
