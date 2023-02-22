package leetcode.strings.problem944;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeColumnsSortedByDeletionTest {

    MakeColumnsSortedByDeletion classObj = new MakeColumnsSortedByDeletion();

    @Test
    void test_minDeletionSize_expect1_whenInput() {
        String[] strArray = {"cba", "daf", "ghi"};
        Assertions.assertEquals(1, classObj.minDeletionSize(strArray));
    }

    @Test
    void test_minDeletionSize_expect0_whenInput() {
        String[] strArray = {"a", "b"};
        Assertions.assertEquals(0, classObj.minDeletionSize(strArray));
    }

    @Test
    void test_minDeletionSize_expect3_whenInput() {
        String[] strArray = {"zyx", "wvu", "tsr"};
        Assertions.assertEquals(3, classObj.minDeletionSize(strArray));
    }
}
