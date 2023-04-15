package leetcode.queue.problem933;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecentCounterTest {

    @Test
    void test_noOfRequestsInLast3000() {
        RecentCounter counter = new RecentCounter();
        Assertions.assertEquals(1, counter.ping(1));
        Assertions.assertEquals(2, counter.ping(100));
        Assertions.assertEquals(3, counter.ping(3001));
        Assertions.assertEquals(3, counter.ping(3002));
    }

    @Test
    void test_noOfRequestsInLast3000_usingTreeMap() {
        RecentCounterUsingTreeMap counter = new RecentCounterUsingTreeMap();
        Assertions.assertEquals(1, counter.ping(1));
        Assertions.assertEquals(2, counter.ping(100));
        Assertions.assertEquals(3, counter.ping(3001));
        Assertions.assertEquals(3, counter.ping(3002));
    }
}
