package leetcode.arrays.problem283;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;


public class MoveZeroesToEndTest {

    MoveZeroesToEnd classObj = new MoveZeroesToEnd();

    @Test
    void test_moveZeroesToEnd_expect0_when0() {
        int[] input = {0};
        int[] output = {0};
        assertEquals(Arrays.toString(output), Arrays.toString(classObj.moveZeroes(input)));
    }

    @Test
    void test_moveZeroesToEnd_expect1_when1() {
        int[] input = {1};
        int[] output = {1};
        assertEquals(Arrays.toString(output), Arrays.toString(classObj.moveZeroes(input)));
    }

    @Test
    void test_moveZeroesToEnd_expect10_when01() {
        int[] input = {0, 1};
        int[] output = {1, 0};
        assertEquals(Arrays.toString(output), Arrays.toString(classObj.moveZeroes(input)));
    }

    @Test
    void test_moveZeroesToEnd_expect10_when10() {
        int[] input = {1, 0};
        int[] output = {1, 0};
        assertEquals(Arrays.toString(output), Arrays.toString(classObj.moveZeroes(input)));
    }

    @Test
    void test_moveZeroesToEnd_whenRandomInput() {
        int[] input = {0, 1, 0, 3, 12};
        int[] output = {1, 3, 12, 0, 0};
        assertEquals(Arrays.toString(output), Arrays.toString(classObj.moveZeroes(input)));
    }
}
