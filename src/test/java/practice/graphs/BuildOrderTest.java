package practice.graphs;

import java.util.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.graphs.BuildOrder.Project;

public class BuildOrderTest {

   BuildOrder classObj = new BuildOrder();

   @Test
   void test_findBuildOrder_expectList_whenNumberOfProjectsIs6() {
      String[] projects = {"a", "b", "c", "d", "e", "f"};
      String[][] dependencies = {{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}};
      String[] expected = {"e", "f", "b", "a", "d", "c"};
      Project[] actual = classObj.findBuildOrder(projects, dependencies);
      Assertions.assertEquals(expected[0], actual[0].getName());
      Assertions.assertEquals(expected[1], actual[1].getName());
      Assertions.assertEquals(expected[2], actual[2].getName());
      Assertions.assertEquals(expected[3], actual[3].getName());
      Assertions.assertEquals(expected[4], actual[4].getName());
      Assertions.assertEquals(expected[5], actual[5].getName());
   }

   @Test
   void test_findBuildOrder_expectList_whenNumberOfProjectsIs7() {
      String[] projects = {"a", "b", "c", "d", "e", "f", "g"};
      String[][] dependencies = {{"d", "g"}, {"f", "b"}, {"f", "c"}, {"f", "a"}, {"c", "a"},
         {"b", "a"}, {"a", "e"}, {"b", "e"}};
      String[] expected = {"d", "f", "g", "b", "c", "a", "e"};
      Project[] actual = classObj.findBuildOrder(projects, dependencies);
      Assertions.assertEquals(expected[0], actual[0].getName());
      Assertions.assertEquals(expected[1], actual[1].getName());
      Assertions.assertEquals(expected[2], actual[2].getName());
      Assertions.assertEquals(expected[3], actual[3].getName());
      Assertions.assertEquals(expected[4], actual[4].getName());
      Assertions.assertEquals(expected[5], actual[5].getName());
      Assertions.assertEquals(expected[6], actual[6].getName());
   }

   @Test
   void test_findBuildOrderUsingDFS_expectList_whenNumberOfProjectsIs6() {
      String[] projects = {"a", "b", "c", "d", "e", "f"};
      String[][] dependencies = {{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}};
      String[] expected = {"f", "e", "b", "a", "d", "c"};
      Stack<Project> actual = classObj.findBuildOrderUsingDFS(projects, dependencies);
      Assertions.assertEquals(expected[0], actual.pop().getName());
      Assertions.assertEquals(expected[1], actual.pop().getName());
      Assertions.assertEquals(expected[2], actual.pop().getName());
      Assertions.assertEquals(expected[3], actual.pop().getName());
      Assertions.assertEquals(expected[4], actual.pop().getName());
      Assertions.assertEquals(expected[5], actual.pop().getName());
   }

   @Test
   void test_findBuildOrderUsingDFS_expectList_whenNumberOfProjectsIs7() {
      String[] projects = {"a", "b", "c", "d", "e", "f", "g"};
      String[][] dependencies = {{"d", "g"}, {"f", "b"}, {"f", "c"}, {"f", "a"}, {"c", "a"},
         {"b", "a"}, {"a", "e"}, {"b", "e"}};
      String[] expected = {"f", "d", "g", "c", "b", "a", "e"};
      Stack<Project> actual = classObj.findBuildOrderUsingDFS(projects, dependencies);
      Assertions.assertEquals(expected[0], actual.pop().getName());
      Assertions.assertEquals(expected[1], actual.pop().getName());
      Assertions.assertEquals(expected[2], actual.pop().getName());
      Assertions.assertEquals(expected[3], actual.pop().getName());
      Assertions.assertEquals(expected[4], actual.pop().getName());
      Assertions.assertEquals(expected[5], actual.pop().getName());
      Assertions.assertEquals(expected[6], actual.pop().getName());
   }
}
