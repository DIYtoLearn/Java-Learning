package Recursion;
import java.util.Scanner;

public class Rec_4 {
    static String RevString(String s1)
    {
       if(s1.isEmpty() || s1.length() == 1)
       {
           return s1;
       }

        return RevString(s1.substring(1)) + s1.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Reversing the string using recursive method named RevString
        String reversed = RevString(s);
        System.out.println(reversed);


        // Reversing the string using while loop
        int Actual_length = s.length()-1;
        String b = "";
        System.out.println(b);

        while(Actual_length>=0)
        {
            b = b+s.charAt(Actual_length);
            Actual_length--;
        }
        System.out.println(b);

    }
}

// Learn string builder and re-write this code for the same