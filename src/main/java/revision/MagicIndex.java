package revision;

import java.util.ArrayList;

public class MagicIndex {

   public int magicIndex(ArrayList<Integer> a, int n) {
      for (int i = 0; i < n; i++) {
         if (a.get(i) == i) {
            return i;
         }
      }
      return -1;
   }
}
