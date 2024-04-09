package leetcode.tree.binarytree.problem111;

import java.util.LinkedList;
import java.util.Queue;
import leetcode.tree.BinaryTreeNode;

public class MinimumDepthIterativeApproach {


    public int minDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
