package Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {

        Set<Integer> newSet = new HashSet<>();

        newSet.add(10);
        newSet.add(20);
        newSet.add(10);
        newSet.add(40);

        System.out.println("Number Set: " +newSet);

        int[] arr = {3,1,2,6,2,1,3,4,5,5};
        Set<Integer> newSet2 = new HashSet<>();
        int len = arr.length;

            // To insert elements into the set the Time complexity taken is LogN
            // The total time complexity for this loop alone is NLogN
            for(int i=0; i<len; i++)
            {
                newSet2.add(arr[i]);
            }
        System.out.println("Unique Set: " +newSet2);
        System.out.print("Current Array:");
        for(int it:arr)
        {
            System.out.print(" "+it);
        }

        System.out.println();
            // For the below logic in the worst case scenario the loop will run N times if there are no duplicate elements in the array and all are unique
            // Counting the number of unique elements and modifying the array to contain only those elements at the beginning of the array
            int index = 0;
            for(Integer x:newSet2)
            {
                arr[index] = x;
                index++;
            }
            System.out.println(Arrays.toString(arr));
            System.err.println("Total number of unique elements = "+index);
    }
}

// Total Time Complexity for the code is O(NlogN+N)
// Space complexity O(N)