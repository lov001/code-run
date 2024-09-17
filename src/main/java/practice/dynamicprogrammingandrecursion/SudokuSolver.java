package practice.dynamicprogrammingandrecursion;

public class SudokuSolver {

   public void solveSudoku(char[][] board) {
      solve(board);
   }

   private boolean solve(char[][] board) {
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++) {

            if (board[i][j] == '.') {
               for (char k = '1'; k <= '9'; k++) {
                  if (isValidBoard(i, j, board, k)) {
                     board[i][j] = k;
                     if (solve(board)) {
                        return true;
                     } else {
                        board[i][j] = '.';
                     }
                  }
               }
               return false;
            }
         }
      }
      return true;
   }

   private boolean isValidBoard(int row, int col, char[][] board, int num) {
      for (int i = 0; i < 9; i++) {
         if (board[i][col] == num) {
            return false;
         }
         if (board[row][i] == num) {
            return false;
         }
         if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
            return false;
         }
      }
      return true;
   }
}
