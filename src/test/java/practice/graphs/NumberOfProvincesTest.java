package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {

   NumberOfProvinces classObj = new NumberOfProvinces();

   @Test
   void test_numberOfProvinces_expect2_whenNumberOfNodesAre3() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(0));
      Assertions.assertEquals(2, classObj.numberOfProvinces(3, adjacencyList));
   }

   @Test
   void test_numberOfProvinces_expect1_whenNumberOfNodesAre2() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0));
      Assertions.assertEquals(1, classObj.numberOfProvinces(2, adjacencyList));
   }

   @Test
   void test_numberOfProvinces_expect3_whenNumberOfNodesAre8() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 2));
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(4));
      adjacencyList.add(List.of(3, 5));
      adjacencyList.add(List.of(4));
      adjacencyList.add(List.of(7));
      adjacencyList.add(List.of(6));
      Assertions.assertEquals(3, classObj.numberOfProvinces(8, adjacencyList));
   }

   @Test
   void test_numberOfProvincesUpdated_expect2_whenNumberOfNodesAre3() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 0, 1));
      adjacencyList.add(List.of(0, 1, 0));
      adjacencyList.add(List.of(1, 0, 1));
      Assertions.assertEquals(2, classObj.numberOfProvincesUpdated(3, adjacencyList));
   }

   @Test
   void test_numberOfProvincesUpdated_expect1_whenNumberOfNodesAre2() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 1));
      adjacencyList.add(List.of(1, 1));
      Assertions.assertEquals(1, classObj.numberOfProvincesUpdated(2, adjacencyList));
   }

   @Test
   void test_numberOfProvinces_expect2_whenNumberOfNodesAre2() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 0));
      adjacencyList.add(List.of(0, 1));
      Assertions.assertEquals(2, classObj.numberOfProvincesUpdated(2, adjacencyList));
   }

   @Test
   void test_numberOfProvincesUpdated_expect3_whenNumberOfNodesAre8() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 1, 0, 0, 0, 0, 0, 0));
      adjacencyList.add(List.of(1, 1, 1, 0, 0, 0, 0, 0));
      adjacencyList.add(List.of(0, 1, 1, 0, 0, 0, 0, 0));
      adjacencyList.add(List.of(0, 0, 0, 1, 1, 0, 0, 0));
      adjacencyList.add(List.of(0, 0, 0, 1, 1, 1, 0, 0));
      adjacencyList.add(List.of(0, 0, 0, 0, 1, 1, 0, 0));
      adjacencyList.add(List.of(0, 0, 0, 0, 0, 0, 1, 1));
      adjacencyList.add(List.of(0, 0, 0, 0, 0, 0, 1, 1));
      Assertions.assertEquals(3, classObj.numberOfProvincesUpdated(8, adjacencyList));
   }
}
