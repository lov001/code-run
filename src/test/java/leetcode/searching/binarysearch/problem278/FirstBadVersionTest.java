package leetcode.searching.binarysearch.problem278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {

    FirstBadVersion classObj = new FirstBadVersion();

    @Test
    void test_firstBadVersion_expect4_whenFirstBadVersionIs4() {
        Assertions.assertEquals(4, classObj.firstBadVersion(5));
    }

    @Test
    void test_firstBadVersion_expect1_whenFirstBadVersionIs1() {
        Assertions.assertEquals(1, classObj.firstBadVersion(1));
    }
}
