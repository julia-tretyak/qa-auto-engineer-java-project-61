package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class ProgressionGame {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 50;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    private ProgressionGame() {
        // Утилитный класс
    }

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int length = Utils.getRandomInt(MIN_LENGTH, MAX_LENGTH);
            int start = Utils.getRandomInt(MIN_START, MAX_START);
            int step = Utils.getRandomInt(MIN_STEP, MAX_STEP);
            int hiddenIndex = Utils.getRandomInt(0, length - 1);

            String[] progression = generateProgression(start, step, length);
            int hiddenNumber = Integer.parseInt(progression[hiddenIndex]);
            progression[hiddenIndex] = "..";

            rounds[i][0] = String.join(" ", progression);
            rounds[i][1] = String.valueOf(hiddenNumber);
        }

        Engine.runGame("What number is missing in the progression?", rounds);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
