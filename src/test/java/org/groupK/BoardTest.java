package org.groupK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board;

    @BeforeEach
    public void setUp() {
        // Wird vor jedem einzelnen Test ausgeführt, um ein frisches Board zu haben
        board = new Board();
    }

    @Test
    public void testNewBoardIsEmpty() {
        // Ein neues Board muss an allen Stellen leer sein
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(board.isCellEmpty(i, j), "Cell " + i + "," + j + " should be empty initially.");
            }
        }
    }

    @Test
    public void testPlaceMarkerSuccessfully() {
        // Platzieren eines Markers auf ein leeres Feld
        board.place(1, 1, 'X');

        // Das Feld darf nicht mehr leer sein
        assertFalse(board.isCellEmpty(1, 1), "Cell 1,1 should not be empty after placing a marker.");
    }

    @Test
    public void testCannotOverwriteOccupiedCell() {
        // Platziere ersten Marker
        board.place(0, 0, 'X');

        // Versuche, das gleiche Feld mit 'O' zu überschreiben
        board.place(0, 0, 'O');

        // Da das Überschreiben laut Logik verhindert werden soll, prüfen wir indirekt,
        // ob das Feld blockiert bleibt (die Platzierung schlägt fehl). Das genaue Verhalten
        // wird über die 'isCellEmpty'-Prüfung im Spiel gesteuert.
        assertFalse('O' == board.getCharAtPosition(0, 0));
    }

    @Test
    public void testOutOfBoundsMoveIsInvalid() {
        // Koordinaten außerhalb des 3x3 Feldes dürfen nicht als "leer" gewertet werden
        assertFalse(board.isCellEmpty(-1, 0), "Negative coordinates should be invalid.");
        assertFalse(board.isCellEmpty(3, 1), "Coordinates >= 3 should be invalid.");
    }

    @Test
    public void testIsFull() {
        assertFalse(board.isFull(), "Board should not be full initially.");

        // Befülle das gesamte Board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }

        assertTrue(board.isFull(), "Board should be full after filling all cells.");
    }
}