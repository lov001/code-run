package practice.dynamicprogrammingandrecursion;

import java.util.Comparator;

public class Box {

   int height;
   int width;
   int depth;

   public Box(int height, int width, int depth) {
      this.height = height;
      this.width = width;
      this.depth = depth;
   }

   public boolean canBeAbove(Box bottomBox) {
      if (this.height > bottomBox.height) {
         return false;
      } else if (this.depth > bottomBox.depth) {
         return false;
      } else {
         return this.width <= bottomBox.width;
      }
   }
}

class BoxComparator implements Comparator<Box> {

   @Override
   public int compare(Box box1, Box box2) {
      return box2.height - box1.height;
   }
}
