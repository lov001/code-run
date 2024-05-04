package practice.trees;

import java.util.Random;

public class RandomNode {

   public class RandomTreeNode {

      private int data;
      public RandomTreeNode left;
      public RandomTreeNode right;
      private int size = 0;

      public RandomTreeNode(int data) {
         this.data = data;
         size = 1;
      }

      public void insertOrder(int d) {
         if (d <= data) {
            if (left == null) {
               left = new RandomTreeNode(d);
            } else {
               left.insertOrder(d);
            }
         } else {
            if (right == null) {
               right = new RandomTreeNode(d);
            } else {
               right.insertOrder(d);
            }
         }
         size++;
      }

      public RandomTreeNode find(int d) {
         if (d == data) {
            return this;
         } else if (d <= data) {
            return left != null ? left.find(d) : null;
         } else if (d > data) {
            return right != null ? right.find(d) : null;
         }
         return null;
      }

      public RandomTreeNode randomNode() {
         int leftSize = left == null ? 0 : left.size;
         Random random = new Random();
         int index = random.nextInt(leftSize);
         if (index < leftSize) {
            return left.randomNode();
         } else if (index == leftSize) {
            return this;
         } else {
            return right.randomNode();
         }
      }
   }
}
