package practice.arrays;

public class SpiralMatrix {

   public int[] spiralMatrix(int[][] matrix) {
      int n = matrix.length;
      int m = matrix[0].length;
      int[] answer = new int[n * m];
      int top = 0;
      int bottom = n - 1;
      int left = 0;
      int right = m - 1;
      int index = 0;
      while (top <= bottom && left <= right) {
         // right
         for (int i = left; i <= right; i++) {
            answer[index++] = matrix[top][i];
         }
         top++;
         // bottom
         for (int i = top; i <= bottom; i++) {
            answer[index++] = matrix[i][right];
         }
         right--;
         // left
         if (top <= bottom) {
            for (int i = right; i >= left; i--) {
               answer[index++] = matrix[bottom][i];
            }
            bottom--;
         }
         // top
         if (left <= right) {
            for (int i = bottom; i >= top; i--) {
               answer[index++] = matrix[i][left];
            }
            left++;
         }
      }
      return answer;
   }
}
