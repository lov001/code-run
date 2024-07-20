package practice.graphs;

public class Pair implements Comparable<Pair> {

   int first;
   int second;

   public Pair(int first, int second) {
      this.first = first;
      this.second = second;
   }

   @Override
   public int compareTo(Pair other) {
      if (this.second != other.second) {
         return Integer.compare(this.second, other.second);
      } else {
         return Integer.compare(this.first, other.first);
      }
   }
}