package org.groupK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            TicTacToe game = new TicTacToe();
            game.start(in);

            boolean madeADecision = false;
            while (!madeADecision) {
                System.out.println("Do you want to play another one? y/n");
                String answer = in.next();
                if (TicTacToe.isValidYesOrNo(answer)) {
                    if (answer.equals("y")) {
                        madeADecision = true;
                    } else {
                        doYouWantToPlay = false;
                        madeADecision = true;
                    }
                }

            }


        }
    }
}