package practice.bitmanipulation;

public class SingleNumberII {

   public int elementThatAppearsOnce(int[] arr) {
      int result = 0;
      for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
         int count = 0;
         for (int element : arr) {
            if ((element & (1 << bitIndex)) != 0) {
               count++;
            }
         }
         if (count % 3 == 1) {
            result = result | (1 << bitIndex);
         }
      }
      return result;
   }
}
