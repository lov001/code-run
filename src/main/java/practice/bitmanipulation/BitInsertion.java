package practice.bitmanipulation;

public class BitInsertion {

   public int insert(int N, int M, int j, int i) {
      int result;
      M = M << i;
      result = N | M;
      return result;
   }
}
