import java.util.Scanner;

class OOPSBannerApp {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean updateBoard(int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayBoard();
        System.out.print("Enter row and column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.print("Enter symbol (X/O): ");
        char symbol = sc.next().charAt(0);

        if (updateBoard(row, col, symbol)) {
            System.out.println("Board updated:");
        } else {
            System.out.println("Invalid move");
        }

        displayBoard();
    }
}