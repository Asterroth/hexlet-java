package io.hexlet.project61;
import java.util.Scanner;

public class Cli {
    // Print greeter and get player name
    public static String greeter() {
        Scanner scan = new Scanner(System.in);
        String playerName;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scan.nextLine();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
    // Print menu
    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
    // Print wrong answer message
    public static void wrongAnswer(String correctAnswer, String answer, String playerName) {
        System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName);
    }
}