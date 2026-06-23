package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GcdGame {
    private static final int MAX_RANDOM_NUMBER = 100;

    private GcdGame() {
        // Утилитный класс
    }

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int num1 = Utils.getRandomInt(1, MAX_RANDOM_NUMBER);
            int num2 = Utils.getRandomInt(1, MAX_RANDOM_NUMBER);
            int gcd = calculateGcd(num1, num2);

            rounds[i][0] = num1 + " " + num2;
            rounds[i][1] = String.valueOf(gcd);
        }

        Engine.runGame("Find the greatest common divisor of given numbers.", rounds);
    }

    private static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
