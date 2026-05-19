package hexlet.code;

import java.util.Scanner;

public class EvenGame {

    private static final int ROUNDS_TO_WIN = 3;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < ROUNDS_TO_WIN) {
            int number = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            String correctAnswer = isEven(number) ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}