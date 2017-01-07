package org.nysv.mjt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.*;


public class Adv03P1 extends Adv03 {
    public Adv03P1(String fsPath) {
        path = Paths.get(fsPath);
    }

    public static void main(String[] args) {
        Adv03P1 adv = new Adv03P1(args[0]);
        adv.solve();
    }
}

