package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 50;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int length = (int) (Math.random() * (MAX_LENGTH - MIN_LENGTH + 1)) + MIN_LENGTH;
            int start = (int) (Math.random() * MAX_START) + MIN_START;
            int step = (int) (Math.random() * MAX_STEP) + MIN_STEP;
            int hiddenIndex = (int) (Math.random() * length);

            String[] progression = generateProgression(start, step, length, hiddenIndex);
            int hiddenNumber = Integer.parseInt(progression[hiddenIndex]);

            progression[hiddenIndex] = "..";

            rounds[i][0] = String.join(" ", progression);
            rounds[i][1] = String.valueOf(hiddenNumber);
        }

        Engine.runGame("What number is missing in the progression?", rounds);
    }

    private static String[] generateProgression(int start, int step, int length, int hiddenIndex) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}

