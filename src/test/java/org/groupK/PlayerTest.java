package org.groupK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlayerTest {

    @Test
    public void testToStringReturnsPlayerOne() {
        Player player = new Player('X', "Player 1");

        assertEquals("Player 1", player.toString());
    }

    @Test
    public void testToStringReturnsPlayerTwo() {
        Player player = new Player('O', "Player 2");

        assertEquals("Player 2", player.toString());
    }
  
}