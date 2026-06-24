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


    @Test
    public void wonByRow(){
        TicTacToe game = new TicTacToe();

        game.getBoard().place(1,0,'X');
        game.getBoard().place(1,1,'X');
        game.getBoard().place(1,2, 'X');

        game.getBoard().print();

        assertTrue(game.checkRowForWinner());

    }


}
