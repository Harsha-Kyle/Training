import java.util.Scanner;

public class sam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char player = 'X';

        for (int turn = 0; turn < 9; turn++) {

            printBoard(board);

            System.out.println("Player " + player + " turn");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = player;
            } else {
                System.out.println("Cell already filled! Try again.");
                turn--;
                continue;
            }

            if (checkWin(board, player)) {
                printBoard(board);
                System.out.println("Player " + player + " wins!");
                return;
            }

            if (player == 'X')
                player = 'O';
            else
                player = 'X';
        }

        printBoard(board);
        System.out.println("Game Draw!");
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
        }
        System.out.println("-------");
    }

    public static boolean checkWin(char[][] board, char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player)
                return true;

            if (board[0][i] == player &&
                    board[1][i] == player &&
                    board[2][i] == player)
                return true;
        }

        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player)
            return true;

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player)
            return true;

        return false;
    }}