package org.groupK;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private int roundCounter = 0;

    public TicTacToe() {
        this.player1 = new Player('X', "Player 1");
        this.player2 = new Player('O',"Player 2");
        this.currentPlayer = player1; // Spieler X beginnt
        this.board = new Board();
        this.roundCounter = 0;
    }

    public void start(Scanner in) {


        // Für US-01 läuft die Schleife so lange, bis das Board voll ist
        while (!board.isFull()) {
            System.out.println("Current Player: " + currentPlayer.getMarker());
            board.print();

            int row = -1;
            int col = -1;
            boolean validMove = false;

            while (!validMove) {
                System.out.print("row (1-3): ");
                row = in.nextInt() -1; //-1 damit der User Spalte 1-3 sieht und nicht 0-2
                System.out.print("column (1-3): ");
                col = in.nextInt() -1;//-1 damit der User Spalte 1-3 sieht und nicht 0-2

                if (board.isCellEmpty(row, col)) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Cell is already occupied or out of bounds. Try again.");
                }
            }

            // Symbol auf dem Board platzieren
            board.place(row, col, currentPlayer.getMarker());



            roundCounter++;
            if(hasWinner()){
                break;
            }

            if(isDraw()){
                break;
            }

            // Für die nächste Iteration den Spieler wechseln
            switchCurrentPlayer();

        }

        // Finale Ausgabe des Feldes
        board.print();
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private boolean hasWinner() {
        if (roundCounter < 5){
            return false;
        }

        if(checkColumnForWinner() || checkRowForWinner() || checkDiagonalForWinner()){
            System.out.println("Winner Winner Chicken Dinner! Congrats " + currentPlayer);
            return true;
        }

        return false;

    }

    public boolean checkRowForWinner(){

        for(int i = 0; i < 3; i++){
            char firstToCheck = board.getCharAtPosition(i, 1);
            if(firstToCheck == board.getCharAtPosition(i, 0) && firstToCheck == board.getCharAtPosition(i,2)){
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnForWinner(){
        for(int i = 0; i < 3; i++){
            char firstToCheck = board.getCharAtPosition(1, i);
            if(firstToCheck == board.getCharAtPosition(0, i) && firstToCheck == board.getCharAtPosition(2,i)){
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalForWinner(){
        char first = board.getCharAtPosition(1,1);
        // (0,0) == links oben (2,2) == rechts unten
        if(first == board.getCharAtPosition(0,0) && first == board.getCharAtPosition(2,2)){
            return true;
        }
        // (2,0) == links unten (2,2) == rechts oben
        if(first == board.getCharAtPosition(2,0) && first == board.getCharAtPosition(0,2)){
            return true;
        }
        return false;
    }

    private boolean isDraw(){
        if(this.roundCounter == 9){
            System.out.println("Oh no a draw!");
            return true;

        }
        return false;
    }

    public static boolean isValidYesOrNo(String input){
        String answer = input.toLowerCase();
        if(answer.equals("y") || answer.equals("n")){
            return true;
        }
        return false;
    }

}