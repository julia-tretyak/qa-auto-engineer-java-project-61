package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int num1 = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            int num2 = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            int gcd = calculateGcd(num1, num2);

            rounds[i][0] = num1 + " " + num2;
            rounds[i][1] = String.valueOf(gcd);
        }

        Engine.runGame("Find the greatest common divisor of given numbers.", rounds);
    }

    private static int calculateGcd(int a, int b) {
        // Алгоритм Евклида
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

