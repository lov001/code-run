package practice.arrays;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

   public ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n,
      ArrayList<Integer> arr2, int m) {
      ArrayList<Integer> result = new ArrayList<>();
      boolean[] visited = new boolean[Math.max(n, m)];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (arr1.get(i).equals(arr2.get(j)) && !visited[j]) {
               result.add(arr1.get(i));
               visited[j] = true;
               break;
            }
            if (arr2.get(j) > arr1.get(i)) {
               break;
            }
         }
      }
      return result;
   }

   public ArrayList<Integer> findArrayIntersectionOptimised(ArrayList<Integer> arr1, int n,
      ArrayList<Integer> arr2, int m) {
      ArrayList<Integer> result = new ArrayList<>();
      int i = 0;
      int j = 0;
      while (i < n && j < m) {
         if (arr1.get(i).equals(arr2.get(j))) {
            result.add(arr1.get(i));
            i++;
            j++;
         } else if (arr1.get(i) < arr2.get(j)) {
            i++;
         } else {
            j++;
         }
      }
      return result;
   }
}
