package org.groupK;

public class Player {
    private char marker;
    private String name;

    public Player(char marker, String name) {
        this.marker = marker; this.name = name;
    }

    public char getMarker() {
        return marker;
    }

    @Override
    public String toString() {
        return name;
    }
}


