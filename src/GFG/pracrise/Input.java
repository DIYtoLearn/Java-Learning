package GFG.pracrise;// important Header file for the
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a work and a sentence");
        String s = sc.next();
        sc.nextLine(); // Consume leftover newline
        String Line = sc.nextLine();
        System.out.println(s +" "+ Line);

        float z = (float) Math.PI;
        String s2 = sc.next();


        sc.close();
        
    }
}
