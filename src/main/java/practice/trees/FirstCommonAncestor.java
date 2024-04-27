package practice.trees;


public class FirstCommonAncestor {

   public BinaryTreeNode commonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
      if (!covers(root, p) || !covers(root, q)) {
         return null;
      }
      return ancestorHelper(root, p, q);
   }

   private BinaryTreeNode ancestorHelper(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
      if (root == null || root == p || root == q) {
         return root;
      }
      boolean pIsOnLeft = covers(root.left, p);
      boolean qIsOnLeft = covers(root.left, q);
      if (pIsOnLeft != qIsOnLeft) {
         return root;
      }
      BinaryTreeNode childSide = pIsOnLeft ? root.left : root.right;
      return ancestorHelper(childSide, p, q);
   }

   /**
    * When node has links to parent approach
    */
//   public BinaryTreeNode commonAncestor(BinaryTreeNode p, BinaryTreeNode q) {
//      BinaryTreeHeight helper = new BinaryTreeHeight();
//      int leftHeight = helper.height(p);
//      int rightHeight = helper.height(q);
//      int delta = leftHeight - rightHeight;
//      BinaryTreeNode first = delta > 0 ? q: p;
//      BinaryTreeNode second = delta > 0 ? p: q;
//      second = goUpBy(second, Math.abs(delta));
//
//      while (first != second && first != null && second != null) {
//         first = first.parent;
//         second = second.parent;
//      }
//      return first == null || second == null ? null : first;
//   }
//
//   private BinaryTreeNode goUpBy(BinaryTreeNode node, int delta){
//      while (delta > 0 && node != null) {
//         node = node.parent;
//         delta--;
//      }
//      return node;
//   }

   /**
    * When node has links to parent approach optimised approach
    */
//   public BinaryTreeNode commonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
//      if (!covers(root, p) || !covers(root, q)) {
//         return null;
//      } else if (covers(p, q)) {
//         return p;
//      } else if (covers(q, p)) {
//         return q;
//      }
//      BinaryTreeNode parent = p.parent;
//      BinaryTreeNode sibling = getSibling(p);
//      while (!covers(sibling, q)) {
//         sibling = getSibling(parent);
//         parent = parent.parent;
//      }
//      return parent;
//   }
//
   private boolean covers(BinaryTreeNode root, BinaryTreeNode p) {
      if (root == null) {
         return false;
      }
      if (root == p) {
         return true;
      }
      return covers(root.left, p) || covers(root.right, p);
   }
//
//   private BinaryTreeNode getSibling(BinaryTreeNode node) {
//      if (node == null || node.parent == null) {
//         return null;
//      }
//      BinaryTreeNode parent = node.parent;
//      return parent.left == node ? parent.right : parent.left;
//   }
}