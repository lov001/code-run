package practice.graphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

   public int[] findOrder(int N, int m, List<List<Integer>> prerequisites) {
      List<List<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < N; i++) {
         adj.add(new ArrayList<>());
      }
      for (List<Integer> prerequisite : prerequisites) {
         adj.get(prerequisite.get(1)).add(prerequisite.get(0));
      }
      int[] inDegree = new int[N];
      for (List<Integer> integers : adj) {
         for (Integer j : integers) {
            inDegree[j]++;
         }
      }
      Queue<Integer> queue = new LinkedList<>();
      List<Integer> topologicalOrdering = new ArrayList<>();
      for (int i = 0; i < inDegree.length; i++) {
         if (inDegree[i] == 0) {
            queue.add(i);
            topologicalOrdering.add(i);
         }
      }
      while (!queue.isEmpty()) {
         int node = queue.poll();
         for (Integer adjacent : adj.get(node)) {
            inDegree[adjacent]--;
            if (inDegree[adjacent] == 0) {
               queue.add(adjacent);
               topologicalOrdering.add(adjacent);
            }
         }
      }
      if (topologicalOrdering.size() == N) {
         return topologicalOrdering.stream().mapToInt(value -> Integer.parseInt(
            String.valueOf(value))).toArray();
      }
      return new int[]{};
   }
}
