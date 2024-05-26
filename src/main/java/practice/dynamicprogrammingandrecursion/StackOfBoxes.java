package practice.dynamicprogrammingandrecursion;

import java.util.List;

public class StackOfBoxes {

   public int getMaxHeight(List<Box> boxes) {
      boxes.sort(new BoxComparator());
      int maxHeight = 0;
      // optimization
      int[] stack = new int[boxes.size()];
      for (int i = 0; i < boxes.size(); i++) {
         int height = createStack(boxes, i, stack);
         maxHeight = Math.max(maxHeight, height);
      }
      return maxHeight;
   }

   private int createStack(List<Box> boxes, int bottomBoxIndex, int[] stack) {
      if (bottomBoxIndex < boxes.size() && stack[bottomBoxIndex] > 0) {
         return stack[bottomBoxIndex];
      }
      Box bottomBox = boxes.get(bottomBoxIndex);
      int maxHeight = 0;
      for (int i = bottomBoxIndex + 1; i < boxes.size(); i++) {
         if (boxes.get(i).canBeAbove(bottomBox)) {
            int height = createStack(boxes, i, stack);
            maxHeight = Math.max(height, maxHeight);
         }
      }
      maxHeight += bottomBox.height;
      stack[bottomBoxIndex] = maxHeight;
      return maxHeight;
   }
}
