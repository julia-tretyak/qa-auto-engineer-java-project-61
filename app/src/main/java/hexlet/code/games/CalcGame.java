package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class CalcGame {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};

    private CalcGame() {
    }

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int num1 = Utils.getRandomInt(1, MAX_RANDOM_NUMBER);
            int num2 = Utils.getRandomInt(1, MAX_RANDOM_NUMBER);
            char operation = OPERATIONS[Utils.getRandomInt(0, OPERATIONS.length - 1)];
            int correctAnswer = calculate(num1, num2, operation);

            rounds[i][0] = num1 + " " + operation + " " + num2;
            rounds[i][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame("What is the result of the expression?", rounds);
    }

    private static int calculate(int a, int b, char operation) {
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}
