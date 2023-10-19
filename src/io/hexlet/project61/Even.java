package io.hexlet.project61;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        game();
    }

    // Генерируем случайное число в диапазоне [min, max]
    public static int genRand() {
        int min = 0;
        int max = 1000;
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    // Проверка числа на четность: "yes" если четное и "no" если нечетное
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int number;
        var count = 0;
        while (count < 3) {
            number = genRand();
            System.out.print("Число " + number + " четное? (yes/no): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(isEven(number))) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congrats!!!");
    }
}
