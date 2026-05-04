package CollectionsKNOWLEDGE.Stack__ArrayDeque;
import java.util.Arrays;
import java.util.ArrayList;

class AllSolutions
{
    protected Object[] ClosestGreaterElement(int[] arr)
    {
        // Input: arr[] = {15, 10, 18, 12, 4, 6, 2, 8}
        // Output:       -1, 15, -1, 18, 12, 12, 6, 12
        // Input: arr[] = {8, 10, 12}
        // Output:        -1, -1, -1

        ArrayList<Integer> als = new ArrayList<>();
        int current_element;
        int no_greater_element = -1;
        int count = 0;
        // Look left → find first number > current → stop
        for (int j=0; j<arr.length; j++) {
            current_element = arr[j];
            count = 0;
            for(int i=j; i>=0; i--)
            {
                if(arr[i] > current_element) {
                    als.add(arr[i]);
                    count++;
                break; }
            }
            if(count == 0)
                als.add(no_greater_element);

        }

        return als.toArray();
    }
}

public class GreatestElements {
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        AllSolutions alsoln = new AllSolutions();
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        Object[] result = alsoln.ClosestGreaterElement(arr);
        System.out.println(Arrays.toString(result));

    }
}