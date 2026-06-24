package org.groupK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WinningTest {

    @Test
    public void notPlayedNoWinner(){
        TicTacToe game = new TicTacToe();

        assertFalse(game.checkRowForWinner());
        assertFalse(game.checkColumnForWinner());
        assertFalse(game.checkDiagonalForWinner());
    }

    
}
