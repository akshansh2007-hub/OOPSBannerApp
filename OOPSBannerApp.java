import java.util.Random;

public class OOPSBannerApp {
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    static void computerMove() {
        Random random = new Random();
        int position;

        do {
            int slot = random.nextInt(9) + 1;
            position = slot - 1;
        } while (board[position] != ' ');

        board[position] = 'O';
    }

    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print(" | ");
            }
        }
    }
}