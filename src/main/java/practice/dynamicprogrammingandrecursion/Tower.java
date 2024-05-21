package practice.dynamicprogrammingandrecursion;

import java.util.Stack;

public class Tower {

   private Stack<Integer> disks;
   private int index;

   public Tower(int i) {
      this.disks = new Stack<>();
      index = i;
   }

   public int getIndex() {
      return this.index;
   }

   public void add(int d) {
      if (!disks.isEmpty() && disks.peek() <= d) {
         System.out.println("Error placing disk" + d);
      } else {
         disks.push(d);
      }
   }

   public void moveToTop(Tower t) {
      int top = disks.pop();
      t.add(top);
   }

   public void moveDisks(int n, Tower destination, Tower buffer) {
      moveDisks(n - 1, buffer, destination);
      moveToTop(destination);
      buffer.moveDisks(n - 1, destination, this);
   }
}
