package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {

   public int team(int[] skill, int n) {
      return mergeSort(skill, 0, n - 1);
   }

   private int mergeSort(int[] skill, int low, int end) {
      int count = 0;
      if (low >= end) {
         return count;
      }
      int mid = (low + end) / 2;
      count += mergeSort(skill, low, mid);
      count += mergeSort(skill, mid + 1, end);
      count += countPairs(skill, low, mid, end);
      merge(skill, low, mid, end);
      return count;
   }

   private void merge(int[] skill, int low, int mid, int high) {
      List<Integer> temp = new ArrayList<>();
      int left = low;
      int right = mid + 1;
      while (left <= mid && right <= high) {
         if (skill[left] <= skill[right]) {
            temp.add(skill[left]);
            left++;
         } else {
            temp.add(skill[right]);
            right++;
         }
      }
      while (left <= mid) {
         temp.add(skill[left]);
         left++;
      }
      while (right <= high) {
         temp.add(skill[right]);
         right++;
      }
      for (int i = low; i <= high; i++) {
         skill[i] = temp.get(i - low);
      }
   }

   private int countPairs(int[] skills, int low, int mid, int high) {
      int count = 0;
      int right = mid + 1;
      for (int i = low; i <= mid; i++) {
         while (right <= high && (skills[i] > 2 * skills[right])) {
            right++;
         }
         count += (right - (mid + 1));
      }
      return count;
   }

   public int teamBruteForce(int[] skill, int n) {
      int count = 0;
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            if (skill[i] > 2 * skill[j]) {
               count++;
            }
         }
      }
      return count;
   }
}
