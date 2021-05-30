package com.company;

import java.time.Duration;
import java.time.Instant;

public class Main2 {
    public static void main(String[] args) {
        int xMax = 200;
        int yMax = 200;
        int zMax = 200;

        String output = "";

        Instant start = Instant.now();
        for (int x = 1; x <= xMax; x++) {
            for (int y = 1; y <= yMax; y++) {
                for (int z = 1; z <= zMax; z++) {
                    if (x * x + y * y == z * z) {
                        //output += String.format("%d^2 + %d^2= %d^2\n", x, y, z);
                        System.out.printf("%d^2 + %d^2= %d^2\n", x, y, z);
                    }
                }
            }
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        //System.out.println(output);

        System.out.println("Время занято: " + timeElapsed.toMillis() + " milliseconds");

    }
}
