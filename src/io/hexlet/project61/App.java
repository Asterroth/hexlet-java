package io.hexlet.project61;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int maxRounds = 3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Cli.printMenu();
            switch (scanner.next()) {
                case "1" -> Cli.greeter();
                case "2" -> Even.runGame(maxRounds);

                //case "3":

                //case "4":

                case "5" -> Progression.runGame(maxRounds);

                //case "6":

                default -> System.exit(0);
            }
        }
    }
}