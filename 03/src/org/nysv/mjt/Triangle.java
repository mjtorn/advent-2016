package org.nysv.mjt;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Triangle {
    private int s1;
    private int s2;
    private int s3;

    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String toString() {
        return s1 + "," + s2 + "," + s3;
    }

    public boolean isPossible() {
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2)) {
            return true;
        }
        return false;
    }
}


