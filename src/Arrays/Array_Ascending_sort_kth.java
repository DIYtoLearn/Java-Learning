package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Ascending_sort_kth {
    public static void main(String[] args) {
        int[] arr ={92,0,2,12,45,234,65,3,3,92,5,0,45};
//        System.out.println("Array before sorting: "+Arrays.toString(arr));

        //Selection sort
        int len = arr.length;
        int mini, temp;
        for(int i=0; i<len; i++)
        {
            mini = i;
            for(int j=i+1; j<len; j++)
            {
                if(arr[j]<arr[mini])
                    mini = j;
            }
            //Swap
            temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array after sorting: "+Arrays.toString(arr));

        // kth largest element
        // the kth largest element in the sorted order, not the kth distinct element.

            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            // 1 <= k <= arr.length
            System.out.format("The %dth largest element: "+arr[len-k],k);

            //This will work for small scale arrays's but for bigger array's we need to implement a priority queue
    }
}