package io.hexlet.project61;

class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private Even() {
    }

    public static void runGame(int maxRounds) {
        var player = Cli.greeter();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < maxRounds; i++) {
            var question = Utils.getRandom();
            var correctAnswer = isEven(question);
            Engine.checkAnswer(player, String.valueOf(question), correctAnswer);
        }
        System.out.println("Congratulation, " + player + "!");
        System.exit(0);
    }

    // Проверка числа на четность: "yes" если четное и "no" если нечетное
    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
