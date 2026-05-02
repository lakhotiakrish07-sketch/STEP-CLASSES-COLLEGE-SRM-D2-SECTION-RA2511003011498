import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + " turn");

            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter col (0-2): ");
            int col = sc.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;

                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isDraw()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
        sc.close();
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    static boolean checkWin() {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer &&
                 board[i][1] == currentPlayer &&
                 board[i][2] == currentPlayer) ||

                (board[0][i] == currentPlayer &&
                 board[1][i] == currentPlayer &&
                 board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == currentPlayer &&
             board[1][1] == currentPlayer &&
             board[2][2] == currentPlayer) ||

            (board[0][2] == currentPlayer &&
             board[1][1] == currentPlayer &&
             board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}