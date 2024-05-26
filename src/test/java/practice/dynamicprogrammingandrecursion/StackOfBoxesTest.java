package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackOfBoxesTest {

   StackOfBoxes classObj = new StackOfBoxes();

   @Test
   void test_getMaxHeight_expect11_when4Boxes() {
      Box box1 = new Box(2, 4, 6);
      Box box2 = new Box(5, 7, 7);
      Box box3 = new Box(1, 1, 1);
      Box box4 = new Box(3, 5, 7);
      List<Box> boxes = new ArrayList<>();
      boxes.add(box1);
      boxes.add(box2);
      boxes.add(box3);
      boxes.add(box4);
      Assertions.assertEquals(11, classObj.getMaxHeight(boxes));
      Assertions.assertEquals(11, classObj.createStack(boxes));
   }

   @Test
   void test_getMaxHeight_expect5_whenOnlyOneBoxe() {
      Box box2 = new Box(5, 7, 7);
      List<Box> boxes = new ArrayList<>();
      boxes.add(box2);
      Assertions.assertEquals(5, classObj.getMaxHeight(boxes));
      Assertions.assertEquals(5, classObj.createStack(boxes));
   }

   @Test
   void test_getMaxHeight_expect7_whenOnlyTwoBoxesSatisfyTheConstraint() {
      Box box1 = new Box(2, 0, 6);
      Box box2 = new Box(5, 2, 7);
      Box box3 = new Box(1, 1, 1);
      Box box4 = new Box(3, 5, 7);
      List<Box> boxes = new ArrayList<>();
      boxes.add(box1);
      boxes.add(box2);
      boxes.add(box3);
      boxes.add(box4);
      Assertions.assertEquals(7, classObj.getMaxHeight(boxes));
      Assertions.assertEquals(7, classObj.createStack(boxes));
   }
}
