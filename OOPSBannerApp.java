import java.util.Random;

class OOPSBannerApp {
    static String player1;
    static String player2;
    static char player1Symbol;
    static char player2Symbol;
    static String currentPlayer;

    static void toss() {
        Random random = new Random();
        boolean player1Starts = random.nextBoolean();

        if (player1Starts) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }
    }

    public static void main(String[] args) {
        player1 = "Player1";
        player2 = "Player2";

        toss();

        System.out.println("First turn: " + currentPlayer);
        System.out.println("Player1 symbol: " + player1Symbol);
        System.out.println("Player2 symbol: " + player2Symbol);
    }
}