package practice.bitmanipulation;

import java.util.ArrayList;

public class PowerSet {

   // TC: N * 2^N, SC: 2^N * N
   public ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> arr) {
      int n = arr.size();
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
      int numberOfSubsets = 1 << n;
      for (int num = 0; num < numberOfSubsets; num++) {
         ArrayList<Integer> list = new ArrayList<>();
         for (int i = 0; i < n; i++) {
            if ((num & (1 << i)) != 0) {
               list.add(arr.get(i));
            }
         }
         result.add(list);
      }
      return result;
   }
}
