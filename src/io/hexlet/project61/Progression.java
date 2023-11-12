package io.hexlet.project61;

class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private Progression() {
    }

    public static void runGame(int maxRounds) {
        var player = Cli.greeter();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < maxRounds; i++) {
            var correctAnswer = "";
            StringBuilder sequence = new StringBuilder();
            var item = Utils.getRandom();
            var step = Utils.getRandom(1, 9);
            var unknownItem = Utils.getRandom(0, 5);
            for (int j = 0; j < 6; j++) {
                if (j != unknownItem) {
                    sequence.append(String.valueOf(item)).append(" ");
                    item += step;
                } else {
                    sequence.append(".. ");
                    correctAnswer = String.valueOf(item);
                    item += step;
                }
            }
            Engine.checkAnswer(player, String.valueOf(sequence), correctAnswer);
        }
        System.out.println("Congratulation, " + player + "!");
        System.exit(0);
    }
}
