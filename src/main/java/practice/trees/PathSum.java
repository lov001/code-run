package practice.trees;

public class PathSum {

   public int paths(BinaryTreeNode root, int targetSum) {
      if (root == null) {
         return 0;
      }
      int pathsFromRoot = countPathsWithSumFromNode(root, targetSum, 0);

      int pathsOnLeft = countPathsWithSumFromNode(root.left, targetSum, pathsFromRoot);
      int pathsOnRight = countPathsWithSumFromNode(root.right, targetSum, pathsFromRoot);
      return pathsFromRoot + pathsOnLeft + pathsOnRight;
   }

   private int countPathsWithSumFromNode(BinaryTreeNode node, int targetSum, int currentSum) {
      if (node == null) {
         return 0;
      }
      currentSum += node.data;
      int totalPaths = 0;
      if (targetSum == currentSum) {
         totalPaths++;
      }
      totalPaths += countPathsWithSumFromNode(node.left, targetSum, currentSum);
      totalPaths += countPathsWithSumFromNode(node.right, targetSum, currentSum);
      return totalPaths;
   }
}
