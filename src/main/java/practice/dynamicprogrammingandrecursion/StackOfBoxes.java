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

   public int createStack(List<Box> boxes) {
      boxes.sort(new BoxComparator());
      int[] stack = new int[boxes.size()];
      return createStack(boxes, null, 0, stack);
   }

   private int createStack(List<Box> boxes, Box bottom, int offset, int[] stack) {
      if (offset >= boxes.size()) {
         return 0;
      }
      // height with this box as bottom
      int heightWithBottom = 0;
      Box newBottom = boxes.get(offset);
      if (bottom == null || newBottom.canBeAbove(bottom)) {
         if (stack[offset] == 0) {
            stack[offset] = createStack(boxes, newBottom, offset + 1, stack);
            stack[offset] += newBottom.height;
         }
         heightWithBottom = stack[offset];
      }

      // height without this box as bottom
      int heightWithoutBottom = createStack(boxes, newBottom, offset + 1, stack);
      return Math.max(heightWithBottom, heightWithoutBottom);
   }
}
