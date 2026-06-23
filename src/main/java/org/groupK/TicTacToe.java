package org.groupK;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        this.player1 = new Player('X');
        this.player2 = new Player('O');
        this.currentPlayer = player1; // Spieler X beginnt
        this.board = new Board();
    }

    public void start() {
        Scanner in = new Scanner(System.in);

        // Für US-01 läuft die Schleife so lange, bis das Board voll ist
        while (!board.isFull()) {
            System.out.println("Current Player: " + currentPlayer.getMarker());
            board.print();

            int row = -1;
            int col = -1;
            boolean validMove = false;

            while (!validMove) {
                System.out.print("row (0-2): ");
                row = in.nextInt();
                System.out.print("column (0-2): ");
                col = in.nextInt();

                if (board.isCellEmpty(row, col)) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Cell is already occupied or out of bounds. Try again.");
                }
            }

            // Symbol auf dem Board platzieren
            board.place(row, col, currentPlayer.getMarker());

            // Für die nächste Iteration den Spieler wechseln
            switchCurrentPlayer();
        }

        // Finale Ausgabe des Feldes
        board.print();
        in.close();
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private boolean hasWinner() {
        // TODO US03
        return false;
    }
}