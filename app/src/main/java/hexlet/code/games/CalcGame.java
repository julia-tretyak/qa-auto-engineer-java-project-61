package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static void start() {
        String[][] rounds = new String[Engine.ROUNDS_TO_WIN][2];

        for (int i = 0; i < Engine.ROUNDS_TO_WIN; i++) {
            int num1 = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            int num2 = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            char operation = OPERATIONS[(int) (Math.random() * OPERATIONS.length)];

            int correctAnswer = calculate(num1, num2, operation);

            rounds[i][0] = num1 + " " + operation + " " + num2;
            rounds[i][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame("What is the result of the expression?", rounds);
    }

    private static int calculate(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}

