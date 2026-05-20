package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import java.util.Scanner;

public class App {
    private static final int GREET_GAME_NUMBER = 1;
    private static final int EVEN_GAME_NUMBER = 2;
    private static final int CALC_GAME_NUMBER = 3;
    private static final int EXIT_NUMBER = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_GAME_NUMBER + " - Greet");
        System.out.println(EVEN_GAME_NUMBER + " - Even");
        System.out.println(CALC_GAME_NUMBER + " - Calc");
        System.out.println(EXIT_NUMBER + " - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case GREET_GAME_NUMBER:
                Cli.greetUser();
                break;
            case EVEN_GAME_NUMBER:
                EvenGame.start();
                break;
            case CALC_GAME_NUMBER:
                CalcGame.start();
                break;
            case EXIT_NUMBER:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
                break;
        }

        scanner.close();
    }
}

