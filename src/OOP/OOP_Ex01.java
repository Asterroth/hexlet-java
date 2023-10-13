package OOP;

public class OOP_Ex01 {
    public static void main(String[] args) {
        System.out.println(getSquare(10, 10, 60)); // Приблизительно 43.3
    }

    public static double getSquare(int a, int b, int alpha) {
        double sinAlpha = Math.sin(alpha * Math.PI / 180);
        double result = 0.5 * a * b * sinAlpha;
        return result;
    }
}
