package Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
       int[][] board= new  int[][]{
               {3, 0, 6, 5, 0, 8, 4, 0, 0},
               {5, 2, 0, 0, 0, 0, 0, 0, 0},
               {0, 8, 7, 0, 0, 0, 0, 3, 1},
               {0, 0, 3, 0, 1, 0, 0, 8, 0},
               {9, 0, 0, 8, 6, 3, 0, 0, 5},
               {0, 5, 0, 0, 9, 0, 6, 0, 0},
               {1, 3, 0, 0, 0, 0, 2, 5, 0},
               {0, 0, 0, 0, 0, 0, 0, 7, 4},
               {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

       if (solve(board)){
           display(board);
        }else{
            System.out.println("Cannot sole");
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                  emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, the break
            if (emptyLeft == false){
                break;
            }
        }

        if (emptyLeft == true){
            return true;
            //sudoku is solved
        }

        //Backtrack
        for (int number = 1; number <= 9 ; number++) {
            if (isSafe(board ,row, col, number)){
                 board[row][col] = number;
                 if (solve(board)){
                     //sudoku is solved
                     return true;
                 }else {
                    //Backtrack
                     board[row][col] = 0;
                 }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row , int col, int num){
        //check the row
        for (int i = 0; i < board.length; i++) {
            //check if the  number is in the row
            if (board[row][col] == num){
                return false;
            }
        }
        //check the col
        for (int[] nums : board) {
            //check if the  number is in the col
            if (nums[col] == num){
                return false;
            }
        }

        int squrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % squrt;
        int colStart = col - col % squrt;

        for (int r = colStart; r < rowStart + squrt  ; r++) {
            for (int c = colStart; c < colStart + squrt; c++) {
                if (board[row][col] == num){
                    return  false;
                }
            }
        }
        return true;
    }
}
