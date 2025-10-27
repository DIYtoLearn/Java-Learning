package GFG;

public class Swap_without_temp {
    public static void main(String[] args) {
        //Here we are going to swap two numbers without using a temporary variable
        int a = 15; //0101
        int b = 14; //0111
        System.out.format("Before changes a = %d, b = %d\n", a,b);

        //Bitwise XOR if corresponding bits are different, it gives 1, else it shows 0.
        // a - 0101
        // b - 0111
        // 1st - 0010 a=(a^b)
        // 2nd - 0101 b=(a^b)^b
        // 3rd - 0111 a=(a^b)
        a = (a^b);
        b = (a^b);
        a = (a^b);
        System.out.format("After changes a = %d, b = %d", a,b);
    }
}
