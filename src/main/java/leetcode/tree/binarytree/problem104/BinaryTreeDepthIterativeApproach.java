package leetcode.tree.binarytree.problem104;

import java.util.LinkedList;
import java.util.Queue;
import leetcode.tree.BinaryTreeNode;

public class BinaryTreeDepthIterativeApproach {


    public int maxDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode node = queue.poll();
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
