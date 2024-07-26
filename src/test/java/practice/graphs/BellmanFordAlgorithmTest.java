package practice.graphs;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BellmanFordAlgorithmTest {

   BellmanFordAlgorithm classObj = new BellmanFordAlgorithm();

   @Test
   void test_bellmanFord_expect0And9_whenGraphHasTwoNodes() {
      ArrayList<Integer> vertex = new ArrayList<>();
      vertex.add(0);
      vertex.add(1);
      vertex.add(9);
      ArrayList<ArrayList<Integer>> vertices = new ArrayList<>();
      vertices.add(vertex);
      int[] output = {0, 9};
      Assertions.assertArrayEquals(output, classObj.bellmanFord(2, vertices, 0));
   }

   @Test
   void test_bellmanFord_expect1And6And0_whenGraphHasThreeNodes() {
      ArrayList<Integer> vertex1 = new ArrayList<>();
      vertex1.add(0);
      vertex1.add(1);
      vertex1.add(5);
      ArrayList<Integer> vertex2 = new ArrayList<>();
      vertex2.add(1);
      vertex2.add(0);
      vertex2.add(3);
      ArrayList<Integer> vertex3 = new ArrayList<>();
      vertex3.add(1);
      vertex3.add(2);
      vertex3.add(-1);
      ArrayList<Integer> vertex4 = new ArrayList<>();
      vertex4.add(2);
      vertex4.add(0);
      vertex4.add(1);
      ArrayList<ArrayList<Integer>> vertices = new ArrayList<>();
      vertices.add(vertex1);
      vertices.add(vertex2);
      vertices.add(vertex3);
      vertices.add(vertex4);
      int[] output = {1, 6, 0};
      Assertions.assertArrayEquals(output, classObj.bellmanFord(3, vertices, 2));
   }
}
