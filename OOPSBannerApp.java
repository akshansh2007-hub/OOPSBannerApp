class OOPSBannerApp {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == '-';
    }

    static boolean makeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (makeMove(1, 1, 'X')) {
            System.out.println("Move accepted");
        } else {
            System.out.println("Move rejected");
        }
    }
}