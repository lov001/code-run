package leetcode.strings.problem830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionOfLargeGroupTest {

    PositionOfLargeGroup classObj = new PositionOfLargeGroup();

    @Test
    void test_largeGroupPositions_expectListOfSize1_whenStringContainsOneLargeGroup() {
        String input = "abbxxxxzzy";
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(3, 6));
        Assertions.assertEquals(output, classObj.largeGroupPositions(input));
    }

    @Test
    void test_largeGroupPositions_expectListOfSize0_whenStringContainsNoLargeGroup() {
        String input = "abc";
        List<List<Integer>> output = new ArrayList<>();
        Assertions.assertEquals(output, classObj.largeGroupPositions(input));
    }

    @Test
    void test_largeGroupPositions_expectListOfSize3_whenStringContainsThreeLargeGroup() {
        String input = "abcdddeeeeaabbbcd";
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(3, 5));
        output.add(Arrays.asList(6, 9));
        output.add(Arrays.asList(12, 14));
        Assertions.assertEquals(output, classObj.largeGroupPositions(input));
    }
}
