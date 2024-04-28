package practice.trees;

public class CheckSubtree {


   public boolean containsTreeOptimal(BinaryTreeNode t1, BinaryTreeNode t2) {
      if (t2 == null) {
         return true;
      }
      return subtree(t1, t2);
   }

   private boolean subtree(BinaryTreeNode t1, BinaryTreeNode t2) {
      if (t1 == null) {
         return false;
      } else if (t1.data == t2.data && matchTree(t1, t2)) {
         return true;
      }
      return subtree(t1.left, t2) || subtree(t1.right, t2);
   }

   private boolean matchTree(BinaryTreeNode t1, BinaryTreeNode t2) {
      if (t1 == null && t2 == null) {
         return true;
      } else if (t1 == null || t2 == null) {
         return false;
      } else if (t1.data != t2.data) {
         return false;
      } else {
         return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
      }
   }

   public boolean containsTree(BinaryTreeNode t1, BinaryTreeNode t2) {
      StringBuilder string1 = new StringBuilder();
      StringBuilder string2 = new StringBuilder();
      getOrderedString(t1, string1);
      getOrderedString(t2, string2);
      return string1.indexOf(string2.toString()) != -1;
   }

   private void getOrderedString(BinaryTreeNode node, StringBuilder str) {
      if (node == null) {
         str.append("X");
         return;
      }
      str.append(node.data).append(" ");
      getOrderedString(node.left, str);
      getOrderedString(node.right, str);
   }
}
