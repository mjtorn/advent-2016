package org.nysv.mjt;

public class Coordinates {
    private int x;
    private int y;

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    private enum Direction {NORTH, EAST, SOUTH, WEST};

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return (this.x * 18397) + (this.y * 20483);
    }

    @Override
    public boolean equals(Object obj) {
        Coordinates other = (Coordinates) obj;
        return this.x == other.x && this.y == other.y;
    }

    public void parseEntry(Entry entry) {
        if (entry.direction == NORTH) x += entry.distance;
        else if (entry.direction == SOUTH) x -= entry.distance;
        else if (entry.direction == EAST) y += entry.distance;
        else if (entry.direction == WEST) y -= entry.distance;
        else System.out.println("WTAF!");
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

