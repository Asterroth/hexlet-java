package io.hexlet.project61;

import java.util.Scanner;

class Engine {
    public static void checkAnswer(String player,
                                   String question,
                                   String correctAnswer)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            Cli.wrongAnswer(correctAnswer, answer, player);
            System.exit(0);
        }
    }
}
