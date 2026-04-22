package SmallTOPICS.RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PatternGFG {
    static void main() {
        // You are given a string s of x and y. You need to verify whether the string follows the pattern (x^n y^n)
        // That is the string is valid only if equal number of y's follow equal number of x's.
        // Return 1 if valid else 0.
        // Input: s = xxyy // Output: 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern to match: ");
        String req = sc.nextLine();
        sc.close();

        Pattern pat = Pattern.compile("x{2,}y{2,}");
        Matcher mat = pat.matcher(req);

        boolean val = mat.find();
        if(val)
            System.out.println(1);
        else
            System.out.println(val);

    }
}