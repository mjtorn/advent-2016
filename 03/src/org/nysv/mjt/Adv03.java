package org.nysv.mjt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.*;


public abstract class Adv03 {
    protected Path path;

    protected ArrayList<String[]> getSides() {
        System.out.println(path);
        ArrayList<String[]> sides = new ArrayList<String[]>();

        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                String[] splitLine = line.split("\\s+");
                sides.add(splitLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sides;
    }

    protected List<Triangle> getTriangles(ArrayList<String[]> sides) {
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        for (String[] side : sides) {
            int s1 = Integer.parseInt(side[1]);
            int s2 = Integer.parseInt(side[2]);
            int s3 = Integer.parseInt(side[3]);

            Triangle t = new Triangle(s1, s2, s3);
            System.out.println(t.toString());
            triangles.add(t);
        }
        return triangles;
    }

    protected long solve() {
        List<Triangle> triangles = getTriangles(getSides());
        System.out.println(triangles.size());
        long count = triangles.stream().filter((Triangle t) -> t.isPossible()).count();
        System.out.println(count);
        return count;
    }
}

