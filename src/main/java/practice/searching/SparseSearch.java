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

   public int searchOptimised(String[] array, String word) {
      if (array == null || word == null || word.isEmpty()) {
         return -1;
      }
      return search(array, word, 0, array.length - 1);
   }

   private int search(String[] array, String word, int first, int last) {
      if (last < first) {
         return -1;
      }
      int mid = first + (last - first) / 2;
      if (array[mid].isEmpty()) {
         int left = mid - 1;
         int right = mid + 1;
         while (true) {
            if (left < first && right > last) {
               return -1;
            } else if (left >= first && !array[left].isEmpty()) {
               mid = left;
               break;
            } else if (right <= last && !array[right].isEmpty()) {
               mid = right;
               break;
            }
            left--;
            right++;
         }
      }
      if (array[mid].equalsIgnoreCase(word)) {
         return mid;
      } else if (array[mid].compareTo(word) < 0) {
         return search(array, word, mid + 1, last);
      } else {
         return search(array, word, first, mid - 1);
      }
   }
}
