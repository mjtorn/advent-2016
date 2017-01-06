package org.nysv.mjt;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public abstract class Adv01 {
    protected Path path;

    protected String[] strEntries;

    protected abstract int solve();

    public Adv01(String fsPath) {
        this.path = Paths.get(fsPath);
    }

    protected void read() {
        try {
            List<String> lines = Files.readAllLines(path);

            // buggy shit for many lines
            lines.stream().forEach((String s) -> {
                this.strEntries = s.split(", ");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void run() {
        read();
        int distance = solve();
        System.out.println(distance);
    }
}

