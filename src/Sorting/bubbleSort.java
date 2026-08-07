package Sorting;
import java.util.Arrays;

 // The anchor element will be the last element in the given range
 // The anchor element's position will change continuously from the end of the range
 // compare all the elements in pairs from the beginning up the anchor element - 1
 // Depending on DESC or ASC swap the pairs and after each element the range is sorted until the anchor element

public class bubbleSort {
    public static void main(String[] args) {

        Integer[] arr = {1055, 155, 32, 22, -24};
                //{22,155,-24,32,1055};
        int len = arr.length;
        int temp;
        boolean didSwap = false;

        for(int i=len-1; i>=0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                System.out.println(didSwap+" "+i); // Print statement to check whether the execution stopped after one iteration of the outer loop
                break;
            }
        }

        System.out.println("Sorted Range: "+Arrays.toString(arr));
    }
}