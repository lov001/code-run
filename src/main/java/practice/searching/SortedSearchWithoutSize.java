package practice.searching;

public class SortedSearchWithoutSize {

   public int search(Listy list, int value) {
      int index = 1;
      while (list.elementAt(index) != -1 && list.elementAt(index) < value) {
         index *= 2;
      }
      return binarySearch(list, value, index / 2, index);
   }

   private int binarySearch(Listy list, int value, int low, int high) {
      int mid;

      while (low <= high) {
         mid = (low + high) / 2;
         int middleElement = list.elementAt(mid);
         if (middleElement == value) {
            return mid;
         } else if (middleElement == -1 || middleElement > value) {
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return -1;
   }
}
