package leetcode.arrays.problem27;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class RemoveElementTest {

    RemoveElement classObj = new RemoveElement();

    @Test
    void test_removeElement_expect2_whenTwoNonMatchingElements() {
        int[] input = {3, 2, 2, 3};
        int val = 3;
        int output = 2;
        int[] expectedOutput = {2, 2, 3, 3};
        assertEquals(output, classObj.removeElement(input, val));
//        assertArrayEquals(expectedOutput, input);
    }

    @Test
    void test_removeElement_expect5_when5NonMatchingElement() {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int output = 5;
        int[] expectedOutput = {0, 1, 4, 0, 3, 2, 2, 2};
        assertEquals(output, classObj.removeElement(input, val));
//        assertArrayEquals(expectedOutput, input);
    }

    @Test
    void test_removeElement_expectEmptyArray_whenOneElement() {
        int[] input = {1};
        int val = 1;
        int output = 0;
        int[] expectedOutput = {};
        assertEquals(output, classObj.removeElement(input, val));
//        assertArrayEquals(expectedOutput, input);
    }
}
