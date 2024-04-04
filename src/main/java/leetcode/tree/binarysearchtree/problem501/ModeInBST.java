package leetcode.tree.binarysearchtree.problem501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class ModeInBST {

    public int[] findMode(BinaryTreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            if (!map.containsKey(node.val)) {
                map.put(node.val, 1);
            } else {
                map.put(node.val, map.get(node.val) + 1);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result.clear();
                result.add(entry.getKey());
            } else if (entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
