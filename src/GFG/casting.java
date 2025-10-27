package GFG.pracrise;

public class casting {
    public static void main(String[] args) {
        // Widening or implicit type conversion
        // byte - short - int - long - float - double
        try {
            int x = 10;
            long y = x;
            float z = y;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Sab maya hai");
        }

        // Narrowing or explicit type conversion
        double d = 65.34;
        int a = (int) d;
        char c = (char) a;
        System.out.println("Explicit "+ a);
        System.out.println("Explicit "+ c);

    }
}
