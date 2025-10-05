package Recursion;
import java.util.Scanner;

public class Factorial {

    static int Fact(int n)
    {
        // Base case
        if(n==0 || n==1) {
            return 1;
        }
        //System.out.println(n);

        return n * Fact(n-1);

    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the factorial: ");
        x = sc.nextInt();

        // x = 5 (5*4*3*2*1 = 120)
        // x = 0 (1)

        int res = Fact(x);
        System.out.println(res);

    }
}
