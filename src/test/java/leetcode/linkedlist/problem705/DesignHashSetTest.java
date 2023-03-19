package leetcode.linkedlist.problem705;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignHashSetTest {


    @Test
    void test_DesignHashSet() {
        DesignHashSet classObj = new DesignHashSet();
        classObj.add(1);
        Assertions.assertEquals(1, classObj.length());
        classObj.print();
        classObj.add(2);
        Assertions.assertEquals(2, classObj.length());
        classObj.print();
        Assertions.assertTrue(classObj.contains(1));
        Assertions.assertFalse(classObj.contains(3));
        classObj.add(2);
        Assertions.assertEquals(2, classObj.length());
        classObj.print();
        Assertions.assertTrue(classObj.contains(2));
        classObj.remove(2);
        Assertions.assertEquals(1, classObj.length());
        classObj.print();
        Assertions.assertFalse(classObj.contains(2));
    }

    @Test
    void test_DesignHashSet_optimisedApproach() {
        DesignHashSetOptimisedApproach classObj = new DesignHashSetOptimisedApproach();
        classObj.add(1);
        classObj.add(2);
        Assertions.assertTrue(classObj.contains(1));
        Assertions.assertFalse(classObj.contains(3));
        classObj.add(2);
        Assertions.assertTrue(classObj.contains(2));
        classObj.remove(2);
        Assertions.assertFalse(classObj.contains(2));
    }
}
