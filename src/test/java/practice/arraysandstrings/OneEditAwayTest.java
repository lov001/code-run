package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneEditAwayTest {

   OneEditAway classObj = new OneEditAway();

   @Test
   void test_isOneEditAway_expectTrue_whenOnlyOneCharDeleted(){
      String input1 = "pale";
      String input2 = "ple";
      Assertions.assertTrue(classObj.isOneEditAway(input1, input2));
      Assertions.assertTrue(classObj.oneEditAway(input1, input2));
      Assertions.assertTrue(classObj.oneEditAway2(input1, input2));
   }

   @Test
   void test_isOneEditAway_expectTrue_whenOnlyOneCharAdded(){
      String input1 = "pales";
      String input2 = "pale";
      Assertions.assertTrue(classObj.isOneEditAway(input1, input2));
      Assertions.assertTrue(classObj.oneEditAway(input1, input2));
      Assertions.assertTrue(classObj.oneEditAway2(input1, input2));
   }

   @Test
   void test_isOneEditAway_expectTrue_whenOnlyOneCharChanged(){
      String input1 = "bale";
      String input2 = "pale";
      Assertions.assertTrue(classObj.isOneEditAway(input1, input2));
      Assertions.assertTrue(classObj.oneEditAway(input1, input2));
      Assertions.assertTrue(classObj.oneEditAway2(input1, input2));
   }

   @Test
   void test_isOneEditAway_expectFalse_whenOnlyTwoCharChanged(){
      String input1 = "pale";
      String input2 = "bake";
      Assertions.assertFalse(classObj.isOneEditAway(input1, input2));
      Assertions.assertFalse(classObj.oneEditAway(input1, input2));
      Assertions.assertFalse(classObj.oneEditAway2(input1, input2));
   }

}
