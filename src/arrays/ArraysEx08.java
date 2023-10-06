/*
Суперсерия Канада-СССР – это 8 товарищеских хоккейных матчей, проводившихся между командами СССР и Канады в 72 (первая суперсерия) и в 74 годах (вторая суперсерия). В этом задании вам предстоит написать функцию, которая вычисляет команду, выигравшую суперсерию.
src/main/java/io/hexlet/App.java

Реализуйте публичный статический метод getSuperSeriesWinner(), который находит команду победителя для конкретной суперсерии. Победитель определяется как команда, у которой больше побед (не количество забитых шайб) в конкретной серии. Метод принимает на вход массив, в котором каждый элемент — это массив, описывающий счет в конкретной игре (сколько шайб забила Канада и СССР). Метод должен вернуть строку — название победившей страны: "canada" или "ussr". Если суперсерия закончилась в ничью, то нужно вернуть строку "draw" (ничья).

// Первое число – сколько забила Канада
// Второе число – сколько забила СССР
int[][] scores = {
    {3, 7}, // Первая игра
    {4, 1}, // Вторая игра
    {4, 4},
    {3, 5},
    {4, 5},
    {3, 2},
    {4, 3},
    {6, 5},
};
 App.getSuperSeriesWinner(scores); // "canada"

Подсказки

    Решение учителя использует метод signum класса Integer.
 */
package arrays;
public class ArraysEx08 {
    public static void main(String[] args) {
        // Первое число – сколько забила Канада
        // Второе число – сколько забила СССР
        int[][] scores = {
                {3, 7}, // Первая игра
                {4, 1}, // Вторая игра
                {4, 4},
                {3, 5},
                {4, 5},
                {3, 2},
                {4, 3},
                {6, 5},
        };
        System.out.println(ArraysEx08.getSuperSeriesWinner(scores)); // "canada"
    }

    public static String getSuperSeriesWinner(int [][] scores) {
        int ussr = 0, canada = 0;
        for (int[] record : scores) {
            int gameResult = Integer.signum(record[0] - record[1]);
            if (gameResult > 0) {
                canada++;
            } else {
                ussr += Math.abs(gameResult);
            }
        }
        if (canada > ussr) {
            return "canada";
        } else if (canada == ussr) {
            return "draw";
        } else {
            return "ussr";
        }
    }
}

/*
Решение преподавателя

// BEGIN
    public static String getSuperSeriesWinner(int[][] scores) {
        int result = 0;
        for (int[] score: scores) {
            result += Integer.signum(score[0] - score[1]);
        }
        if (result > 0) {
            return "canada";
        }
        if (result < 0) {
            return "ussr";
        }
        return "draw";
    }
    // END
 */
