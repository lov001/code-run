package practice.binarysearch;

public class MedianOfTwoSortedArrays {

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
      if (c.length % 2 != 0) {
         return c[c.length / 2];
      }
      int mid1 = c[c.length / 2];
      int mid2 = c[(c.length / 2) - 1];
      return (double) (mid1 + mid2) / 2;
   }
}
