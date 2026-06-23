package org.groupK;

public class Board {
    private char[][] cells;

    public Board() {
        // Tic-Tac-Toe Feld mit einem 3x3 Feld
        cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y) {
        // Prüfen, ob die Koordinaten im gültig sind
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            return false;
        }
        // Wenn das Feld ein Leerzeichen ist,
        return cells[x][y] == ' ' || cells[x][y] == '\u0000';
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == ' ' || cells[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = ' ';
            }
        }
    }

    public char getCharAtPosition(int x, int y){
        return this.cells[x][y];

    }


    public void print() {
        System.out.println("_____");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("_____");
    }
}