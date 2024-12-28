package practice.arrays;

public class SecondLargestAndSmallestElementInArray {

   public int[] getSecondOrderElements(int n, int[] a) {
      int[] output = new int[2];
      output[0] = -1;
      output[1] = Integer.MAX_VALUE;
      int largest = a[0];
      int smallest = a[0];
      for (int i = 1; i < n; i++) {
         if (a[i] > largest) {
            output[0] = largest;
            largest = a[i];
         } else if (a[i] < largest && a[i] > output[0]) {
            output[0] = a[i];
         }
         if (a[i] < smallest) {
            output[1] = smallest;
            smallest = a[i];
         } else if (a[i] != smallest && a[i] < output[1]) {
            output[1] = a[i];
         }
      }
      return output;
   }
}
