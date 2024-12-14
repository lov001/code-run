package practice.binarysearch;

public class MedianOfTwoSortedArrays {

   public double medianUsingBinarySearch(int[] a, int[] b) {
      int n1 = a.length;
      int n2 = b.length;
      int n = (n1 + n2);
      if (n1 > n2) {
         return medianUsingBinarySearch(b, a);
      }
      int low = 0;
      int high = n1;
      int left = (n1 + n2 + 1) / 2;
      while (low <= high) {
         int mid1 = (low + high) / 2;
         int mid2 = left - mid1;
         int l1 = Integer.MIN_VALUE;
         int l2 = Integer.MIN_VALUE;
         int r1 = Integer.MAX_VALUE;
         int r2 = Integer.MAX_VALUE;
         if (mid1 < n1) {
            r1 = a[mid1];
         }
         if (mid2 < n2) {
            r2 = b[mid2];
         }
         if (mid1 - 1 >= 0) {
            l1 = a[mid1 - 1];
         }
         if (mid2 - 1 >= 0) {
            l2 = b[mid2 - 1];
         }

         if (l1 <= r2 && l2 <= r1) {
            if (n % 2 == 1) {
               return Math.max(l1, l2);
            }
            return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
         } else if (l1 > r2) {
            high = mid1 - 1;
         } else {
            low = mid1 + 1;
         }
      }
      return 0;
   }

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
         if (index1Element != -1 && index2Element != -1) {
            break;
         }
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
         if (index1Element != -1 && index2Element != -1) {
            break;
         }
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
         if (index1Element != -1 && index2Element != -1) {
            break;
         }
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
