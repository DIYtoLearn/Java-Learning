package CollectionsKNOWLEDGE.Queue;
import java.util.Arrays;

public class ReversingKElement {
    static void main() {

        int[] arr = {1,2,3,4,5}; System.out.println(Arrays.toString(arr));
        int k = 5;
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

        System.out.println(Arrays.toString(arr));
    }
}