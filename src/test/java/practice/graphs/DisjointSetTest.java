package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisjointSetTest {

   @Test
   void test_unionByRank_expectParentToBeUnequal_WhenGraphIsNotConnected() {
      DisjointSet classObj = new DisjointSet(7);
      classObj.unionByRank(1, 2);
      classObj.unionByRank(2, 3);
      classObj.unionByRank(4, 5);
      classObj.unionByRank(6, 7);
      classObj.unionByRank(5, 6);
      Assertions.assertNotEquals(classObj.findUltimateParent(3), classObj.findUltimateParent(7));
   }

   @Test
   void test_unionByRank_expectParentToBeEqual_WhenGraphIsConnected() {
      DisjointSet classObj = new DisjointSet(7);
      classObj.unionByRank(1, 2);
      classObj.unionByRank(2, 3);
      classObj.unionByRank(4, 5);
      classObj.unionByRank(6, 7);
      classObj.unionByRank(5, 6);
      classObj.unionByRank(3, 7);
      Assertions.assertEquals(classObj.findUltimateParent(3), classObj.findUltimateParent(7));
   }

   @Test
   void test_unionBySize_expectParentToBeUnequal_WhenGraphIsNotConnected() {
      DisjointSet classObj = new DisjointSet(7);
      classObj.unionBySize(1, 2);
      classObj.unionBySize(2, 3);
      classObj.unionBySize(4, 5);
      classObj.unionBySize(6, 7);
      classObj.unionBySize(5, 6);
      Assertions.assertNotEquals(classObj.findUltimateParent(3), classObj.findUltimateParent(7));
   }

   @Test
   void test_unionBySize_expectParentToBeEqual_WhenGraphIsConnected() {
      DisjointSet classObj = new DisjointSet(7);
      classObj.unionBySize(1, 2);
      classObj.unionBySize(2, 3);
      classObj.unionBySize(4, 5);
      classObj.unionBySize(6, 7);
      classObj.unionBySize(5, 6);
      classObj.unionBySize(3, 7);
      Assertions.assertEquals(classObj.findUltimateParent(3), classObj.findUltimateParent(7));
   }
}
