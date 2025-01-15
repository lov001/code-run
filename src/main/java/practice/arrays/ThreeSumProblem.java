package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumProblem {

   public List<List<Integer>> tripletWithTwoPointer(int n, int[] arr) {
      List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(arr);
      for (int i = 0; i < n; i++) {
         if (i > 0 && arr[i] == arr[i - 1]) {
            continue;
         }
         int j = i + 1;
         int k = n - 1;
         while (j < k) {
            int sum = arr[i] + arr[j] + arr[k];
            if (sum == 0) {
               result.add(Arrays.asList(arr[i], arr[j], arr[k]));
               j++;
               k--;
               while (j < k && arr[j] == arr[j - 1]) {
                  j++;
               }
               while (j < k && arr[k] == arr[k + 1]) {
                  k--;
               }
            } else if (sum < 0) {
               j++;
            } else {
               k--;
            }
         }
      }
      return result;
   }

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
