package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int number = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
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

