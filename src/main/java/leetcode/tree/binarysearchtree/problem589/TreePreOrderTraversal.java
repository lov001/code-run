package leetcode.tree.binarysearchtree.problem589;

import domain.Node;
import java.util.ArrayList;
import java.util.List;

public class TreePreOrderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        if (root.children != null) {
            root.children.forEach(this::preorder);
        }
        return list;
    }
}
