/*
Точка – графический примитив на плоскости, положение которой определяется двумя координатами: по оси X и по оси Y

src/main/java/io/hexlet/App.java
В этом упражнении уже реализован класс Point, который представляет точку. Работать с точкой нужно следующим образом:

// Создание новой точки - объекта класса Point
// Первый параметр - координата точки по оси X
// Второй - координата по оси Y
var point = new Point(3, 4);
В классе App допишите публичный статический метод getNewPoint(), который возвращает новую точку
(объект класса Point) с координатами X = 5 и Y = 10

var point = App.getNewPoint(); // Переменная point содержит объект класса Point
 */

package OOP;

import java.awt.*;

public class OPP_Ex02 {
    public static void main(String[] args) {
        var point = new Point(3, 4);
    }

    public static Point getNewPoint() {
        // BEGIN (write your solution here)
        return new Point(5, 10);
        // END
    }
}
