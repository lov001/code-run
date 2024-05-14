package practice.bitmanipulation;

public class BitInsertion {

   public int insert(int N, int M, int j, int i) {
      int allOnes = ~0;
      int left = allOnes << j;
      int right = (1 << i) - 1;
      int mask = left | right;
      int clearedBits = N & mask;
      int mShifted = M << i;
      return clearedBits | mShifted;
   }
}
