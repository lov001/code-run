package practice.dynamicprogramming;

import java.util.Objects;

public class Point {

   int row;
   int column;

   public Point(int row, int column) {
      this.row = row;
      this.column = column;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }
      Point point = (Point) o;
      return row == point.row && column == point.column;
   }

   @Override
   public int hashCode() {
      return Objects.hash(row, column);
   }
}
