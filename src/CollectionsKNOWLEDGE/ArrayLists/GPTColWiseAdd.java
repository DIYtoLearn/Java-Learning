package CollectionsKNOWLEDGE.ArrayLists;

import java.util.*;

public class GPTColWiseAdd {

    public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {

        // ✅ Edge case: null or empty input
        if (arr == null || arr.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        int rowCount = arr.size();

        // ✅ Find maximum number of columns (max row length)
        int maxColumns = 0;
        for (ArrayList<Integer> row : arr) {
            if (row != null) {
                maxColumns = Math.max(maxColumns, row.size());
            }
        }

        // ✅ Edge case: all rows empty or null
        if (maxColumns == 0) {
            throw new IllegalArgumentException("All rows are empty");
        }

        // ✅ Use primitive array for better performance
        long[] columnSums = new long[maxColumns];

        // ✅ Traverse row-wise (optimized)
        for (int i = 0; i < rowCount; i++) {
            ArrayList<Integer> row = arr.get(i);

            if (row == null) continue; // handle null rows safely

            for (int j = 0; j < row.size(); j++) {
                columnSums[j] += row.get(j);
            }
        }

        // ✅ Find minimum column sum
        long min = Long.MAX_VALUE;
        for (long sum : columnSums) {
            min = Math.min(min, sum);
        }

        return (int) min; // safe cast if within bounds
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(2, 3, 5)));
        arr.add(new ArrayList<>(Arrays.asList(1, 2)));
        arr.add(new ArrayList<>(Arrays.asList(1, 4, 5, 1)));

        int result = minimumVerticalSum(arr);
        System.out.println("Minimum Vertical Sum = " + result);
    }
}
