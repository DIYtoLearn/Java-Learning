package Strings;
import java.util.Scanner;

class ActualChecker
{
    static boolean hasBalancedXYGroups(String s, int length)
    {
        if(s.isEmpty()) // If someone does not enter anything else error  StringIndexOutOfBoundsException
            return false;

        if(length%2 != 0 || s.charAt(0) == 'y' ) // Do not allow odd length and if the first character is Y then return false
            return false;

        int validity_counter = 0;
        int i=0; // character tracking

        while(i < length)
        {
            if(s.charAt(i) == 'x') {
                validity_counter++; //Increment the counter for x's
                i++;
            }

            else if (s.charAt(i) == 'y') {

                if(validity_counter == 0) // For cases xxyyy
                    return false;

                while (validity_counter > 0) {
                    if (i >= s.length() || s.charAt(i) != 'y') { // if the character in this while is not a y or of the length overflows then return false
                        return false;
                    }

                    validity_counter--; // Decrement the counter for y's
                    i++;
                }
            }

            else  // If the string has anything other than x or y
                return false;
        }

        return true;
    }
}

public class XnYn {
    public static void main(String[] args) {

        String check ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to be checked: ");
        check = sc.nextLine();
        int len = check.length();

        boolean res = ActualChecker.hasBalancedXYGroups(check, len);
        System.out.println(res ? check + " All good" : check + " Not all good");

    }
}