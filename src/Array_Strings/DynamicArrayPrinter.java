package Array_Strings;

import java.util.Arrays;

/**
 * A Java program to demonstrate in-place updates of an array
 * on the terminal using the carriage return character ('\r').
 */
public class DynamicArrayPrinter {

    public static void main(String[] args) {
        // Initialize the array with the starting elements
        int[] numbers = {1, 2, 3};

        // This is a "for-each" loop, but it's set up to be an infinite loop.
        // It's a simple way to continuously perform the updates.
        while (true) {
            try {
                // Increment each element in the array by 1
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i]++;
                }

                // Format the array into a clean string for printing
                String arrayString = Arrays.toString(numbers);

                // Print the formatted string to the console.
                // The crucial part here is the '\r' (carriage return).
                // It moves the cursor to the beginning of the current line
                // without advancing to the next line.
                // This makes the next print statement overwrite the current line.
                // The '\r' must be used with 'print' and not 'println'.
                System.out.print("\r" + arrayString);

                // Pause the program for 500 milliseconds (half a second).
                // This makes the changes visible to the user.
                // Without this, the loop would run too fast to be observed.
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                // If the thread is interrupted, just print the stack trace.
                e.printStackTrace();
            }
        }
    }
}

