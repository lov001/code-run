package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NQueen {

   public List<List<String>> solveNQueensOptimised(int n) {
      List<List<String>> output = new ArrayList<>();
      int[] leftRow = new int[n];
      int[] upperDiagonal = new int[2 * n - 1];
      int[] lowerDiagonal = new int[2 * n - 1];
      char[][] board = new char[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            board[i][j] = '.';
         }
      }
      solve(0, board, output, leftRow, upperDiagonal, lowerDiagonal);
      return output;
   }

   private void solve(int column, char[][] board, List<List<String>> output, int[] leftRow,
      int[] upperDiagonal, int[] lowerDiagonal) {
      if (column == board.length) {
         System.out.println("Board:   " + Arrays.deepToString(board));
         output.add(constructBoard(board));
         return;
      }
      for (int row = 0; row < board.length; row++) {
         if (leftRow[row] == 0 && upperDiagonal[(board.length - 1) + (column - row)] == 0
            && lowerDiagonal[row + column] == 0) {
            board[row][column] = 'Q';
            leftRow[row] = 1;
            lowerDiagonal[row + column] = 1;
            upperDiagonal[board.length - 1 + column - row] = 1;
            solve(column + 1, board, output, leftRow, upperDiagonal, lowerDiagonal);
            board[row][column] = '.';
            leftRow[row] = 0;
            lowerDiagonal[row + column] = 0;
            upperDiagonal[board.length - 1 + column - row] = 0;
         }
      }
   }

   public List<List<String>> solveNQueens(int n) {
      List<List<String>> output = new ArrayList<>();
      char[][] board = new char[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            board[i][j] = '.';
         }
      }
      helper(0, board, output);
      return output;
   }

   private void helper(int column, char[][] board, List<List<String>> output) {
      if (column == board.length) {
         output.add(constructBoard(board));
         return;
      }
      for (int row = 0; row < board.length; row++) {
         if (isValidPlacement(row, column, board)) {
            board[row][column] = 'Q';
            helper(column + 1, board, output);
            board[row][column] = '.';
         }
      }
   }

   private boolean isValidPlacement(int row, int column, char[][] board) {
      int duplicateRow = row;
      int duplicateColumn = column;
      // since we are moving L -> R and from T -> B, we only need to check left side as right and bottom side
      // is not yet filled. So we need to check only upper left diagonal, left row and lower left diagonal.

      // check for upper diagonal
      while (row >= 0 && column >= 0) {
         if (board[row][column] == 'Q') {
            return false;
         }
         row--;
         column--;
      }
      row = duplicateRow;
      column = duplicateColumn;

      // check for left row
      while (column >= 0) {
         if (board[row][column] == 'Q') {
            return false;
         }
         column--;
      }

      column = duplicateColumn;

      // check for lower diagonal
      while (row < board.length && column >= 0) {
         if (board[row][column] == 'Q') {
            return false;
         }
         row++;
         column--;
      }
      return true;
   }

   private List<String> constructBoard(char[][] board) {
      List<String> res = new LinkedList<>();
      for (char[] chars : board) {
         String s = new String(chars);
         res.add(s);
      }
      return res;
   }
}
