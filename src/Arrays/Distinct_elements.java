package Arrays;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * The Solution class contains the core logic to find the number of distinct
 * elements common to all rows of a given N x N matrix.
 */
class Distinct_elements {
    /**
     * Calculates the count of distinct elements common to all rows of a matrix using a HashMap.
     * * @param M The N x N integer matrix.
     * @param N The dimension of the matrix.
     * @return The count of distinct elements present in every row.
     */
    static int distinct(int M[][], int N) {
        // Handle the edge case of an empty matrix.
        if (N == 0) {
            return 0;
        }

        // A map where the key is the matrix element and the value is the last row index it was seen in.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Initialize the map with elements from the first row (row 0).
        // For each element in the first row, we map it to the row index 0.
        for (int j = 0; j < N; j++) {
            map.put(M[0][j], 0);
        }

        // Step 2: Iterate through the remaining rows (from row 1 to N-1).
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int currentElement = M[i][j];

                // Step 3: Check if the element was present in the *immediately preceding* row.
                // The condition `map.get(currentElement) == i - 1` is key. It ensures that an
                // element has successfully appeared in all rows up to this point.
                if (map.containsKey(currentElement) && map.get(currentElement) == i - 1) {
                    // If it was, update its value to the current row index 'i'.
                    // This marks it as a valid candidate for the next row's check.
                    map.put(currentElement, i);
                }
            }
        }

        // Step 4: Count the elements that made it all the way to the last row (N-1).
        // These are the elements that are common to all rows.
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // If the element's final value is the index of the last row, it's a common element.
            if (entry.getValue() == N - 1) {
                count++;
            }
        }

        return count;
    }
}

/**
 * The Main class serves as the entry point for the program.
 * It handles user input and displays the final result.
 */
class EntryPoint {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the N x N matrix (N):");
        int N = sc.nextInt();

        // Validate the input size.
        if (N <= 0) {
            System.out.println("Matrix size must be a positive integer.");
            sc.close();
            return;
        }

        // Declare and initialize the N x N matrix.
        int[][] M = new int[N][N];

        // Prompt the user to enter the matrix elements.
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter %d elements for row %d: ", N, i + 1);
            for (int j = 0; j < N; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        // Call the static `distinct` method from the Solution class to get the result.
        int result = Distinct_elements.distinct(M, N);

        // Print the final count.
        System.out.println("\nOutput (Count of common distinct elements):");
        System.out.println(result);

        // Close the scanner to prevent resource leaks.
        sc.close();
    }
}