package OOP;
import java.util.Arrays;

class OOP_Ch03 {
    public static void main(String[] args) {
        Square[] squares = SquareGenerator.generate(5, 3);
        System.out.println(Arrays.toString(squares));
    }
}

class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

class SquareGenerator {
    public static Square[] generate(double side, int quantity) {
        Square[] result = new Square[quantity];
        for (int i = 0; i < quantity; i++) {
            result[i] = new Square(side);
        }
        return result;
    }
}