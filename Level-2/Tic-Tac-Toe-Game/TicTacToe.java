import java.util.Scanner;

public class TicTacToe {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printBoard();

            System.out.print("Player " + currentPlayer + ", Enter Position (1-9): ");
            int pos = sc.nextInt();

            if (pos < 1 || pos > 9 || board[pos - 1] == 'X' || board[pos - 1] == 'O') {
                System.out.println("Invalid Move!");
                continue;
            }

            board[pos - 1] = currentPlayer;

            if (checkWinner()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " Wins!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Match Draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    static boolean checkWinner() {

        int[][] win = {
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {0,3,6},
            {1,4,7},
            {2,5,8},
            {0,4,8},
            {2,4,6}
        };

        for (int[] w : win) {
            if (board[w[0]] == currentPlayer &&
                board[w[1]] == currentPlayer &&
                board[w[2]] == currentPlayer) {
                return true;
            }
        }

        return false;
    }

    static boolean isBoardFull() {
        for (char c : board) {
            if (c != 'X' && c != 'O')
                return false;
        }
        return true;
    }
}