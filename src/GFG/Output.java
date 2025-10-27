package GFG;

public class Output {

    public static void main(String[] args) {

        String st = "GFG";
        System.out.print(st +" ");
        System.out.println("Courses");

        int x = 10, y = 20;
        System.out.println(x +" "+ y); // Converts all the values to String and prints it
        System.out.println(x + y); // Converts the addition of x+y to string and prints it
        System.out.printf("Value_of_x = %d and Value_of_y = %d\n", x, y );

        System.out.println("Test\n"+"Works!"); // Escape character \n works same as C++

        // Different type of GFG.pracrise.Output System
        // Place holders begin with % sign (%d) is for integer, (%c) is for character, (%s) is for String, (%f) is for Floating value
        float z1 = 3.1343212F;//32435353423323253f; //To specify a float literal, you must use the f or F suffix (e.g., 3.14f).
        //float is a 32-bit single-precision data type, consuming 4 bytes of memory.
        //double is a 64-bit double-precision data type, using 8 bytes of memory.
        System.out.println(z1);
        System.out.format("The value of float = %.2f", z1); // Prints 2 characters after Decimal point
        System.out.format("The value now= %07.2f\n\n", z1); // O/p = 0003.13 , Anything before the (.2f) specifies the total number of characters to be printed
        //In this case since

        // print and println are defined for all primitives types and strings
        // the printf and format output have the same meaning, they simply format the output via the help of Placeholders

        //Escape Sequence
        System.out.println("Printing double \"quotes\"");
        System.out.println("Next line and semicolon; \nPrinted");
        // Common Escape Sq (\n, \\, \")
        System.out.println("C:\"\\xyz\\\"abc.txt");

        //Is it possible to call the println() method without any arguments?
        System.out.println();
        //Methods inside the same class can call each other using just methodName() , but to call non-static methods in another class or from a main method, you must first create an object of that class and then call its methods using object. methodName() .
    }
}
