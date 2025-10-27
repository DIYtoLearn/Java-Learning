package GFG;

public class bitwise {
    public static void main(String[] args) {
        System.out.println("Checking");
        int a = 5; int b = 4;
        // Bitwise Operators
        // Bitwise AND if both bits are 1, it gives 1, else it shows 0
        int and = a&b;
        // Bitwise OR if either of the bits is 1, it gives 1, else it shows 0
        int or = a|b;
        // bitwise XOR if corresponding bits are different, it gives 1, else it shows 0.
        int xor = a^b;
        System.out.println((5^2^5)^2);
        // The expression (5^2^5) evaluates to 2, because the XOR operator (^) is evaluated from left to right, and 5^2 results in 7, and then 7^5 results in 2.
        // Therefore, the original expression can be simplified to 2^2, which results in 0, because XOR of any number with itself results in 0. So, the final output is 0.

        // Bitwise Compliment it makes every 0 to 1, and every 1 to 0
        a = ~a;

        System.out.println(a);


        /*
        * 0101
        * 0100
        * ----
        * 0001
        * */


    }
}
