package org.nysv.mjt;

public class Entry {
    private int NORTH = 0;
    private int EAST = 1;
    private int SOUTH = 2;
    private int WEST = 3;

    public int direction;
    public int distance;

    public Entry(int curDirection, String strEntry) {
        switch (strEntry.substring(0, 1)) {
            case "L":
                      direction = (curDirection >= 1) ? curDirection - 1 : WEST;
                      System.out.println("L -> " + direction);
                      break;
            case "R":
                      direction = (curDirection < 3) ? curDirection + 1 : NORTH;
                      System.out.println("R -> " + direction);
                      break;
            default: System.out.println("WTF!");
                     break;
        }

        distance = Integer.parseInt(strEntry.substring(1));
    }

    public String asString() {
        return "{Direction: " + direction + ", Distance: " + distance + "}";
    }
}

