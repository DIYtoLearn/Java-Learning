package GFG;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
//        0 - Sunday
//        1 - Monday
//        2 - Tuesday
//        3 - Wednesday
//        4 - Thursday
//        5 - Friday
//        6 - Saturday
        // Days(n) before (d) day
        Scanner sc = new Scanner(System.in);
        int d,n;
        System.out.print("Index for Day of week = ");
        d = sc.nextInt();
        System.out.print("Before = ");
        n = sc.nextInt();
        int index = (d-n)%7;
        if(index < 0)
            index += 7;
        System.out.format("%d days before the index %d is %d",n,d,index);
        sc.close();
    }
}