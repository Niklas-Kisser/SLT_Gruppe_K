package org.groupK;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    public void testIsValidYesOrNoReturnsTrueForY() {
        assertTrue(TicTacToe.isValidYesOrNo("y"));
    }

    @Test
    public void testIsValidYesOrNoReturnsFalseForInvalidInput() {
        assertFalse(TicTacToe.isValidYesOrNo("abc"));
    }

    @Test
    public void testWantToPlayAgainReturnsTrueForY() {
        Scanner scanner = new Scanner("y");

        assertTrue(TicTacToe.wantToPlayAgain(scanner));
    }

    @Test
    public void testWantToPlayAgainReturnsFalseForN() {
        Scanner scanner = new Scanner("n");

        assertFalse(TicTacToe.wantToPlayAgain(scanner));
    }
}