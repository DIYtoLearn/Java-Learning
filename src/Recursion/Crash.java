package Recursion;

public class Crash {

    static int depth = 0;

    static void crashed() {
        depth++;
        crashed();
    }

    public static void main(String[] args) {
        try {
            crashed();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow at depth = " + depth);
        }
    }
}