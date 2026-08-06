package GFG;

public class casting {
    public static void main(String[] args) {
        // Widening or implicit type conversion
        // byte - short - int - long - float - double
        try {
            int x = 10;
            long y = x;
            float z = y;
            System.out.println("Widening/Implicit from int to float");
            System.out.println("original variable data type is int "+x);
            System.out.println("int to long  "+y);
            System.out.println("long to float "+z+"\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Narrowing or explicit type conversion
        double d = 65.34;
        int a = (int) d;
        char c = (char) a;
        System.out.println("Narrowing/Explicit from double to char");
        System.out.println("Original variable data type is double "+d);
        System.out.println("double to int "+ a);
        System.out.println("int to char "+ c);

    }
}
