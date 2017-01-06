package org.nysv.mjt;

import java.nio.file.*;

/**
 * public class Adv01P1Run extends Adv01P1 {
       ^
  required: String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
public class Adv01P1Run extends Adv01P1 {
    public static void main(String[] args) {
        Adv01P1 adv = new Adv01P1(args[0]);
        adv.run();
    }
}

