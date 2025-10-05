package Recursion;
import java.util.Scanner;

public class Rec_2 {

    static void Print_nTO1 (int n)
    {
        int c = 1;
        if(n==0)
            return;
        Print_nTO1(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Print_nTO1(N);
    }
}