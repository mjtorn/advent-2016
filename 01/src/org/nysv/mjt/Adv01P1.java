package org.nysv.mjt;

import java.nio.file.*;

public class Adv01P1 extends Adv01 {
    public Adv01P1(String fsPath) {
        super(fsPath);
    }

    protected int solve() {
        int direction = Coordinates.NORTH;
        int x = 0;
        int y = 0;

        for (String strEntry : this.strEntries) {
            Entry entry = new Entry(direction, strEntry);
            System.out.println(entry.asString());

            Coordinates coordinates = new Coordinates(x, y);
            coordinates.parseEntry(entry);

            direction = entry.direction;
            x = coordinates.getX();
            y = coordinates.getY();
            System.out.println("landed at (" + x + "," + y + ")");
        }

        return Math.abs(x) + Math.abs(y);
    }
}

