import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     char[][] board = new char[3][3];

     for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
            }
        }

    boolean gameOver = false;
    char currentPlayer = 'X';
    int moves = 0;

    while (!gameOver && moves < 9) {
            
     for (int i = 0; i < 3; i++) {
        System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        if (i < 2) System.out.println("-----------");
            }

    if (currentPlayer == 'X') {
        System.out.println("Player's turn");
         int row, col;
         while (true) {
             System.out.print("Enter a row (0, 1 or 2): ");
              row = input.nextInt();
              System.out.print("Enter a column (0, 1 or 2): ");
              col = input.nextInt();

     if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
          board[row][col] = 'X';
          break;
          } else {
           System.out.println("Invalid move, try again.");
             }
        }
    } 
            
    else {
       System.out.println("Computer's turn");
       int row, col;
         do {
         row = (int)(Math.random() * 3);
         col = (int)(Math.random() * 3);
        } while (board[row][col] != ' ');

        board[row][col] = 'O';
         System.out.println("Computer chose row " + row + ", column " + col);
            }

            moves++;
            boolean win = false;

      for (int i = 0; i < 3; i++) {
         if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
            (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
             win = true;
         }
    }

      if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
         (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
           win = true;
            }

      if (win) {
         for (int i = 0; i < 3; i++) {
         System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
          if (i < 2) System.out.println("-----------");
         }
         if (currentPlayer == 'X') {
             System.out.println("Game ended, Player Win");
            } else {
            System.out.println("Game ended, Computer Win");
            }
            gameOver = true;
            
   } else if (moves == 9) {
        for (int i = 0; i < 3; i++) {
         System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        if (i < 2) System.out.println("-----------");
                }
         System.out.println("Game ended, Draw");
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

    }
}
