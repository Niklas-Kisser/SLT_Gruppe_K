package org.groupK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean doYouWantToPlayAgain = true;

        while (doYouWantToPlayAgain) {
            TicTacToe game = new TicTacToe();
            game.start(in);

            doYouWantToPlayAgain = TicTacToe.wantToPlayAgain(in);




        }
    }
}