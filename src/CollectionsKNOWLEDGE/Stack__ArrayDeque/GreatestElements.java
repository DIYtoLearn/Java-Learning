package CollectionsKNOWLEDGE.Stack__ArrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Deque;

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

    protected void ClosestGreatestElementToTheLeftUsingStack(int[] arr){

        Deque<Integer> Adq = new ArrayDeque<>();

        Adq.push(arr[0]);
        int previous_greatest_element = -1;
        System.out.print(previous_greatest_element+" ");

        for (int i=1; i<arr.length; i++) {
            while (!Adq.isEmpty() && arr[i] >= Adq.peek()) {
                Adq.pop();
            }

            previous_greatest_element = (Adq.isEmpty()) ? -1 : Adq.peek();
            System.out.print(previous_greatest_element + " ");
            Adq.push(arr[i]);
        }
    }

    protected void NextGreatestElementToTheRightUsingStack(int[] arr)
    {
        Deque<Integer> Adq2 = new ArrayDeque<>();
        Adq2.push(arr[arr.length-1]);
        int next_greatest_element = -1;
        int[] res = new int[arr.length];
        res[res.length-1] = next_greatest_element;

        for(int i=arr.length-2; i>=0; i--)
        {
            while(!Adq2.isEmpty() && arr[i] >= Adq2.peek())
            {
                Adq2.pop();
            }

            next_greatest_element = (Adq2.isEmpty()) ? -1 : Adq2.peek();
            Adq2.push(arr[i]);
            res[i] = next_greatest_element;
        }

        System.out.println(Arrays.toString(res));
    }

    protected Object[] NextGreatestElementToTheRight(int[] arr)
    {
         // Input:  arr[] = {5, 15, 10, 8, 6, 12, 7}
         // Output:           15 -1 12 12 12 -1 -1

        // Input:  arr[] = {10, 15, 20, 25}
        // Output:          15 20 25 -1

        // Input:  arr[] = {25, 20, 15, 10}
        // Output:         -1 -1 -1 -1

        ArrayList<Integer> als2 = new ArrayList<>();
        int current_element;
        int no_next_greater_element_to_the_right = -1;
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            current_element = arr[i];
            count = 0;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] > current_element) {
                    als2.add(arr[j]);
                    count++;
                    break;}
            }

            if(count == 0)
                als2.add(no_next_greater_element_to_the_right);
        }
        return als2.toArray();
    }
}

public class GreatestElements {
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        AllSolutions alsoln = new AllSolutions();
        int[] arr = {5, 15, 10, 8, 6, 12, 7};
        System.out.println(Arrays.toString(arr));
        Object[] result = alsoln.ClosestGreaterElement(arr);
        //System.out.println(Arrays.toString(result));
        Object[] arr2 = alsoln.NextGreatestElementToTheRight(arr);
        //System.out.println(Arrays.toString(arr2));
        alsoln.ClosestGreatestElementToTheLeftUsingStack(arr);
        System.out.println();
        alsoln.NextGreatestElementToTheRightUsingStack(arr);

    }
}