package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class AlternateNumbers {


   public int[] alternateNumbers(int[] a) {
      int n = a.length;
      int[] ans = new int[n];
      int negIndex = 1;
      int posIndex = 0;
      for (int element : a) {
         if (element < 0) {
            ans[negIndex] = element;
            negIndex += 2;
         } else {
            ans[posIndex] = element;
            posIndex += 2;
         }
      }
      return ans;
   }

   public int[] alternateNumbersBruteForce(int[] a) {
      int n = a.length;
      int[] positive = new int[n / 2];
      int[] negative = new int[n / 2];
      int negIndex = 0;
      int posIndex = 0;
      for (int element : a) {
         if (element < 0) {
            negative[negIndex++] = element;
         } else {
            positive[posIndex++] = element;
         }
      }
      for (int i = 0; i < n / 2; i++) {
         a[2 * i] = positive[i];
         a[2 * i + 1] = negative[i];
      }
      return a;
   }

   public int[] alternateNumbersWithoutEqualCount(int[] a) {
      List<Integer> positive = new ArrayList<>();
      List<Integer> negative = new ArrayList<>();
      for (int element : a) {
         if (element < 0) {
            negative.add(element);
         } else {
            positive.add(element);
         }
      }
      int smallerSize = Math.min(positive.size(), negative.size());
      int i = 0;
      for (; i < smallerSize; i++) {
         a[2 * i] = positive.get(i);
         a[2 * i + 1] = negative.get(i);
      }
      i = smallerSize * 2;
      if (positive.size() > negative.size()) {
         while (smallerSize < positive.size()) {
            a[i] = positive.get(smallerSize);
            i++;
            smallerSize++;
         }
      } else {
         while (smallerSize < negative.size()) {
            a[i] = negative.get(smallerSize);
            smallerSize++;
         }
      }
      return a;
   }
}
