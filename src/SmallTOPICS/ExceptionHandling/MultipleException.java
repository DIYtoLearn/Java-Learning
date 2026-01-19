package SmallTOPICS.ExceptionHandling;

class MultipleShowcase {

    // I added a parameter so we can choose which error to trigger for demonstration
    static void ErrorLinesOfCodes(int choice) {
        if (choice == 1) {
            int a = 10;
            int b = 0;
            int z = a / b; // This throws ArithmeticException
        }
        else if (choice == 2) {
            int[] arr = new int[2];
            arr[5] = 9; // This throws ArrayIndexOutOfBoundsException
        }
    }

    static void ExceptionHandling() {
        // We try to run code that might fail
        try {
            // Change this to 1 to see Arithmetic, 2 to see Array error
            ErrorLinesOfCodes(2);
        }
        // 1. Handle Math Errors
        catch (ArithmeticException e) {
            System.out.println("Specific Catch: You cannot divide by zero.");
        }
        // 2. Handle Array Errors
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specific Catch: You accessed an index that doesn't exist.");
        }
        // 3. Handle Everything Else (The Safety Net)
        catch (Exception e) {
            System.out.println("Generic Catch: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block: This runs no matter what.");
        }
    }
}

/*
* Key Rules to Remember
Hierarchy Matters: If you have a catch block for Exception (the parent class), it must come last.
If you put catch (Exception e) first, it will catch everything, and the specific blocks below it will become "unreachable code" (causing a compile error).

One Exception Per Try: As mentioned, once the division by zero happens, the program exits the try block. It will never run the array line in the same execution pass.
* */

public class MultipleException {
    public static void main(String[] args) {
        MultipleShowcase.ExceptionHandling();


        //Checking the Heirarchy rule
        try {
            int z = 10 / 0; // Throws ArithmeticException
        }
        // ❌ WRONG: This catches EVERYTHING (Arithmetic, Array, NullPointer, etc.)
        catch (Exception e) {
            System.out.println("I caught the exception!");
        }
        // ❌ DEAD CODE: The compiler knows execution can NEVER reach here and throws an un compileable error message that states
        // java: exception java.lang.ArithmeticException has already been caught
//        catch (ArithmeticException e) {
//            System.out.println("This will never print.");
//        }
    }
}