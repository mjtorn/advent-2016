package org.nysv.mjt;

import java.nio.file.*;
import java.util.HashSet;

public class Adv01P2 extends Adv01 {
    public Adv01P2(String fsPath) {
        super(fsPath);
    }

    protected int solve() {
        int direction = Coordinates.NORTH;
        int x = 0;
        int y = 0;

        HashSet<Coordinates> coordSet = new HashSet<Coordinates>();

        for (String strEntry : this.strEntries) {
            Entry entry = new Entry(direction, strEntry);
            System.out.println(entry.toString());

            Coordinates coordinates = new Coordinates(x, y);
            coordinates.parseEntry(entry);

            System.out.println(coordinates.hashCode());
            System.out.println("Coord count " + coordSet.size());

            direction = entry.direction;
            x = coordinates.getX();
            y = coordinates.getY();
            System.out.println("landed at (" + x + "," + y + ")");
            if (coordSet.contains(coordinates)) {
                break;
            }
            coordSet.add(coordinates);
        }

        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        Adv01P2 adv = new Adv01P2(args[0]);
        adv.run();
    }
}


