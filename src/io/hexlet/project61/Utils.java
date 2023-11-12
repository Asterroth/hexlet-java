package io.hexlet.project61;

import java.util.Random;

class Utils {
    private static final Random randomNumber = new Random();
    private Utils() {
    }

    // Generate a random number in the range [min; max]
    public static int getRandom(int min, int max) {
        return randomNumber.nextInt(min, max);
    }
    // Generate a random number in range [0; 100)
    public static int getRandom() {
        return randomNumber.nextInt(0, 100);
    }

    // Generate a random maths operator: '*' or '+'
    public static String mathAction() { return getRandom(0, 1) == 0 ? "*" : "+"; }
}