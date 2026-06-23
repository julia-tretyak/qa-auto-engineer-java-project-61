package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class EvenGame {
    private static final int MAX_RANDOM_NUMBER = 100;

    private EvenGame() {
        // Утилитный класс
    }

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int number = Utils.getRandomInt(1, MAX_RANDOM_NUMBER);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = correctAnswer;
        }

        Engine.runGame("Answer 'yes' if the number is even, otherwise answer 'no'.", rounds);
    }
}
