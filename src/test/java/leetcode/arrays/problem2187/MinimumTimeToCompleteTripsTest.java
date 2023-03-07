package leetcode.arrays.problem2187;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumTimeToCompleteTripsTest {

    MinimumTimeToCompleteTrips classObj = new MinimumTimeToCompleteTrips();

    @Test
    void test_minimumTime_expect3_whenMinimumTripsRequiredIs3() {
        int[] time = {1, 2, 3};
        Assertions.assertEquals(3, classObj.minimumTime(time, 5));
    }

    @Test
    void test_minimumTime_expect2_whenMinimumTripsRequiredIs2() {
        int[] time = {2};
        Assertions.assertEquals(2, classObj.minimumTime(time, 1));
    }
}
