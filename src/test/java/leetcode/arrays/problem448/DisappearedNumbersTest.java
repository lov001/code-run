package leetcode.arrays.problem448;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisappearedNumbersTest {

    DisappearedNumbers classObj = new DisappearedNumbers();

    @Test
    void test_findDisappearedNumbers_expect_when() {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        Assertions.assertEquals(classObj.findDisappearedNumbers(input), Arrays.asList(5, 6));
    }

    @Test
    void test_findDisappearedNumbers_expect2_whenSameElementsInArray() {
        int[] input = {1, 1};
        Assertions.assertEquals(classObj.findDisappearedNumbers(input),
            Collections.singletonList(2));
    }
}
