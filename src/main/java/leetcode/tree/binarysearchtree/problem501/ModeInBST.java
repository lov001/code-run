package leetcode.tree.binarysearchtree.problem501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import leetcode.tree.TreeNode;

public class ModeInBST {

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
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
        List<Integer> result = new ArrayList<>();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
            }
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
