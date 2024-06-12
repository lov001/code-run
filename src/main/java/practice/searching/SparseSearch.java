package practice.searching;

public class SparseSearch {

   public int search(String[] array, String word) {
      int index = 0;
      for (String item : array) {
         if (item.equalsIgnoreCase(word)) {
            return index;
         }
         index++;
      }
      return -1;
   }
}
