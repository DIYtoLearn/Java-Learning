package GFG;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word and a sentence");
        String s = sc.next();
        sc.nextLine(); // Consume leftover newline
        String Line = sc.nextLine();
        System.out.println(s +" "+ Line);
        sc.close();


        /*
        * Rule of thumb
        next() → one token (word).
        nextLine() → everything until Enter is pressed.
        * */
    }
}