package org.groupK;

import org.junit.jupiter.api.Test;

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
}