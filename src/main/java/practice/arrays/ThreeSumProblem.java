package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumProblem {

   public List<List<Integer>> tripletWithHashing(int n, int[] arr) {
      Set<List<Integer>> result = new HashSet<>();
      for (int i = 0; i < n; i++) {
         Set<Integer> hashSet = new HashSet<>();
         for (int j = i + 1; j < n; j++) {
            int sum = -(arr[i] + arr[j]);
            if (hashSet.contains(sum)) {
               List<Integer> sublist = Arrays.asList(arr[i], arr[j], sum);
               Collections.sort(sublist);
               result.add(sublist);
            }
            hashSet.add(arr[j]);
         }
      }
      return new ArrayList<>(result);
   }

   public List<List<Integer>> tripletBruteForce(int n, int[] arr) {
      Set<List<Integer>> result = new HashSet<>();
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
               if (arr[i] + arr[j] + arr[k] == 0) {
                  List<Integer> sublist = new ArrayList<>();
                  sublist.add(arr[i]);
                  sublist.add(arr[j]);
                  sublist.add(arr[k]);
                  Collections.sort(sublist);
                  result.add(sublist);
               }
            }

         }
      }
      return new ArrayList<>(result);
   }
}
