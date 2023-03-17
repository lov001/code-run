package leetcode.arrays.problem169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    MajorityElement classObj = new MajorityElement();
    MajorityElementApproach2WithoutMap classObj2 = new MajorityElementApproach2WithoutMap();
    MajorityElementApproach3MooreVotingAlgorithm classObj3 =
        new MajorityElementApproach3MooreVotingAlgorithm();

    @Test
    void test_majorityElement_expect3_whenMajorityElementIs3() {
        int[] input = {3, 2, 3};
        Assertions.assertEquals(3, classObj.majorityElement(input));
        Assertions.assertEquals(3, classObj2.majorityElement(input));
        Assertions.assertEquals(3, classObj3.majorityElement(input));
    }

    @Test
    void test_majorityElement_expect2_whenMajorityElementIs2() {
        int[] input = {2, 2, 1, 1, 1, 2, 2};
        Assertions.assertEquals(2, classObj.majorityElement(input));
        Assertions.assertEquals(2, classObj2.majorityElement(input));
        Assertions.assertEquals(2, classObj3.majorityElement(input));
    }

    @Test
    void test_majorityElement_expect2_whenMajorityElementIsOnly2() {
        int[] input = {2, 2};
        Assertions.assertEquals(2, classObj.majorityElement(input));
        Assertions.assertEquals(2, classObj2.majorityElement(input));
        Assertions.assertEquals(2, classObj3.majorityElement(input));
    }

    @Test
    void test_majorityElement_expect3_whenMajorityElementIsOnly3() {
        int[] input = {3, 3, 4};
        Assertions.assertEquals(3, classObj.majorityElement(input));
        Assertions.assertEquals(3, classObj2.majorityElement(input));
        Assertions.assertEquals(3, classObj3.majorityElement(input));
    }
}
