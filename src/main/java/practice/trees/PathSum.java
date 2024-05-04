package practice.trees;

import java.util.HashMap;

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

   public int countPathsWithSum(BinaryTreeNode root, int targetSum) {
      return countPathsWithSum(root, targetSum, 0, new HashMap<>());
   }

   private int countPathsWithSum(BinaryTreeNode node, int targetSum, int runningSum,
      HashMap<Integer, Integer> map) {
      if (node == null) {
         return 0;
      }
      runningSum += node.data;
      int sum = runningSum - targetSum;
      int totalPaths = map.getOrDefault(sum, 0);
      if (runningSum == targetSum) {
         totalPaths++;
      }

      incrementHashTableCount(map, runningSum, 1);
      totalPaths += countPathsWithSum(node.left, targetSum, runningSum, map);
      totalPaths += countPathsWithSum(node.right, targetSum, runningSum, map);
      incrementHashTableCount(map, runningSum, -1);
      return totalPaths;
   }

   private void incrementHashTableCount(HashMap<Integer, Integer> map, int key, int delta) {
      int newCount = map.getOrDefault(key, 0) + delta;
      if (newCount == 0) {
         map.remove(key);
      } else {
         map.put(key, newCount);
      }
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
