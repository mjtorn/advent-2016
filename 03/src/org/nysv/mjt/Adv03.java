package org.nysv.mjt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.*;


public abstract class Adv03 {
    protected Path path;

    protected List<Triangle> getTriangles() {
        System.out.println(path);
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                String[] splitLine = line.split("\\s+");

                int s1 = Integer.parseInt(splitLine[1]);
                int s2 = Integer.parseInt(splitLine[2]);
                int s3 = Integer.parseInt(splitLine[3]);

                Triangle t = new Triangle(s1, s2, s3);
                System.out.println(t.toString());
                triangles.add(t);
            }
            return triangles;
        } catch (IOException e) {
            e.printStackTrace();
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

