package practice.binarysearch;

public class MedianOfTwoSortedArrays {


   public double medianWithConstantSpace(int[] a, int[] b) {
      int n1 = a.length;
      int n2 = b.length;
      int i = 0;
      int j = 0;
      int count = 0;
      int n = (n1 + n2);
      int index2 = n / 2;
      int index1 = index2 - 1;
      int index1Element = -1;
      int index2Element = -1;
      while (i < n1 && j < n2) {
         if (a[i] < b[j]) {
            if (count == index1) {
               index1Element = a[i];
            }
            if (count == index2) {
               index2Element = a[i];
            }
            i++;
         } else {
            if (count == index1) {
               index1Element = b[j];
            }
            if (count == index2) {
               index2Element = b[j];
            }
            j++;
         }
         count++;
      }
      while (i < n1) {
         if (count == index1) {
            index1Element = a[i];
         }
         if (count == index2) {
            index2Element = a[i];
         }
         i++;
         count++;
      }
      while (j < n2) {
         if (count == index1) {
            index1Element = b[j];
         }
         if (count == index2) {
            index2Element = b[j];
         }
         j++;
         count++;
      }
      if (n % 2 == 1) {
         return index2Element;
      }
      return (double) (index1Element + index2Element) / 2;
   }

   public double median(int[] a, int[] b) {
      int n = a.length;
      int m = b.length;
      int[] c = new int[n + m];
      int i = 0;
      int j = 0;
      int index = 0;
      while (i < n && j < m) {
         if (a[i] < b[j]) {
            c[index++] = a[i++];
         } else {
            c[index++] = b[j++];
         }
      }
      while (i < n) {
         c[index++] = a[i++];
      }
      while (j < m) {
         c[index++] = b[j++];
      }
      if (c.length % 2 == 1) {
         return c[c.length / 2];
      }
      int mid1 = c[c.length / 2];
      int mid2 = c[(c.length / 2) - 1];
      return (double) (mid1 + mid2) / 2;
   }
}
