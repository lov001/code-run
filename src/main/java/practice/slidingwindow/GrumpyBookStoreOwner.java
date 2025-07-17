package practice.slidingwindow;

public class GrumpyBookStoreOwner {

   public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int left = 0;
      int right = 0;
      int maxWindow = 0;
      int window = 0;
      int n = grumpy.length;
      int satisfied = 0;
      while (right < n) {
         if (grumpy[right] == 1) {
            window += customers[right];
         } else {
            satisfied += customers[right];
         }
         if ((right - left + 1) > minutes) {
            if (grumpy[left] == 1) {
               window -= customers[left];
            }
            left++;
         }
         maxWindow = Math.max(maxWindow, window);
         right++;
      }
      return satisfied + maxWindow;
   }
}
