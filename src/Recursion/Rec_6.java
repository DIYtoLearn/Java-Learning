package Recursion;

import java.util.Scanner;

public class Rec_6 {

    public static void main(String[] args) {
        //Fibo

        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 1;
        System.out.print("Enter the value for N: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        int temp;
        for(int i=2; i<n; i++)
        {
            arr[i] = A+B;

            if(A>0) {
            temp = A;
            A = A+B;
            B = temp; }

            else
                A=A+B;

        }

            for(int x:arr)
            {
                System.out.print(x+",");
            }
    }
}
