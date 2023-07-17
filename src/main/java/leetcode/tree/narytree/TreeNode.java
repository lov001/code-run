package leetcode.tree.narytree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

  public int val;
  public List<TreeNode> children;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
    this.children = new ArrayList<>();
  }

  public TreeNode(int val, List<TreeNode> children) {
    this.val = val;
    this.children = children;
  }

  public int getVal() {
    return val;
  }

  public List<TreeNode> getChildren() {
    return this.children;
  }

}
