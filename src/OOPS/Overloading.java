package OOPS;
import java.util.Scanner;

public class Overloading {

    // Printer class with multiple print methods
    public static class Printer {
        //print method with string arguments
        public void print(String message) {
            System.out.println(message);
        }
        //print method with int arguments
        public void print(int number) {
            System.out.println("Number: " + number);
        }
        //print method with boolean arguments
        public void print(boolean status) {
            System.out.println("Status: " + status);
        }
    }

    // Main class
    public static void main(String[] args) {
        Printer pn = new Printer();
        pn.print(false); // Depending on the parameter type passed the relevant print method is executed
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        pn.print(s);

    }
}
