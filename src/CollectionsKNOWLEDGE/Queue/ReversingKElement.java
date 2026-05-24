package CollectionsKNOWLEDGE.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class AllDiffWays{

    static void ArrayWayOfThings(int[] arr, int k)
    {
        System.out.println("Before Array k elements reversal "+Arrays.toString(arr));

        if(k > arr.length || k <= 0)
        {
            System.out.println("Enter valid value for k");
        }

        else
        {
            int Front = 0;
            int Rear = k-1;
            while(Front < Rear) // Break Condition
            {
                // Swap
                int temp = arr[Front];
                arr[Front] = arr[Rear];
                arr[Rear] = temp;

                // Change Pointer positions
                Front++; Rear--;
            }
        }

        System.out.println("Before Array k elements reversal "+Arrays.toString(arr));
    }

    static void QueueWayOFThings(Queue<Integer> q, int k)
    {
        System.out.println("Before Queue Reversal "+q);
        if(k > q.size() || k <= 0)
        {
            System.out.println("Enter valid value for k");
        }

        else {
        ReversingOnlykElements(q, k);

        int size = q.size() - k;

        while(size -- > 0)
        {
            Integer x = q.poll();
            q.add(x);
        }

        System.out.println("After Queue Reversal "+q);}

    }

    static void ReversingOnlykElements(Queue<Integer> q, int k)
    {
        if(k==0) return;
        Integer e = q.poll();
        ReversingOnlykElements(q, k-1);
        q.add(e);

    }
}

public class ReversingKElement {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for k ");
        int k = sc.nextInt();

        int[] arr = {1,2,3,4,5};
        AllDiffWays.ArrayWayOfThings(arr, k);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);  queue.add(7);  queue.add(8);  queue.add(9);  queue.add(10);
        AllDiffWays.QueueWayOFThings(queue, k);

    }
}