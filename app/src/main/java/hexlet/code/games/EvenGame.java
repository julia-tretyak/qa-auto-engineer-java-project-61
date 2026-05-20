package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int number = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = correctAnswer;
        }

        Engine.runGame("Answer 'yes' if the number is even, otherwise answer 'no'.", rounds);
    }
}

