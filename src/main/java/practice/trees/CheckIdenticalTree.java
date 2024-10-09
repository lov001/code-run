package practice.trees;

public class CheckIdenticalTree {

   public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
      if (p == null || q == null) {
         return p == q;
      }
      return p.data == q.data && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
   }
}
