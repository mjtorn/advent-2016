package org.nysv.mjt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.*;


public class Adv03P2 extends Adv03 {
    public Adv03P2(String fsPath) {
        path = Paths.get(fsPath);
    }

    protected ArrayList<String[]> getSides() {
        ArrayList<String[]> superSides = super.getSides();
        ArrayList<String[]> sides = new ArrayList<String[]>();

        String[] tmp1 = {null, null, null, null};
        String[] tmp2 = {null, null, null, null};
        String[] tmp3 = {null, null, null, null};

        for (int i=0; i<superSides.size(); i++) {
            System.out.println((i + 1) + "/" + superSides.size());
            String[] row = superSides.get(i);

            if (i > 0 && i % 3 == 0) {
                sides.add(tmp1);
                sides.add(tmp2);
                sides.add(tmp3);
                System.out.println("** pushed **");
                for (String[] s : sides) {
                    String tmpS = String.join(", ", s);
                    System.out.println("** " + tmpS);
                }

                // Avoid writing the same crap more than once because of references
                tmp1 = new String[4];
                tmp2 = new String[4];
                tmp3 = new String[4];
            }

            int idx = (i % 3) + 1;
            System.out.println("Dealing with idx " + idx);

            tmp1[idx] = row[1];
            tmp2[idx] = row[2];
            tmp3[idx] = row[3];

            System.out.println("tmp1: " + String.join(", ", tmp1));
            System.out.println("tmp2: " + String.join(", ", tmp2));
            System.out.println("tmp3: " + String.join(", ", tmp3));
        }

        // Push in the remaining data
        sides.add(tmp1);
        sides.add(tmp2);
        sides.add(tmp3);
        System.out.println("** pushed **");
        for (String[] s : sides) {
            String tmpS = String.join(", ", s);
            System.out.println("** " + tmpS);
        }

        System.out.println("sides size " + sides.size());
        return sides;
    }

    public static void main(String[] args) {
        Adv03P2 adv = new Adv03P2(args[0]);
        adv.solve();
    }
}


