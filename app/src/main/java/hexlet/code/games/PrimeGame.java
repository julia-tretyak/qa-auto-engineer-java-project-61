package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class PrimeGame {
    private static final int MAX_RANDOM_NUMBER = 100;

    private PrimeGame() {
        // Утилитный класс
    }

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int number = Utils.getRandomInt(1, MAX_RANDOM_NUMBER);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = correctAnswer;
        }

        Engine.runGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
