package Array_Strings;
import java.util.Scanner;

public class Array_input {
    static int x;

    public static void main(String[] args) {
        System.err.println(x);
        Scanner sc = new Scanner(System.in);
        int []a;
        a = new int[3];
        int []b = {10,11,12};
        int []c = new int[2];
        int d[] = new int[2];

        System.out.println("Enter the array elements ");
        for(int i=0; i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        //Print the array using for each
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        sc.close();


//        Invalid operation for array declaration !!
//        int[] f,k; // all variable declared after the data type int[] is of type array
//        f = new int[1];
//        k = 10; //Incompatible types. Found: 'int', required: 'int[]'
    }
}
