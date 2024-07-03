package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSTraversal {

   public List<Integer> dfsTraversalUnDirected(int V, List<List<Integer>> adjacencyList) {
      List<Integer> dfs = new ArrayList<>();
      boolean[] isVisited = new boolean[V];
      Stack<Integer> stack = new Stack<>();
      stack.push(0);
      isVisited[0] = true;
      helper(stack, adjacencyList, isVisited, dfs);
      return dfs;
   }

   private void helper(Stack<Integer> stack, List<List<Integer>> adjacencyList,
      boolean[] isVisited, List<Integer> dfs) {
      while (!stack.isEmpty()) {
         Integer node = stack.pop();
         dfs.add(node);
         List<Integer> children = adjacencyList.get(node);
         for (Integer child : children) {
            if (!isVisited[child]) {
               isVisited[child] = true;
               stack.push(child);
               helper(stack, adjacencyList, isVisited, dfs);
            }
         }
      }
   }
}
