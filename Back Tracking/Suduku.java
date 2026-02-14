class Solution {
    public void solveSudoku(char[][] board) {
        sudokuSolve(board, 0, 0);
    }

    private boolean sudokuSolve(char[][] board, int row, int col) {
        // Base case: If we reach row 9, the board is filled
        if (row == 9) return true;

        // Calculate next cell coordinates
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;

        // Skip if cell is already filled
        if (board[row][col] != '.') {
            return sudokuSolve(board, nextRow, nextCol);
        }

        // Try placing digits '1' to '9'
        for (char dig = '1'; dig <= '9'; dig++) {
            if (isSafe(board, row, col, dig)) {
                board[row][col] = dig;
                if (sudokuSolve(board, nextRow, nextCol)) {
                    return true;
                }
                // Backtrack
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char dig) {
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[i][col] == dig) return false;
            // Check column
            if (board[row][i] == dig) return false;
            // Check 3x3 grid
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;
            if (board[r][c] == dig) return false;
        }
        return true;
    }
}