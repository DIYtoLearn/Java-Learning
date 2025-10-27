package Concepts.Classes_Objects;

class square{
    int side;
}

public class SquareDemo{
    public static void main(String[] args) {
        square objcr = new square();
        objcr.side = 10;

        int peri = 4 * objcr.side;
        System.err.println("Perimeter of the square "+peri);
    }
}