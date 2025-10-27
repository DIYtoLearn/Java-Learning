package GFG;
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year for leap check = ");
        int year = sc.nextInt();
        String isLeap = "False";
        if(year%4==0)
        {
            //Century year check
            if(year%100==0)
            {
                if(year%400==0)
                    isLeap = "True";
                else
                    isLeap = "False";
            }
            else
                isLeap = "True";
        }
            System.out.format("The year %d isLeap = %s",year,isLeap);

    }//end of main
}// end of class